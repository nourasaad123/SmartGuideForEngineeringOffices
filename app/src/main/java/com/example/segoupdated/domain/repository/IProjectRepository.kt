package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.ProjectCompany

interface IProjectRepository {
    suspend fun addProject(project: ProjectCompany): ProjectCompany

    suspend fun deleteProjectById(projectId: Int)

    suspend fun updateProject(projectId: Int, project: ProjectCompany): ProjectCompany

    suspend fun getProjectById(projectId: Int): ProjectCompany

    suspend fun getAllProjects(): List<ProjectCompany>
}