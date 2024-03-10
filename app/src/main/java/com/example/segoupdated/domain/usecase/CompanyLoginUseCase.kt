package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.Company
import com.example.segoupdated.domain.repository.ICompanyRepository
import javax.inject.Inject

class CompanyLoginUseCase @Inject constructor(private val companyRepository: ICompanyRepository) {
    suspend fun login(email: String, password: Int): Company? {
        return companyRepository.login(email, password)
    }
}