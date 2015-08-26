package CookCode.ControlStructures

// Created by ZG on 15/7/31.
// 

object UsingaorLoopwithEmbeddedifStatements extends App{

  for (i <- 1 to 10 if i % 2 == 0) println(i)

  for {
    i <- 1 to 10
    if i % 2 == 0
  } println(i)

  for {
    i <- 1 to 10
    if i > 3
    if i < 6
    if i % 2 == 0
  } println(i)

}
