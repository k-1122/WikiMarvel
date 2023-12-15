package com.example.wikimarvel.data.objects;

import com.example.wikimarvel.data.lists.Comics;

import java.util.List;

public class Comic {
    private int available;
    private String collectionURI;
    private List<Comics> comics;

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

    public List<Comics> getComics() {
        return comics;
    }

    public void setComics(List<Comics> comics) {
        this.comics = comics;
    }

    public Comic() {
    }

    public Comic(int available, String collectionURI, List<Comics> comics) {
        this.available = available;
        this.collectionURI = collectionURI;
        this.comics = comics;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "available=" + available +
                ", collectionURI='" + collectionURI + '\'' +
                ", comics=" + comics +
                '}';
    }
}
