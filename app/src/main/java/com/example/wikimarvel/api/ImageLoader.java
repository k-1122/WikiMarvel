package com.example.wikimarvel.api;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageLoader {
    public void loadImage(String path, ImageView imageView) {
        String url = path + ".jpg";

        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }

}
