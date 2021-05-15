package com.github.bmalehorn.intellijvimspired.services

import com.github.bmalehorn.intellijvimspired.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
