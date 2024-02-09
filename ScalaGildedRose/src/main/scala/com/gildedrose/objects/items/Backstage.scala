package com.gildedrose.objects.items

import com.gildedrose.objects.{Quality, SellIn}

case class Backstage(
                      override val name: String = Item.BackstageConst,
                      override val sellIn: SellIn,
                      override val quality: Quality
                    ) extends Item(name: String, sellIn: SellIn, quality: Quality) {
  def handleBackstage: Backstage = {
    this.sellIn.value match
      case it if 6 until 10 contains it => Backstage(this.name, SellIn(this.sellIn.value - 1), Quality(this.quality.value + 2))
      case it if 1 until 5 contains it => Backstage(this.name, SellIn(this.sellIn.value - 1), Quality(this.quality.value + 3))
      case 0 => Backstage(this.name, SellIn(0), Quality(0))
      case _ => Backstage(this.name, SellIn(this.sellIn.value - 1), Quality(this.quality.value + 1))
  }
}
