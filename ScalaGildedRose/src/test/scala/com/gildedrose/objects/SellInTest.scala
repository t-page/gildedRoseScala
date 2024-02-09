package com.gildedrose.objects;

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SellInTest extends AnyFlatSpec with Matchers {
    it should "reduce the sellIn by one" in {
        SellIn(2).reduce.value should equal(1)
    }
}