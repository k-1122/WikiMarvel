package com.example.wikimarvel.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wikimarvel.R;
import com.example.wikimarvel.adapters.GridCharactersAdapter;
import com.example.wikimarvel.api.ApiRequestManager;
import com.example.wikimarvel.api.CharactersParser;
import com.example.wikimarvel.data.characters.Character_;
import com.example.wikimarvel.databinding.FragmentFirstBinding;
import com.example.wikimarvel.databinding.RecyclerviewGridLayoutBinding;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private RecyclerView recyclerView;
    private ApiRequestManager apiRequestManager = ApiRequestManager.API_REQUEST_MANAGER_INSTANCE;
    private CharactersParser charactersParser = new CharactersParser();
    private JsonArray jsonArray;
    public static JsonArray setResponseFragment(JsonArray jsonArray){
        return jsonArray;
    }
    public JsonArray getJsonArray(){
        return this.jsonArray;
    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = binding.recyclerXML;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        apiRequestManager.get();
        List<Character_> character= charactersParser.getCharactersList(getJsonArray());
        recyclerView.setAdapter(new GridCharactersAdapter(character));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;


    }

}