package com.gildedrose.objects.items

import com.gildedrose.objects.SellIn
import com.gildedrose.objects.Quality

trait Item(val name: String, val sellIn: SellIn, val quality: Quality)
object Item {
  val AgedBrieConst = "Aged Brie"
  val BackstageConst = "Backstage passes to a TAFKAL80ETC concert"
  val SulfurasConst = "Sulfuras, Hand of Ragnaros"
  val ConjuredConst = "Conjured Mana Cake"
}