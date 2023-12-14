package com.example.wikimarvel.data.characters;

import com.example.wikimarvel.data.lists.Comic;
import com.example.wikimarvel.data.lists.Event;
import com.example.wikimarvel.data.lists.Series;
import com.example.wikimarvel.data.lists.Story;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Characters {
    private int id;
    private String name;
    private String description;
    private Date modified;
    private String resourceURI;
    private String image;
    private List<Comic> comicList;
    private List<Story> storyList;
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
    public Characters(){}
    public Characters(int id, String name, String description, Date modified, String resourceURI, String image, List<Comic> comicList, List<Story> storyList, List<Event> eventList, List<Series> seriesList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.modified = modified;
        this.resourceURI = resourceURI;
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

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
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
