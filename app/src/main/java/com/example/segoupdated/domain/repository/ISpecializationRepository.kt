package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.Specialization

interface ISpecializationRepository {
    fun getSpecializationById(specialId:Int): Specialization
    fun searchAboutSpecialization(specialization: Specialization): Specialization
    fun getAllSpecializations():List<Specialization>
}