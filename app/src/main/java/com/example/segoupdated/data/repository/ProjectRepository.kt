package com.example.segoupdated.data.repository

import com.example.segoupdated.data.repository.source.RemoteDataSource
import com.example.segoupdated.domain.entity.Project
import com.example.segoupdated.domain.repository.IProjectRepository
import javax.inject.Inject

class ProjectRepository @Inject constructor(
     private val  remoteDataSource: RemoteDataSource
): IProjectRepository {
    override suspend fun addProject(project: Project): Project {
        TODO("Not yet implemented")
    }

    override suspend fun deleteProjectById(projectId: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun updateProject(projectId: Int, project: Project): Project {
        TODO("Not yet implemented")
    }

    override suspend fun getProjectById(projectId: Int): Project {
        TODO("Not yet implemented")
    }

    override suspend fun getAllProjects(): List<Project> {
        TODO("Not yet implemented")
    }
}