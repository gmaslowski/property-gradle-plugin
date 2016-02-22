package com.gmaslowski.gradle.plugin.property

import org.gradle.api.Plugin
import org.gradle.api.Project

class PropertyGradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.gradle.taskGraph.whenReady { graph ->
            if (graph.hasTask(':test')) {
                project.tasks.getByName('test').configure {
                    project.gradle.startParameter.systemPropertiesArgs.each { key, value -> systemProperty key, value }
                }
            }
        }
    }
}