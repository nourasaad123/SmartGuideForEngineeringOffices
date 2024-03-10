package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.Specialization
import com.example.segoupdated.domain.repository.ISpecializationRepository

class SpecializationUseCase(
    val specializationRepository:ISpecializationRepository
) {

    fun getSpecializationById(specialId:Int):Specialization{
return specializationRepository.getSpecializationById(specialId)
    }
    fun searchAboutSpecialization(specialization:Specialization):Specialization{
return specializationRepository.searchAboutSpecialization(specialization)
    }
    fun getAllSpecializations():List<Specialization>{
return specializationRepository.getAllSpecializations()
    }
}