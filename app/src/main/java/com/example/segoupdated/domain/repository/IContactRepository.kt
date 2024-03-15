package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.Contact

interface IContactRepository {
    suspend fun getContactInfo(companyId: Int): Contact?
    suspend fun updateContactInfo(contact: Contact)
    suspend fun deleteContactInfo(companyId: Int)

}