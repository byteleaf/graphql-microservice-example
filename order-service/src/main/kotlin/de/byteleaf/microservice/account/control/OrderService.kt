package de.byteleaf.microservice.account.control

import de.byteleaf.microservice.account.entity.Account
import de.byteleaf.microservice.account.entity.Order
import de.byteleaf.microservice.account.entity.Product
import org.springframework.stereotype.Service

@Service
class OrderService {

    lateinit var orders: List<Order>

    init {
        val acc1 = Account("1")
        val acc2 = Account("2")
        val order1 = Order("1", "First Order", acc1, listOf(Product("1")))
        val order2 = Order("2", "Second Order", acc1, listOf(Product("2")))
        val order3 = Order("3", "Frist Order", acc2, listOf(Product("1"), Product("3")))

        acc1.orders = listOf(order1, order2)
        acc2.orders = listOf(order3)

        orders = listOf(order1, order2, order3)
    }


    fun orders() = orders
    fun order(id: String) = orders.find { it.id == id }
    fun account(id: String) = orders.map { it.account }.find { it.id == id }
}
