package coms.kaesik.user.infra.database.entities

import coms.kaesik.user.domain.model.UserId
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Index
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

@Entity
@Table(
    name = "users",
    schema = "user_service",
    indexes = [
        Index(name = "idx_users_email", columnList = "email"),
        Index(name = "idx_users_username", columnList = "username"),
    ]
)
class UserEntity @OptIn(ExperimentalTime::class) constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UserId? = null,

    @Column(nullable = false, unique = true)
    var email: String,

    @Column(nullable = false, unique = true)
    var username: String,

    @Column(nullable = false)
    var hashedPassword: String,

    @Column(nullable = false)
    var hasEmailVerified: Boolean = false,

    @CreationTimestamp
    var createdAt: Instant = Clock.System.now(),

    @CreationTimestamp
    var updatedAt: Instant = Clock.System.now(),
)