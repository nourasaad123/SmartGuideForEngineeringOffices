package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.Contact
import com.example.segoupdated.domain.repository.IContactRepository
import javax.inject.Inject

class ManageContactUseCase @Inject constructor(
    private val contactRepository: IContactRepository
) {
    suspend fun getContactInfo(companyId: Int): Contact? {
        return contactRepository.getContactInfo(companyId)
    }

    suspend fun updateContactInfo(contact: Contact) {
        return contactRepository.updateContactInfo(contact)
    }

    suspend fun deleteContactInfo(companyId: Int) {
        return contactRepository.deleteContactInfo(companyId)
    }
}