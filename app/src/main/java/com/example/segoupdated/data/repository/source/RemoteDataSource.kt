package com.example.segoupdated.data.repository.source

import com.example.segoupdated.data.remote.model.dto.AddProjectRequest
import com.example.segoupdated.data.remote.model.dto.AddProjectResponseDto
import com.example.segoupdated.data.remote.model.dto.AdminLoginResponseDto
import com.example.segoupdated.data.remote.model.dto.CompanyDto
import com.example.segoupdated.data.remote.model.dto.LoginRequestDto
import com.example.segoupdated.data.remote.model.dto.UserLoginResponseDto
import com.example.segoupdated.data.remote.model.dto.UserSignUpRequestDto
import com.example.segoupdated.data.remote.model.dto.UserSignUpResponseDto

interface RemoteDataSource {
    suspend fun getAllCompany(): List<CompanyDto>

    suspend fun userLogin(loginRequestDto: LoginRequestDto): UserLoginResponseDto

    suspend fun userSignup(userSignUpRequestDto: UserSignUpRequestDto): UserSignUpResponseDto
    suspend fun adminCompanyLogin(loginRequestDto: LoginRequestDto): AdminLoginResponseDto

    suspend fun getCompanyBySpecializationId(id: Int): List<CompanyDto>

    suspend fun addProject(addProjectRequest: AddProjectRequest): AddProjectResponseDto
}
