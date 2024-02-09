package com.gildedrose.objects.items

import com.gildedrose.objects.{Quality, SellIn}


case class Normal(
                   override val name: String,
                   override val sellIn: SellIn,
                   override val quality: Quality
                 ) extends Item(name: String, sellIn: SellIn, quality: Quality) {
  def handleNormal: Normal = {
    (this.sellIn.value, this.quality.value) match
      case (0, 0) => Normal(this.name, SellIn(0), Quality(0))
      case _ => Normal(this.name, this.sellIn.reduce, this.quality.reduce())
  }
}
