package tech.gb.Hexa.adapter.`in`.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import tech.gb.Hexa.adapter.`in`.domain.UserRequest
import tech.gb.Hexa.adapter.out.domain.UserResponse
import tech.gb.Hexa.usecases.GetUsers
import tech.gb.Hexa.usecases.SaveUser

@RestController
class UserController(val getUsers: GetUsers, val saveUser: SaveUser) {

    @GetMapping("/users")
    fun getUsers(): List<UserResponse>{
        return getUsers.execute()
    }

    @PostMapping("/users")
    fun saveUser(userRequest: UserRequest){
        saveUser.execute(userRequest)
    }

}