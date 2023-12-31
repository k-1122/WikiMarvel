package com.example.wikimarvel.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wikimarvel.R;
import com.example.wikimarvel.databinding.FragmentFirstBinding;
import com.example.wikimarvel.databinding.RecyclerviewGridLayoutBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private RecyclerView recyclerView;

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

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}