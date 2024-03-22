package com.example.segoupdated.data.remote

import com.example.segoupdated.data.remote.model.dto.AddProjectRequest
import com.example.segoupdated.data.remote.model.dto.AddProjectResponseDto
import com.example.segoupdated.data.remote.model.dto.AdminLoginResponseDto
import com.example.segoupdated.data.remote.model.dto.CompanyDto
import com.example.segoupdated.data.remote.model.dto.LoginRequestDto
import com.example.segoupdated.data.remote.model.dto.UserLoginResponseDto
import com.example.segoupdated.data.remote.model.dto.UserSignUpRequestDto
import com.example.segoupdated.data.remote.model.dto.UserSignUpResponseDto
import com.example.segoupdated.data.remote.service.ApiService
import com.example.segoupdated.data.repository.source.RemoteDataSource
import javax.inject.Inject

class RetrofitDataSource @Inject constructor(
    private val apiService: ApiService
) : RemoteDataSource {
    override suspend fun getAllCompany(): List<CompanyDto> {
        return apiService.getAllCompany()
    }

    override suspend fun userLogin(loginRequestDto: LoginRequestDto): UserLoginResponseDto {
        return apiService.userLogin(loginRequestDto = loginRequestDto)
    }

    override suspend fun userSignup(userSignUpRequestDto: UserSignUpRequestDto): UserSignUpResponseDto {
        return apiService.userSignUp(userSignUpRequestDto = userSignUpRequestDto)
    }

    override suspend fun adminCompanyLogin(loginRequestDto: LoginRequestDto): AdminLoginResponseDto {
        return apiService.adminCompanyLogin(loginRequestDto)
    }

    override suspend fun getCompanyBySpecializationId(id: Int): List<CompanyDto> {
        return apiService.getCompanyBySpitializationId(id)
    }

    override suspend fun addProject(addProjectRequest: AddProjectRequest): AddProjectResponseDto {
        return apiService.addProject(addProjectRequest = addProjectRequest)
    }

}