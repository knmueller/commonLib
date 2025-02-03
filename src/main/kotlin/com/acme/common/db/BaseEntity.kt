package com.acme.common.db

import com.querydsl.core.annotations.QuerySupertype
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@MappedSuperclass
@QuerySupertype
abstract class BaseEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val resourceOwner: String? = null, // tenant id of resource owner.

    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createdDate: LocalDateTime? = null,
    @CreatedBy
    var createdBy: String? = null,
    @LastModifiedDate
    var modifiedDate: LocalDateTime? = null,
    @LastModifiedBy
    var modifiedBy: String? = null
)