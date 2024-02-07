package com.gildedrose.objects

case class Quality(var value: Int) {
  def reduce(): Quality = Quality(this.value - 1)
}
