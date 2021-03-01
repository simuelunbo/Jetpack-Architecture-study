package com.example.androidappswithjetpackarchitecture.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "auth_token",
    foreignKeys = [
        ForeignKey(
            entity = AccountProperties::class, // parent class
            parentColumns = ["pk"],
            childColumns = ["account_pk"],
            onDelete = CASCADE // 부모 Entity가 삭제될 경우 자식 Entity를 삭제합니다.
        )
    ]
)
data class AuthToken(

    @PrimaryKey
    @ColumnInfo(name = "account_pk")
    var account_pk: Int? = -1, // Negative for default

    @SerializedName("token")
    @Expose
    @ColumnInfo(name = "token")
    var token: String? = null
)
