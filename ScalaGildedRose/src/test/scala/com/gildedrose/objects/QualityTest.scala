package com.gildedrose.objects

import com.gildedrose
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class QualityTest extends AnyFlatSpec with Matchers {
  it should "reduce the quality by one" in {
    val quality = Quality(2)
    val newQuality = quality.reduce()

    newQuality.value should equal (quality.value - 1)
  }

  it should "reduce the quality by two" in {
    val quality = Quality(2)
    val newQuality = quality.reduceX2()

    newQuality.value should equal(quality.value - 2)
  }

  it should "increase the quality by one" in {
    val quality = Quality(2)
    val newQuality = quality.increase()

    newQuality.value should equal(quality.value + 1)
  }
}
