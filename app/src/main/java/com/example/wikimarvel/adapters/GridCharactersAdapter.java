package com.example.wikimarvel.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wikimarvel.R;
import com.example.wikimarvel.api.ImageLoader;
import com.example.wikimarvel.data.characters.Characters;

import java.util.List;

public class GridCharactersAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Characters> characters;
    public GridCharactersAdapter(List<Characters> characters){this.characters = characters;}
    public void setCharacters(List<Characters> characters){
        this.characters = characters;
        //notify...

    }

    public class CharacterHolder extends RecyclerView.ViewHolder{
        View viewCharacter;
        TextView nameTV;
        TextView characterIdTV;
        ImageView characterImgV;

        public CharacterHolder(View itemView) {
            super(itemView);
            nameTV = viewCharacter.findViewById(R.id.textViewName);
            characterIdTV = viewCharacter.findViewById(R.id.textViewID);
            characterImgV = viewCharacter.findViewById(R.id.imageView2);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_grid_layout, parent, false);
        return new CharacterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    Characters character = characters.get(position);
    if(character == null)return;

    CharacterHolder characterHolder = (CharacterHolder) holder;
    characterHolder.characterIdTV.setText(character.getId());
    characterHolder.nameTV.setText(character.getName());
    new ImageLoader().loadImage(character.getImage(), characterHolder.characterImgV);

    }
    @Override
    public int getItemCount() {
        return characters.size();
    }
}
