
// Created by ZG on 15/7/8.
// 

object TicTacToe {
  def main(args: Array[String]) {
    val grid = new Grid
    println("grid.play('X', 1, 1) = " + grid.play('X', 1, 1))
    println("grid.play('X', 1, 1) = " + grid.play('X', 1, 1))
    println("grid.play('O', 1, 3) = " + grid.play('O', 1, 3))
  }

}

class Cell {
  var entry = ' '
  def set(e:Char):String = {
    if (entry==' ' && (e=='X' || e=='O')){
      entry = e
      "successful move"
    }
    else{
      "invalid move"
    }
  }
}

class Grid {
  val cells = Vector(
  Vector(new Cell, new Cell, new Cell),
  Vector(new Cell, new Cell, new Cell),
  Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int):String = {
    if(x<0 || x>2 || y<0 || y>2)
      "invalid move"
    else
      cells(x)(y).set(e)
  }
}