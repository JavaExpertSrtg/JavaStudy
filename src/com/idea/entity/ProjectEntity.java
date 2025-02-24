package com.idea.entity;

/**
 * 项目实体类（项目列表，保存项目）
 */
public class ProjectEntity {

    private final String name;
    private final String filepath;

    public ProjectEntity(String name, String filepath) {
        this.name = name;
        this.filepath = filepath;
    }

    public String getName() {
        return name;
    }

    public String getFilePath() {
        return filepath;
    }
}
