package com.example.wikimarvel.data.characters;

import com.example.wikimarvel.data.objects.Comic;
import com.example.wikimarvel.data.objects.Event;
import com.example.wikimarvel.data.objects.Serie;
import com.example.wikimarvel.data.objects.Story;


public class Character_ {
    private int id;
    private String name;
    private String description;
    private String modified;
    private String image;
    private Comic comic;
    private Story story;
    private Event event;
    private Serie serie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public Character_(){}
    public Character_(int id, String name, String description, String modified, String image, Comic comic, Story story, Event event, Serie serie) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.modified = modified;
        this.image = image;
        this.comic = comic;
        this.story = story;
        this.event = event;
        this.serie = serie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Comic getComic() {
        return comic;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public Event getEven() {
        return event;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", modified='" + modified + '\'' +
                ", image='" + image + '\'' +
                ", comic=" + comic +
                ", story=" + story +
                ", event=" + event +
                ", serie=" + serie +
                '}';
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
