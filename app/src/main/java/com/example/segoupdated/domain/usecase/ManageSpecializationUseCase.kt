package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.Specialization
import com.example.segoupdated.domain.repository.ISpecializationRepository
import javax.inject.Inject

class ManageSpecializationUseCase @Inject constructor(
   private val specializationRepository:ISpecializationRepository
) {

   suspend fun getSpecializationById(specialId:Int):Specialization{
return specializationRepository.getSpecializationById(specialId)
    }
   suspend fun searchAboutSpecialization(specialization:Specialization):Specialization{
return specializationRepository.searchAboutSpecialization(specialization)
    }
   suspend fun getAllSpecializations():List<Specialization>{
return specializationRepository.getAllSpecializations()
    }
}