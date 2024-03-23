package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.User
import com.example.segoupdated.domain.repository.IUserRepository
import javax.inject.Inject

class ManageAuthUserUseCase @Inject constructor(
    private val userRepository: IUserRepository
) {
    suspend fun login(email: String, password: Int): User? {
        return userRepository.login(email, password)
    }

    suspend fun signup(user: User): Boolean {
        return userRepository.signup(user)
    }
}