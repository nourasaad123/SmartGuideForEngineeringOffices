package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.Project
import com.example.segoupdated.domain.repository.IProjectRepository

class ProjectUseCase (
    val projectRepository:IProjectRepository
) {
    fun addProject(project: Project): Project {
        return projectRepository.addProject(project)
    }

    fun deleteProjectById(projectId: Int) {
        return projectRepository.deleteProjectById(projectId)

    }

    fun updateProject(projectId: Int, project: Project): Project {
        return projectRepository.updateProject(projectId, project)

    }

    fun getProjectById(projectId: Int): Project {
        return projectRepository.getProjectById(projectId)

    }

    fun getAllProjects(): List<Project> {
        return projectRepository.getAllProjects()
    }
}