package com.example.demo.podcast;

import com.example.demo.episode.Episode;

import java.util.List;

public class Podcast {

    private String id;
    private String title;
    private String script;
    private String description;

    private List<Episode> episodes;

    private String img;

    public Podcast() {

    }

    public Podcast(String title, String script, String description, List<Episode> episodes, String img) {
        this.title = title;
        this.script = script;
        this.description = description;
        this.episodes = episodes;
        this.img = img;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
