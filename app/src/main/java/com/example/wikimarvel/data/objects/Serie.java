package com.example.wikimarvel.data.objects;

import com.example.wikimarvel.data.lists.Comics;
import com.example.wikimarvel.data.lists.Series;

import java.util.List;

public class Serie {
    private int available;
    private String collectionURI;
    private List<Series> seriesList;

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

    public List<Series> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<Series> seriesList) {
        this.seriesList = seriesList;
    }

    public Serie(int available, String collectionURI, List<Series> seriesList) {
        this.available = available;
        this.collectionURI = collectionURI;
        this.seriesList = seriesList;
    }

    public Serie() {
    }

    @Override
    public String toString() {
        return "Serie{" +
                "available=" + available +
                ", collectionURI='" + collectionURI + '\'' +
                ", seriesList=" + seriesList +
                '}';
    }
}
