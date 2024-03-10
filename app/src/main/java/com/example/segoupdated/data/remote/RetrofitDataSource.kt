package com.example.segoupdated.data.remote

import com.example.segoupdated.data.repository.dto.AdmineLoginResponseDto
import com.example.segoupdated.data.repository.dto.CompanyDto
import com.example.segoupdated.data.repository.dto.LoginRequestDto
import com.example.segoupdated.data.repository.dto.UserLoginResponseDto
import com.example.segoupdated.data.repository.source.RemoteDataSource
import javax.inject.Inject

class RetrofitDataSource @Inject constructor(
    private val apiService: ApiService
) : RemoteDataSource{
    override suspend fun getAllCompany(): List<CompanyDto> {
        return apiService.getAllCompany()
    }

    override suspend fun userLogin(loginRequestDto: LoginRequestDto): UserLoginResponseDto {
        return apiService.userLogin(loginRequestDto = loginRequestDto)
    }

    override suspend fun adminCompanyLogin(loginRequestDto: LoginRequestDto): AdmineLoginResponseDto {
       return apiService.adminCompanyLogin(loginRequestDto)
    }

    override suspend fun getCompanyBySpecializationId(id: Int): List<CompanyDto> {
       return apiService.getCompanyBySpitializationId(id)
    }
}