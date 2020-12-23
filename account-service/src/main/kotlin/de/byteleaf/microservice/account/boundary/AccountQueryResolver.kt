package de.byteleaf.microservice.account.boundary

import de.byteleaf.microservice.account.control.AccountService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class AccountQueryResolver : GraphQLQueryResolver {

    @Autowired
    private lateinit var accountService: AccountService

    fun accounts() = accountService.accounts()

    fun account(id: String) = accountService.account(id)

}
