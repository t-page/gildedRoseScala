package com.gildedrose.objects.items

import com.gildedrose.objects.{Quality, SellIn}

case class AgedBrie(
                     override val name: String = Item.AgedBrieConst,
                     override val sellIn: SellIn,
                     override val quality: Quality
                   ) extends Item(name: String, sellIn: SellIn, quality: Quality) {
  def handleAgedBrie: AgedBrie = {
    this.quality.value match
      case 50 => AgedBrie(this.name, this.sellIn.reduce, Quality(50))
      case _ => AgedBrie(this.name, this.sellIn.reduce, this.quality.increase())
  }
}
