package de.byteleaf.microservice.account.control

import de.byteleaf.microservice.account.entity.Account
import org.springframework.stereotype.Service

@Service
class AccountService {
    val accounts = listOf(
        Account("1", "Max", "Mustermann", "password1"),
        Account("2", "Erika", "Gabler", "password2")
    )

    fun accounts() = accounts
    fun account(id: String) = accounts.find { it.id == id }
}
