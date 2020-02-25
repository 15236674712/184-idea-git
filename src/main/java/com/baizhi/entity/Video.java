package com.baizhi.entity;

public class Video {


    private String id;
    private String path;


    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public Video(String id, String path) {
        this.id = id;
        this.path = path;
    }

    public Video() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
