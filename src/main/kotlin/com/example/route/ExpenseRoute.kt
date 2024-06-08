package com.example.route

import com.example.data.model.expenses
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.expensesRouting() {

    get("/expenses") {
        if(expenses.isEmpty()){
            call.respondText { "No expenses found" }
        }else {
            call.respond(status = HttpStatusCode.OK, expenses)
        }
    }
}