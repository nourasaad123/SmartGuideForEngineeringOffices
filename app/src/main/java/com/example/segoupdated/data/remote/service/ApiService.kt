package com.example.segoupdated.data.remote.service

import com.example.segoupdated.data.remote.model.dto.AddProjectRequest
import com.example.segoupdated.data.remote.model.dto.AddProjectResponseDto
import com.example.segoupdated.data.remote.model.dto.AdminLoginResponseDto
import com.example.segoupdated.data.remote.model.dto.CompanyDto
import com.example.segoupdated.data.remote.model.dto.LoginRequestDto
import com.example.segoupdated.data.remote.model.dto.UserLoginResponseDto
import com.example.segoupdated.data.remote.model.dto.UserSignUpRequestDto
import com.example.segoupdated.data.remote.model.dto.UserSignUpResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @GET("all/companies")
    suspend fun getAllCompany(): List<CompanyDto>

    @POST("login")
    suspend fun userLogin(@Body loginRequestDto: LoginRequestDto): UserLoginResponseDto

    @POST("register")
    suspend fun userSignUp(@Body userSignUpRequestDto: UserSignUpRequestDto): UserSignUpResponseDto

    @POST("company/login")
    suspend fun adminCompanyLogin(@Body loginRequestDto: LoginRequestDto): AdminLoginResponseDto

    @GET("specialization/companies/{id}")
    suspend fun getCompanyBySpitializationId(@Path("id") id: Int): List<CompanyDto>
    @POST("add/project")
    suspend fun addProject(@Body addProjectRequest: AddProjectRequest):AddProjectResponseDto
}