package com.gildedrose.objects

case class Quality(value: Int) {
  def reduce(): Quality = Quality(this.value - 1)
  def reduceX2(): Quality = Quality(this.value - 2)
  def increase(): Quality = Quality(this.value + 1)
}
