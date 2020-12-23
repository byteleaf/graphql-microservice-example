package de.byteleaf.microservice.product.control

import de.byteleaf.microservice.product.entity.Product
import org.springframework.stereotype.Service

@Service
class ProductService {
    val products = listOf(
        Product("1", "Table", "Wonderful Table", 200.0),
        Product("2", "Chair", "Nice Chair", 50.0),
        Product("3", "Table Lamp", "Lamp for a nice table", 20.0)
    )

    fun products() = products
    fun product(id: String) = products.find { it.id == id }
}
