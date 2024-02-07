package com.gildedrose.objects

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ItemTest extends AnyFlatSpec with Matchers {
  it should "return true if is aged brie" in {
    Item("Aged Brie", SellIn(1), Quality(2)).isAgedBrie should equal (true)
  }

  it should "return false if is not aged brie" in {
    Item("Beenie Bango", SellIn(1), Quality(2)).isAgedBrie should equal(false)
  }

  it should "return true if is Backstage passes to a TAFKAL80ETC concert" in {
    Item("Backstage passes to a TAFKAL80ETC concert", SellIn(1), Quality(2)).isTAFKAL80ETCConcert should equal(true)
  }

  it should "return false if is not Backstage passes to a TAFKAL80ETC concert" in {
    Item("Freedddoooommmm", SellIn(1), Quality(2)).isTAFKAL80ETCConcert should equal(false)
  }

  it should "return true if is Sulfuras, Hand of Ragnaros" in {
    Item("Sulfuras, Hand of Ragnaros", SellIn(1), Quality(2)).isSulfuras should equal(true)
  }

  it should "return false if is not Sulfuras, Hand of Ragnaros" in {
    Item("Yyeeahahah", SellIn(1), Quality(2)).isSulfuras should equal(false)
  }
}
