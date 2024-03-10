package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.User
import com.example.segoupdated.domain.repository.IUserRepository
import javax.inject.Inject

class UserLoginUseCase @Inject constructor(private val userRepository: IUserRepository) {
    suspend fun login(email: String, password: Int): User? {
        return userRepository.login(email, password)
    }
}