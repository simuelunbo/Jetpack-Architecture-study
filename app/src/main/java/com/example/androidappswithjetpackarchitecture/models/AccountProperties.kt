package com.example.androidappswithjetpackarchitecture.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "account_properties") // 데이터베이스 테이블 같은 역할
data class AccountProperties(

    @SerializedName("pk")
    @Expose
    @PrimaryKey(autoGenerate = false) // sql문에서 autoIncrement와 같이 자동으로 증가하는 id값 설정
    @ColumnInfo(name = "pk")
    var pk: Int,

    @SerializedName("email")
    @Expose
    @ColumnInfo(name = "email")
    var email: String,

    @SerializedName("username")
    @Expose
    @ColumnInfo(name = "username")
    var username: String,
)

