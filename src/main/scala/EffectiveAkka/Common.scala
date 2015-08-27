package EffectiveAkka

import akka.actor.Actor

// Created by ZG on 15/8/27.
//

case class GetCustomerAccountBalances(id: Long)
case class AccountBalances(
                            checking: Option[List[(Long, BigDecimal)]],
                            savings: Option[List[(Long, BigDecimal)]],
                            moneyMarket: Option[List[(Long, BigDecimal)]])
case class CheckingAccountBalances(
                                    balances: Option[List[(Long, BigDecimal)]])
case class SavingsAccountBalances(
                                   balances: Option[List[(Long, BigDecimal)]])
case class MoneyMarketAccountBalances(
                                       balances: Option[List[(Long, BigDecimal)]])

trait SavingsAccountsProxy extends Actor
trait CheckingAccountsProxy extends Actor
trait MoneyMarketAccountsProxy extends Actor

