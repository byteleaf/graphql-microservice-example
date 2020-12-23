package de.byteleaf.microservice.account.boundary

import de.byteleaf.microservice.account.control.OrderService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class OrderQueryResolver : GraphQLQueryResolver {

    @Autowired
    private lateinit var orderService: OrderService

    fun orders() = orderService.orders()

    fun order(id: String) = orderService.order(id)

}
