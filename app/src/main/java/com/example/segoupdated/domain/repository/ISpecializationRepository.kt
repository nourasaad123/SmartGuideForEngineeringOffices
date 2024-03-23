package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.Specialization

interface ISpecializationRepository {
    suspend fun getSpecializationById(specialId: Int): Specialization
    suspend fun searchAboutSpecialization(specialization: Specialization): Specialization
    suspend fun getAllSpecializations(): List<Specialization>
}