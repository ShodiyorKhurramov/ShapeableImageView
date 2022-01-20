package com.example.shapeableimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.ShapeAppearanceModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShapeableImageView shapeableImageView=findViewById(R.id.shapeable);

        ShapeAppearanceModel shapeAppearanceModel=shapeableImageView.getShapeAppearanceModel()
        .toBuilder().setAllCorners(CornerFamily.ROUNDED,125).build();


        shapeableImageView.setShapeAppearanceModel(shapeAppearanceModel);
    }
}