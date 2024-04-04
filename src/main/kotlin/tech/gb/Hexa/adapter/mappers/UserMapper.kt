package tech.gb.Hexa.adapter.mappers

import tech.gb.Hexa.adapter.`in`.domain.UserRequest
import tech.gb.Hexa.adapter.out.domain.UserResponse
import tech.gb.Hexa.adapter.out.model.User
import java.util.UUID

object UserMapper {

    fun toResponse(user:User): UserResponse{
        return UserResponse(user.name, user.email)
    }

    fun toEntity(userRequest: UserRequest): User{
        return User(UUID.randomUUID().toString(), userRequest.name, userRequest.email)
    }

    fun toListResponse(users: List<User>): List<UserResponse>{
        return users.map { toResponse(it) }
    }

}