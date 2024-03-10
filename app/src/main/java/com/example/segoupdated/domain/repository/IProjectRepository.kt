package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.Project

interface IProjectRepository {
   suspend fun addProject(project: Project): Project

    suspend fun deleteProjectById(projectId: Int)

   suspend fun updateProject(projectId: Int, project: Project): Project

   suspend fun getProjectById(projectId: Int): Project

   suspend fun getAllProjects(): List<Project>
}