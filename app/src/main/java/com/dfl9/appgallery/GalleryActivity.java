package com.dfl9.appgallery;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.dfl9.appgallery.model.GalleryAdapter;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {
private List<Integer> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        TypedArray imagenes = getResources().obtainTypedArray(R.array.ruta_img);
        lista =new ArrayList<>();
        GridView grid= findViewById(R.id.imageList);
        for (int i = 0; i < imagenes.length(); i++) {
            lista.add(imagenes.getResourceId(i,0));

        }

        GalleryAdapter gal = new GalleryAdapter(lista,this);
        grid.setAdapter(gal);
    }
}
