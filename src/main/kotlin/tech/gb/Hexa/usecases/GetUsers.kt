package tech.gb.Hexa.usecases

import tech.gb.Hexa.adapter.mappers.UserMapper
import tech.gb.Hexa.adapter.out.domain.UserResponse
import tech.gb.Hexa.adapter.out.repositories.UserRepository

class GetUsers(private val userRepository: UserRepository, private val userMapper: UserMapper) {

    fun execute(): List<UserResponse>{
        return userMapper.toListResponse(userRepository.findAll())
    }
}