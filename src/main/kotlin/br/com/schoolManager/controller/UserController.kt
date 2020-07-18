package br.com.schoolManager.controller

import br.com.schoolManager.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController : Controller(User()) {

    @GetMapping("/teste")
    fun index(@RequestParam(value = "name", defaultValue = "") name: String): String {
        return this.index();
    }



}
