package com.gildedrose.objects.items

import com.gildedrose.objects.items.Item.ConjuredConst
import com.gildedrose.objects.{Quality, SellIn}

case class Conjured(
                     override val name: String = ConjuredConst,
                     override val sellIn: SellIn,
                     override val quality: Quality
                   ) extends Item(name: String, sellIn: SellIn, quality: Quality) {
  def handleConjured: Conjured = Conjured(this.name, this.sellIn.reduce, this.quality.reduceX2())
}
