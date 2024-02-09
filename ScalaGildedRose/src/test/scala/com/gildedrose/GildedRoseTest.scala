package com.gildedrose

import com.gildedrose.objects.items.Item.{BackstageConst, ConjuredConst, SulfurasConst}
import com.gildedrose.objects.items.{AgedBrie, Backstage, Conjured, Item, Normal, Sulfuras}
import com.gildedrose.objects.{Quality, SellIn, items}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GildedRoseTest  extends AnyFlatSpec with Matchers {
      it should "not reduce sellIn or quality below 0" in {
        val items: Array[Item] = Array(Normal("foo", SellIn(0), Quality(0)))

        val result = updateQuality(items)

        result(0).sellIn.value should equal (0)
        result(0).quality.value should equal (0)
      }

      it should "reduce sellIn and quality by 1" in {
        val item = items.Normal("foo", SellIn(1), Quality(1))

        val result = updateQuality(Array(item))

        result(0).sellIn.value should equal (0)
        result(0).quality.value should equal (0)
      }

      it should "increase quality if AgedBrie" in {
        val item = items.AgedBrie("Aged Brie", SellIn(1), Quality(1))

        val result = updateQuality(Array(item))

        result(0).sellIn.value should equal (0)
        result(0).quality.value should equal (2)

      }

      it should "not increase quality above 50" in {
        val item = items.AgedBrie("foo", SellIn(1), Quality(50))

        val result = updateQuality(Array(item))

        result(0).sellIn.value should equal (0)
        result(0).quality.value should equal (50)
      }

      it should "not change sellIn or quality of Sulphuras" in {
        val item = items.Sulfuras(SulfurasConst, SellIn(1), Quality(1))

        val result = updateQuality(Array(item))

        result(0).sellIn.value should equal (1)
        result(0).quality.value should equal (1)
      }

      it should "increase quality of Backstage by 2X when SellIn == 10 days or less" in {
        val originalQuality = Quality(2)
        val item = items.Backstage(BackstageConst, SellIn(9), Quality(2))

        val result = updateQuality(Array(item))

        result(0).sellIn.value should equal (8)
        result(0).quality.value should equal (originalQuality.value + 2)
      }

      it should "increase quality of Backstage by 3X when SellIn == 5 days or less" in {
        val originalQuality = Quality(2)
        val item = items.Backstage(BackstageConst, SellIn(4), Quality(2))

        val result = updateQuality(Array(item))

        result(0).sellIn.value should equal (3)
        result(0).quality.value should equal (originalQuality.value + 3)
      }

      it should "decrease quality of Backstage to 0 if sellIn == 0" in {
        val originalQuality = Quality(2)
        val item = items.Backstage(BackstageConst, SellIn(0), Quality(2))

        val result = updateQuality(Array(item))

        result(0).sellIn.value should equal (0)
        result(0).quality.value should equal (0)
      }

      it should "decreases quality twice as fast as other items" in {
        val conjured = Conjured(ConjuredConst, SellIn(4), Quality(4))
        val normal = Normal("tingMe", SellIn(4), Quality(4))
    
        val result = updateQuality(Array(conjured, normal))
    
        result(0).quality.value should equal(2)
        result(1).quality.value should equal(3)
      }
}