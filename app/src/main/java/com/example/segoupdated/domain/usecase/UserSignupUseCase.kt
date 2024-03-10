package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.User
import com.example.segoupdated.domain.repository.IUserRepository
import javax.inject.Inject

class UserSignupUseCase @Inject constructor(
    private val userRepository: IUserRepository
) {
    suspend fun signup(user: User): Boolean {
        return userRepository.signup(user)
    }
}