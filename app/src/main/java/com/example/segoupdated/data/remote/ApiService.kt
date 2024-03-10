package com.example.segoupdated.data.remote

import com.example.segoupdated.data.repository.dto.AdmineLoginResponseDto
import com.example.segoupdated.data.repository.dto.CompanyDto
import com.example.segoupdated.data.repository.dto.UserLoginResponseDto
import com.example.segoupdated.data.repository.dto.LoginRequestDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
  @GET("all/companies")
  suspend fun getAllCompany(): List<CompanyDto>

  @POST("login")
  suspend fun userLogin(@Body loginRequestDto: LoginRequestDto): UserLoginResponseDto

  @POST
  suspend fun adminCompanyLogin(@Body loginRequestDto: LoginRequestDto) : AdmineLoginResponseDto

  @GET("specialization/companies/{id}")
  suspend fun getCompanyBySpitializationId(@Path("id") id:Int):List<CompanyDto>

  
}