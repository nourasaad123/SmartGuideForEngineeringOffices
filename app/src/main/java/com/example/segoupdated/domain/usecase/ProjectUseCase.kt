package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.Project
import com.example.segoupdated.domain.repository.IProjectRepository
import javax.inject.Inject

class ProjectUseCase @Inject constructor(
   private val projectRepository: IProjectRepository
) {
   suspend fun addProject(project: Project): Project {
        return projectRepository.addProject(project)
    }

    suspend fun deleteProjectById(projectId: Int) {
        return projectRepository.deleteProjectById(projectId)

    }

    suspend fun updateProject(projectId: Int, project: Project): Project {
        return projectRepository.updateProject(projectId, project)

    }

    suspend fun getProjectById(projectId: Int): Project {
        return projectRepository.getProjectById(projectId)

    }

    suspend fun getAllProjects(): List<Project> {
        return projectRepository.getAllProjects()
    }
}