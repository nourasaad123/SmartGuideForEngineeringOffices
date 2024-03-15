package com.example.segoupdated.data.repository.source

import com.example.segoupdated.data.repository.dto.AdminLoginResponseDto
import com.example.segoupdated.data.repository.dto.CompanyDto
import com.example.segoupdated.data.repository.dto.LoginRequestDto
import com.example.segoupdated.data.repository.dto.UserLoginResponseDto

interface RemoteDataSource {
    suspend fun getAllCompany(): List<CompanyDto>

    suspend fun userLogin(loginRequestDto: LoginRequestDto): UserLoginResponseDto

    suspend fun adminCompanyLogin(loginRequestDto: LoginRequestDto): AdminLoginResponseDto

    suspend fun getCompanyBySpecializationId(id: Int): List<CompanyDto>
}