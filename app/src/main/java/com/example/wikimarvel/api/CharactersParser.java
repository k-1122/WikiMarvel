package com.example.wikimarvel.api;

import com.example.wikimarvel.data.characters.Character;
import com.example.wikimarvel.data.lists.Comics;
import com.example.wikimarvel.data.lists.Events;
import com.example.wikimarvel.data.lists.Series;
import com.example.wikimarvel.data.lists.Storys;
import com.example.wikimarvel.data.objects.Comic;
import com.example.wikimarvel.data.objects.Event;
import com.example.wikimarvel.data.objects.Serie;
import com.example.wikimarvel.data.objects.Story;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

import okhttp3.Response;

public class CharactersParser {
    public JsonObject parseResponseBody(Response response) {
        JsonObject parsedResponse = new JsonObject();
        try (Reader reader = response.body().charStream()) {
            JsonElement rootElement = JsonParser.parseReader(reader);
            parsedResponse = rootElement.getAsJsonObject();
        } catch (IOException | NullPointerException e) {
            throw new RuntimeException(e);
        }
        return parsedResponse;
    }
    public List<Character> getCharactersList(JsonArray movieArray) {
        List<Character> characterList = new LinkedList<>();
        for (JsonElement charactersJson : movieArray) {
            Character character = getCharacterObj(charactersJson.getAsJsonObject());
            characterList.add(character);
        }
        return characterList;
    }
    public List<Comics> getComicsList(JsonArray comicArray) {
        List<Comics> List = new LinkedList<>();
        for (JsonElement obJson : comicArray) {
            Comics comics = getComics(obJson.getAsJsonObject());
            List.add(comics);
        }
        return List;
    }
    public Comic getComic(JsonObject value){
        int available = value.get("available").getAsInt();
        String collectionURI = value.get("collectionURI").getAsString();
        JsonArray comicsJsonArray = value.getAsJsonArray("items");
        Comic comic = new Comic(available, collectionURI, getComicsList(comicsJsonArray));
        return comic;
    }
    public Comics getComics(JsonObject value){
        String resourceURI = value.get("resourceURI").getAsString();
        String name = value.get("name").getAsString();
        Comics comics = new Comics(resourceURI, name);
        return comics;
    }
    public List<Storys> getStorysList(JsonArray value){
        List<Storys> List = new LinkedList<>();
        for (JsonElement obJson : value) {
            Storys storys = getStorys(obJson.getAsJsonObject());
            List.add(storys);
        }
        return List;
    }
    public Storys getStorys(JsonObject value){
        String resourceURI = value.get("resourceURI").getAsString();
        String name = value.get("name").getAsString();
        String type = value.get("type").getAsString();
        Storys storys = new Storys(resourceURI, name, type);
        return storys;
    }
    public Story getStory(JsonObject value){
        int available = value.get("available").getAsInt();
        String collectionURI = value.get("collectionURI").getAsString();
        JsonArray storyJsonArray = value.getAsJsonArray("items");
        Story story = new Story(available, collectionURI, getStorysList(storyJsonArray));
        return story;
    }

    public List<Events> getEventsList(JsonArray value){
        List<Events> list = new LinkedList<>();
        for(JsonElement obJson : value){
            Events events = getEvents(obJson.getAsJsonObject());
            list.add(events);
        }
        return list;
    }
    public Event getEvent(JsonObject events){
        int available = events.get("available").getAsInt();
        String collectionURI = events.get("collectionURI").getAsString();
        JsonArray eventJsonArray = events.getAsJsonArray("items");
        Event event = new Event(available, collectionURI, getEventsList(eventJsonArray));
        return event;
    }
    public Events getEvents(JsonObject events) {
        String resourceURI = events.get("resourceURI").getAsString();
        String name = events.get("name").getAsString();
        Events events1 = new Events(resourceURI, name);
        return events1;
    }
    public Series getSeries(JsonObject jsonObject){
        String resourceURI = jsonObject.get("resourceURI").getAsString();
        String name = jsonObject.get("name").getAsString();
        return new Series(resourceURI, name);
    }
    public Serie getSerie(JsonObject jsonObject){
        int available = jsonObject.get("available").getAsInt();
        String name = jsonObject.get("name").getAsString();
        JsonArray jsonArray = jsonObject.getAsJsonArray("items");
        Serie serie = new Serie(available, name, getSeriesList(jsonArray));
        return serie;
    }
    public List<Series> getSeriesList(JsonArray jsonArray){
        List<Series> seriesList = new LinkedList<>();
        for (JsonElement objArray : jsonArray){
            Series series = getSeries(objArray.getAsJsonObject());
            seriesList.add(series);
        }
        return seriesList;
    }
    public Character getCharacterObj(JsonObject characterObj){
        int id = characterObj.get("id").getAsInt();
        String name = characterObj.get("name").getAsString();
        String description = characterObj.get("description").getAsString();
        String modified = characterObj.get("modified").getAsString();
        String image = characterObj.get("path").getAsString();
        Comic comic = getComic(characterObj.getAsJsonObject("comics"));
        Story story = getStory(characterObj.getAsJsonObject("stories"));
        Event event = getEvent(characterObj.getAsJsonObject("events"));
        Serie serie = getSerie(characterObj.getAsJsonObject("series"));
        return new Character(id, name, description, modified, image, comic, story, event, serie);
    }
}
