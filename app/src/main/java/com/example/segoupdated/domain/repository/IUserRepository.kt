package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.User

interface IUserRepository {
    suspend fun login(email:String,password:Int): User?
    suspend fun signup(user: User):Boolean

    }