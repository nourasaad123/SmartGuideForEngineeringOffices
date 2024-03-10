package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.Company

interface ICompanyRepository {
    suspend fun login(email: String, password: Int): Company?
    suspend fun signup(company: Company): Boolean

}