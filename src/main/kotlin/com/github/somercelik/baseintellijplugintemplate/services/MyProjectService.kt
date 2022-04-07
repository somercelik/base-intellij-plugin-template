package com.github.somercelik.baseintellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.somercelik.baseintellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
