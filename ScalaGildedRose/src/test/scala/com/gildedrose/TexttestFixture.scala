package com.gildedrose

import com.gildedrose.objects.items.Item.{AgedBrieConst, BackstageConst, SulfurasConst}
import com.gildedrose.objects.items.{AgedBrie, Backstage, Item, Normal, Sulfuras}
import com.gildedrose.objects.{Quality, SellIn}

object TexttestFixture {
  def main(args: Array[String]): Unit = {
    val items = Array[Item](
      Normal("+5 Dexterity Vest", SellIn(10), Quality(20)),
      AgedBrie(AgedBrieConst, SellIn(2), Quality(0)),
      Normal("Elixir of the Mongoose", SellIn(5), Quality(7)),
      Sulfuras(SulfurasConst, SellIn(0), Quality(80)),
      Sulfuras(SulfurasConst, SellIn(-1), Quality(80)),
      Backstage(BackstageConst, SellIn(15), Quality(20)),
      Backstage(BackstageConst, SellIn(10), Quality(49)),
      Backstage(BackstageConst, SellIn( 5), Quality(49)),
      // this conjured item does not work properly yet
      Normal("Conjured Mana Cake", SellIn(3), Quality(6))
    )
    val days = if (args.length > 0) args(0).toInt + 1 else 2

    for (i <- 0 until days) {
      println("-------- day " + i + " --------")
      println("name, sellIn, quality")
      items.foreach { item => println(item.name + ", " + item.sellIn + ", " + item.quality) }
      println()
      updateQuality(items)
    }
  }
}
