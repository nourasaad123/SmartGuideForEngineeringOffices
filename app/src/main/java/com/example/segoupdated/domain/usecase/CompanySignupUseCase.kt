package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.Company
import com.example.segoupdated.domain.repository.ICompanyRepository
import javax.inject.Inject

class CompanySignupUseCase @Inject constructor(
    private val companyRepository: ICompanyRepository
) {
    suspend fun signup(company: Company): Boolean {
        return companyRepository.signup(company)
    }
}