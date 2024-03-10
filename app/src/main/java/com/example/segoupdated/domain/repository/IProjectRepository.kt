package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.Project

interface IProjectRepository {
    fun addProject(project: Project): Project

    fun deleteProjectById(projectId: Int)

    fun updateProject(projectId: Int, project: Project): Project

    fun getProjectById(projectId: Int): Project

    fun getAllProjects(): List<Project>
}