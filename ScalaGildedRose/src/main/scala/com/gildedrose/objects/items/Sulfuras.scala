package com.gildedrose.objects.items

import com.gildedrose.objects.{Quality, SellIn}

case class Sulfuras(
                     override val name: String = Item.SulfurasConst,
                     override val sellIn: SellIn,
                     override val quality: Quality
                   ) extends Item(name: String, sellIn: SellIn, quality: Quality) {
  def handleSulfuras: Item = this
}
