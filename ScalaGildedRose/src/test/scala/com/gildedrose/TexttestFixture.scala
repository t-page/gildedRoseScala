package com.gildedrose

import com.gildedrose.objects.{Item, Quality, SellIn}

object TexttestFixture {
  def main(args: Array[String]): Unit = {
    val items = Array[Item](
      Item("+5 Dexterity Vest", SellIn(10), Quality(20)),
      Item("Aged Brie", SellIn(2), Quality(0)),
      Item("Elixir of the Mongoose", SellIn(5), Quality(7)),
      Item("Sulfuras, Hand of Ragnaros", SellIn(0), Quality(80)),
      Item("Sulfuras, Hand of Ragnaros", SellIn(-1), Quality(80)),
      Item("Backstage passes to a TAFKAL80ETC concert", SellIn(15), Quality(20)),
      Item("Backstage passes to a TAFKAL80ETC concert", SellIn(10), Quality(49)),
      Item("Backstage passes to a TAFKAL80ETC concert", SellIn( 5), Quality(49)),
      // this conjured item does not work properly yet
      Item("Conjured Mana Cake", SellIn(3), Quality(6))
    )
    val app = GildedRose(items)
    val days = if (args.length > 0) args(0).toInt + 1 else 2

    for (i <- 0 until days) {
      println("-------- day " + i + " --------")
      println("name, sellIn, quality")
      items.foreach { item => println(item.name + ", " + item.sellIn + ", " + item.quality) }
      println()
      app.updateQuality()
    }
  }
}
