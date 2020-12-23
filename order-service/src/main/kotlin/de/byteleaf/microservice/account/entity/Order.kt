package de.byteleaf.microservice.account.entity

data class Order(val id: String, val title: String, val account: Account, val products: List<Product>)

data class Account(val id: String, var orders: List<Order>? = null)

data class Product(val id: String)
