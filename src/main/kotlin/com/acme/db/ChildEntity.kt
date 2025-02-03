package com.acme.db

import com.acme.common.db.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "test_table")
class ChildEntity(
    id: Long? = null,
    val name: String,
    resourceOwner: String? = null,
    createdDate: LocalDateTime? = null,
    createdBy: String? = null,
    modifiedDate: LocalDateTime? = null,
    modifiedBy: String? = null,
) : BaseEntity(id, resourceOwner, createdDate, createdBy, modifiedDate, modifiedBy)