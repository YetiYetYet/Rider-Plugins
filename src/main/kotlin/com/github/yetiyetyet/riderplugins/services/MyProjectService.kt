package com.github.yetiyetyet.riderplugins.services

import com.intellij.openapi.project.Project
import com.github.yetiyetyet.riderplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
