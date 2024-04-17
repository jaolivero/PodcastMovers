package com.example.demo.welcome;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Home {

    @GetMapping("/")
    public String welcome() {
        return "Home";
    }

    @GetMapping("/podcasts")
    public String podcast() {
        return "Podcast";
    }

    @GetMapping("/podcasts/{podcastID}")
    public String getPodcast() {
        return "PodcastID";
    }

    @GetMapping("/podcasts/{podcastID}/episodes/")
    public String getAllEpisodes() {
        return "Episodes";
    }

    @GetMapping("/podcasts/{podcastID}/episodes/{episodeID}")
    public String getEpisode() {
        return "EpisodeID";
    }




    }