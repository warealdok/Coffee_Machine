package machine

class CoffeeMachine {
    private var currentAmountOfWater = 400
    private var currentAmountOfMilk = 540
    private var currentAmountOfCoffeeBeans = 120
    private var currentAmountOfCups = 9
    private var currentAmountOfMoney = 550

    private var inputFromUser = ""

    fun askForAction() {
        while (inputFromUser != "exit") {
            println("Write action (buy, fill, take, remaining, exit):")
            actionHandler(readln())
        }
    }

    private fun actionHandler(action: String) {
        when (action) {
            "buy" -> buyDrink()
            "fill" -> fillTheMachine()
            "take" -> takeTheMoney()
            "remaining" -> showCurrentSupply()
            "exit" -> inputFromUser = "exit"
            else -> println("Error! Unknown action")
        }
    }

    private fun showCurrentSupply() {
        println()
        println("The coffee machine has:")
        println("$currentAmountOfWater ml of water")
        println("$currentAmountOfMilk ml of milk")
        println("$currentAmountOfCoffeeBeans g of coffee beans")
        println("$currentAmountOfCups disposable cups")
        println("\$$currentAmountOfMoney of money")
        println()
    }

    private fun espressoRoute() {
        val missingIngredient: String
        if (currentAmountOfWater < 250) {
            missingIngredient = "water"
            println("Sorry, not enough $missingIngredient")
        } else if (currentAmountOfCoffeeBeans < 16) {
            missingIngredient = "coffee beans"
            println("Sorry, not enough $missingIngredient")
        } else if (currentAmountOfCups < 1) {
            missingIngredient = "cups"
            println("Sorry, not enough $missingIngredient")
        } else {
            println("I have enough resources, making you a coffee!")
            currentAmountOfWater -= 250
            currentAmountOfCoffeeBeans -= 16
            currentAmountOfCups -= 1
            currentAmountOfMoney += 4
        }
    }

    private fun latteRoute() {
        val missingIngredient: String
        if (currentAmountOfWater < 350) {
            missingIngredient = "water"
            println("Sorry, not enough $missingIngredient")
        } else if (currentAmountOfMilk < 75) {
            missingIngredient = "milk"
            println("Sorry, not enough $missingIngredient")
        } else if (currentAmountOfCoffeeBeans < 20) {
            missingIngredient = "coffee beans"
            println("Sorry, not enough $missingIngredient")
        } else if (currentAmountOfCups < 1) {
            missingIngredient = "cups"
            println("Sorry, not enough $missingIngredient")
        } else {
            println("I have enough resources, making you a coffee!")
            currentAmountOfWater -= 350
            currentAmountOfMilk -= 75
            currentAmountOfCoffeeBeans -= 20
            currentAmountOfCups -= 1
            currentAmountOfMoney += 7
        }
    }

    private fun cappuccinoRoute() {
        val missingIngredient: String
        if (currentAmountOfWater < 200) {
            missingIngredient = "water"
            println("Sorry, not enough $missingIngredient")
        } else if (currentAmountOfMilk < 100) {
            missingIngredient = "milk"
            println("Sorry, not enough $missingIngredient")
        } else if (currentAmountOfCoffeeBeans < 12) {
            missingIngredient = "coffee beans"
            println("Sorry, not enough $missingIngredient")
        } else if (currentAmountOfCups < 1) {
            missingIngredient = "cups"
            println("Sorry, not enough $missingIngredient")
        } else {
            println("I have enough resources, making you a coffee!")
            currentAmountOfWater -= 200
            currentAmountOfMilk -= 100
            currentAmountOfCoffeeBeans -= 12
            currentAmountOfCups -= 1
            currentAmountOfMoney += 6
        }
    }

    private fun buyDrink() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        when (readln()) {
            "1" -> espressoRoute()
            "2" -> latteRoute()
            "3" -> cappuccinoRoute()
            "back" -> askForAction()
            else -> println("Wrong input!")
        }
    }

    private fun fillTheMachine() {
        println("Write how many ml of water you want to add:")
        currentAmountOfWater += readln().toInt()
        println("Write how many ml of milk you want to add:")
        currentAmountOfMilk += readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        currentAmountOfCoffeeBeans += readln().toInt()
        println("Write how many disposable cups you want to add:")
        currentAmountOfCups += readln().toInt()
    }

    private fun takeTheMoney() {
        println("I gave you \$$currentAmountOfMoney")
        currentAmountOfMoney = 0
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine()
    coffeeMachine.askForAction()
}