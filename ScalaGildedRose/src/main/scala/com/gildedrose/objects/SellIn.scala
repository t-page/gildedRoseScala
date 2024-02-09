package com.gildedrose.objects

case class SellIn(value: Int) {
  def reduce: SellIn = SellIn(this.value - 1)
}