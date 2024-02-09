package com.gildedrose.objects.items

import com.gildedrose.objects.items.Item.ConjuredConst
import com.gildedrose.objects.{Quality, SellIn}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ConjuredTest extends AnyFlatSpec with Matchers {
  it should "decreases quality twice as fast" in {
    val conjured = Conjured(ConjuredConst, SellIn(4), Quality(4))

    conjured.quality.reduceX2() should equal(Quality(2))
  }
}
