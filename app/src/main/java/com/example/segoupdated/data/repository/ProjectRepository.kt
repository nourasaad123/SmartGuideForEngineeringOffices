package com.example.segoupdated.data.repository

import com.example.segoupdated.data.repository.source.RemoteDataSource
import com.example.segoupdated.domain.entity.ProjectCompany
import com.example.segoupdated.domain.repository.IProjectRepository
import javax.inject.Inject

class ProjectRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : IProjectRepository {
    override suspend fun addProject(project: ProjectCompany): ProjectCompany {
        //return  remoteDataSource.addProject(project.toAddProjectRequest()).toProject()
        TODO("Not yet implemented")
    }

    override suspend fun deleteProjectById(projectId: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun updateProject(projectId: Int, project: ProjectCompany): ProjectCompany {
        TODO("Not yet implemented")
    }

    override suspend fun getProjectById(projectId: Int): ProjectCompany {
        TODO("Not yet implemented")
    }

    override suspend fun getAllProjects(): List<ProjectCompany> {
        TODO("Not yet implemented")
    }
}
