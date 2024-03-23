package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.ProjectCompany
import com.example.segoupdated.domain.repository.IProjectRepository
import javax.inject.Inject

class ManageProjectUseCase @Inject constructor(
    private val projectRepository: IProjectRepository
) {
    suspend fun addProject(project: ProjectCompany): ProjectCompany {
        return projectRepository.addProject(project)
    }

    suspend fun deleteProjectById(projectId: Int) {
        return projectRepository.deleteProjectById(projectId)

    }

    suspend fun updateProject(projectId: Int, project: ProjectCompany): ProjectCompany {
        return projectRepository.updateProject(projectId, project)

    }

    suspend fun getProjectById(projectId: Int): ProjectCompany {
        return projectRepository.getProjectById(projectId)

    }

    suspend fun getAllProjects(): List<ProjectCompany> {
        return projectRepository.getAllProjects()
    }
}