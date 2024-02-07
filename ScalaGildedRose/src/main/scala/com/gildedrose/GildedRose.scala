package com.gildedrose

import com.gildedrose.objects.Item

class GildedRose(val items: Array[Item]) {


  def updateQuality() = {
    items.foreach { item =>
      if (!item.isAgedBrie && !item.isTAFKAL80ETCConcert) {
        if (item.quality.value > 0) {
          if (!item.isSulfuras) {
            item.quality.reduce()
          }
        }
      } else {
        if (item.quality.value < 50) {
          item.quality.value = item.quality.value + 1

          if (item.isTAFKAL80ETCConcert) {
            if (item.sellIn.value < 11) {
              if (item.quality.value < 50) {
                item.quality.value = item.quality.value + 1
              }
            }

            if (item.sellIn.value < 6) {
              if (item.quality.value < 50) {
                item.quality.value = item.quality.value + 1
              }
            }
          }
        }
      }

      if (!item.isSulfuras) {
        item.sellIn.value = item.sellIn.value - 1
      }

      if (item.sellIn.value < 0) {
        if (!item.isAgedBrie) {
          if (!item.isTAFKAL80ETCConcert) {
            if (item.quality.value > 0) {
              if (!item.isSulfuras) {
                item.quality.reduce()
              }
            }
          } else {
            item.quality.reduce()
          }
        } else {
          if (item.quality.value < 50) {
            item.quality.value = item.quality.value + 1
          }
        }
      }
    }
  }
}