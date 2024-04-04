package tech.gb.Hexa.adapter.out.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users")
data class User(
    @Id
    val id: String,
    @Column
    val name: String,
    @Column
    val email: String
)
