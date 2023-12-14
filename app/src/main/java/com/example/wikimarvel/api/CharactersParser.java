package com.example.wikimarvel.api;

import com.example.wikimarvel.data.characters.Character;
import com.example.wikimarvel.data.lists.Comic;
import com.example.wikimarvel.data.lists.Event;
import com.example.wikimarvel.data.lists.Series;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

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
    public List<Comic> getComicList(JsonArray comicArray) {
        List<Comic> List = new LinkedList<>();
        for (JsonElement obJson : comicArray) {
            Comic comic = getComic(obJson.getAsJsonObject());
            List.add(comic);
        }
        return List;
    }
    public Comic getComic(JsonObject value){
        String resourceURI = value.get("resourceURI").getAsString();
        String name = value.get("name").getAsString();
        Comic comic = new Comic(resourceURI, name);
        return comic;
    }
    public List<Event> getEvent(JsonArray value){
        List<Event> List = new LinkedList<>();
        for (JsonElement obJson : value) {
            Event event = getEvent(obJson.getAsJsonObject());
            List.add(event);
        }
        return List;
    }
    public Event getEvent(JsonObject value){
        String resourceURI = value.get("resourceURI").getAsString();
        String name = value.get("name").getAsString();
        Event event = new Event(resourceURI, name);
        return event;
    }

    public Character getCharacterObj(JsonObject characterObj){
        int id = characterObj.get("id").getAsInt();
        String name = characterObj.get("name").getAsString();
        String description = characterObj.get("description").getAsString();
        String modified = characterObj.get("modified").getAsString();
        String image = characterObj.get("path").getAsString();
        List<Comic> comics = characterObj.get("comics").getAsString();

    }
}
