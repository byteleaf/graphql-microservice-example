package de.byteleaf.microservice.product.boundary

import de.byteleaf.microservice.product.control.ProductService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class ProductQueryResolver : GraphQLQueryResolver {

    @Autowired
    private lateinit var productService: ProductService

    fun products() = productService.products()

    fun product(id: String) = productService.product(id)

}
