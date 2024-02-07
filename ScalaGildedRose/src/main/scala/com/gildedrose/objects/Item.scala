package com.gildedrose.objects

case class Item(name: String, var sellIn: SellIn, var quality: Quality) {
  def isAgedBrie: Boolean = this.name.equals("Aged Brie")
  
  def isTAFKAL80ETCConcert: Boolean = this.name.equals("Backstage passes to a TAFKAL80ETC concert")

  def isSulfuras: Boolean = this.name.equals("Sulfuras, Hand of Ragnaros")
}

