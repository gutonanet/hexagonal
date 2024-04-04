package tech.gb.Hexa.adapter.out.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import tech.gb.Hexa.adapter.out.model.User

@Repository
interface UserRepository: JpaRepository<User, String>
