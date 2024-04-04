package tech.gb.Hexa.usecases

import tech.gb.Hexa.adapter.`in`.domain.UserRequest
import tech.gb.Hexa.adapter.mappers.UserMapper
import tech.gb.Hexa.adapter.out.domain.UserResponse
import tech.gb.Hexa.adapter.out.repositories.UserRepository

class SaveUser(private val userRepository: UserRepository, private val userMapper: UserMapper) {
    fun execute(userRequest: UserRequest): UserResponse {
        val user = userMapper.toEntity(userRequest)
        return userMapper.toResponse(userRepository.save(user))
    }
}