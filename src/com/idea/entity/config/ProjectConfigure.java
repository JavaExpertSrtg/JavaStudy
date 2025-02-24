package com.idea.entity.config;

import java.io.Serializable;

/**
 * 当前项目的配置实体类
 */
public class ProjectConfigure implements Serializable {

    private final String mainClass;
    private final String javaCommand;

    public ProjectConfigure(String mainClass, String javaCommand) {
        this.mainClass = mainClass;
        this.javaCommand = javaCommand;
    }

    public String getMainClass() {
        return mainClass;
    }

    public String getJavaCommand() {
        return javaCommand;
    }
}
