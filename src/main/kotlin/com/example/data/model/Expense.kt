package com.example.data.model

import kotlinx.serialization.Serializable


val expenses = mutableListOf(

    Expense(id=0, amount = 70.0, "GROCERIES",  "Weekly buy"),
    Expense(id=1, amount = 10.0, "SNACK",  "Homies"),
    Expense(id=2, amount = 21000.0, "CAR",  "Audi A1"),
    Expense(id=3, amount = 15.0, "COFEE",  "Beans and cream"),
    Expense(id=4, amount = 25.0, "PARTY",  "Weekend party"),
    Expense(id=5, amount = 120.0, "HOUSE",  "Expenses"),
    Expense(id=6, amount = 25.0, "OTHER",  "CLEANING"),
)
var lastExpense =  expenses.size.toLong()
@Serializable
data class Expense(
    val id: Long = lastExpense++,
    val amount: Double,
    val categoryName: String,
    val description: String
)