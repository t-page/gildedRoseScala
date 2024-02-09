package com.gildedrose

import com.gildedrose.objects.items
import com.gildedrose.objects.items.{AgedBrie, Backstage, Conjured, Item, Normal, Sulfuras}
 def updateQuality(items: Array[Item]): Array[Item] = {
   items.map {
     case item@Backstage(name, sellIn, quality) => item.handleBackstage
     case item@Sulfuras(name, sellIn, quality) => item.handleSulfuras
     case item@AgedBrie(name, sellIn, quality) => item.handleAgedBrie
     case item@Normal(name, sellIn, quality) => item.handleNormal
     case item@Conjured(name, sellIn, quality) => item.handleConjured
   }
 }