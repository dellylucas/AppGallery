package com.dfl9.appgallery.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.dfl9.appgallery.R;
import java.util.List;

public class GalleryAdapter extends BaseAdapter {

    private List<Integer> itemImages;
    private Context context;

    public GalleryAdapter(List<Integer> itemImages, Context context) {
        this.itemImages = itemImages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.itemImages.size();
    }

    @Override
    public Integer getItem(int position) {
        return itemImages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       LayoutInflater inf = LayoutInflater.from(parent.getContext());
       View view=convertView;
        if (view == null) {
            view= inf.inflate(R.layout.adapter_gallery,null);
        }

        ImageView ima = view.findViewById(R.id.imageViewGenerator);
        ima.setImageResource(getItem(position));

        return view;
    }
}
