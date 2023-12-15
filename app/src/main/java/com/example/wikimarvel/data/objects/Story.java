package com.example.wikimarvel.data.objects;

import com.example.wikimarvel.data.lists.Comics;
import com.example.wikimarvel.data.lists.Storys;

import java.util.List;

public class Story {
    private int available;
    private String collectionURI;
    private List<Storys> storysList;

    public Story(int available, String collectionURI, List<Storys> storysList) {
        this.available = available;
        this.collectionURI = collectionURI;
        this.storysList = storysList;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public List<Storys> getStorysList() {
        return storysList;
    }

    public void setStorysList(List<Storys> storysList) {
        this.storysList = storysList;
    }

    public Story() {
    }

    @Override
    public String toString() {
        return "Story{" +
                "available=" + available +
                ", collectionURI='" + collectionURI + '\'' +
                ", storysList=" + storysList +
                '}';
    }
}
