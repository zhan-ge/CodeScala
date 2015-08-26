package ProgrammingScala2Ed.Implicits

// Created by ZG on 15/8/25.
// 

object TestImplicitArguments extends App{

  def calcTax(amount:Float)(implicit rate:Float):Float = amount * rate
//  implicit val currentTaxRate = 0.08F
//  val tax = calcTax(50000f)
//  println("tax = " + tax)

//  import SimpleStateSalesTax.rate
//  val amount = 100F
//  println(s"Tax on $amount = ${calcTax(amount)}")

  import ComplicatedSalesTax.rate
  implicit val myStore = ComplicatedSalesTaxData(0.06F, isTaxHoliday = false, 1010)
  val amount = 100F
  println(s"Tax on $amount = ${calcTax(amount)}")

}

object SimpleStateSalesTax{
  implicit val rate:Float = 0.05F
}

case class ComplicatedSalesTaxData(baseRate:Float, isTaxHoliday:Boolean, storeId:Int)

object ComplicatedSalesTax{
  private def extraTaxRateForStore(id:Int):Float = {
    // From id, determine location, then extra taxes...
    0.0F
  }

  implicit def rate(implicit cstd:ComplicatedSalesTaxData):Float =
  if (cstd.isTaxHoliday) 0.0F
  else cstd.baseRate + extraTaxRateForStore(cstd.storeId)
}