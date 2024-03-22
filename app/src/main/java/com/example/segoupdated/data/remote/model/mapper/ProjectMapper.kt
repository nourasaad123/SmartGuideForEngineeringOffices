package com.example.segoupdated.data.remote.model.mapper

import com.example.segoupdated.data.remote.model.dto.AddProjectRequest
import com.example.segoupdated.data.remote.model.dto.AddProjectResponseDto
import com.example.segoupdated.domain.entity.Project

fun AddProjectResponseDto.toProject() :Project =Project(
    id = projectDto?.id ?: 0,
    image = projectDto?.image1 ?:"",
    description = projectDto?.description ?:"",
    name = projectDto?.name ?:""
)

fun Project.toAddProjectRequest():AddProjectRequest = AddProjectRequest(
    name = name,
    image = image ,
    description = description ,
    companyName = ""
)

