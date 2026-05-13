package com.example.financeapp.data.model

enum class ExpenseCategory (val displayName: String){
    FOOD(displayName = "Alimentacion"),
    TRANSPORT(displayName = "Transporte"),
    ENTERTAINMENT(displayName = "Entenimiento"),
    BILLS(displayName = "Servicios"),
    SHOPPING(displayName = "Compras"),
    HEALTH(displayName = "Salud"),
    EDUCATION(displayName = "Educacion"),
    Travel(displayName = "Viajes"),
    OTHER(displayName = "Otros")
}