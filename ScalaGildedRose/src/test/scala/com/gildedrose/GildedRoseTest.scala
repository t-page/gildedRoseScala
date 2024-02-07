package com.gildedrose

import com.gildedrose.objects.{Item, Quality, SellIn}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GildedRoseTest  extends AnyFlatSpec with Matchers {
      it should "foo" in {
        val items = Array(Item("foo", SellIn(0), Quality(0)))
        val app = GildedRose(items)
        app.updateQuality()
        app.items(0).name should equal ("foo")
      }
}