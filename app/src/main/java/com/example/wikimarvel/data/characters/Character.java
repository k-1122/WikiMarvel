package com.example.wikimarvel.data.characters;

import com.example.wikimarvel.data.lists.Comic;
import com.example.wikimarvel.data.lists.Event;
import com.example.wikimarvel.data.lists.Series;
import com.example.wikimarvel.data.lists.Story;

import java.util.Date;
import java.util.List;


public class Character {
    private int id;
    private String name;
    private String description;
    private String modified;
    private String image;
    private List <Comic> comicList;
    private List <Story> storyList;
    private List <Event> eventList;
    private List <Series> seriesList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public Character(){}
    public Character(int id, String name, String description, String modified, String image, List<Comic> comicList, List<Story> storyList, List<Event> eventList, List<Series> seriesList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.modified = modified;
        this.image = image;
        this.comicList = comicList;
        this.storyList = storyList;
        this.eventList = eventList;
        this.seriesList = seriesList;
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

    public List<Comic> getComicList() {
        return comicList;
    }

    public void setComicList(List<Comic> comicList) {
        this.comicList = comicList;
    }

    public List<Story> getStoryList() {
        return storyList;
    }

    public void setStoryList(List<Story> storyList) {
        this.storyList = storyList;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", modified='" + modified + '\'' +
                ", image='" + image + '\'' +
                ", comicList=" + comicList +
                ", storyList=" + storyList +
                ", eventList=" + eventList +
                ", seriesList=" + seriesList +
                '}';
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public List<Series> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<Series> seriesList) {
        this.seriesList = seriesList;
    }
}
