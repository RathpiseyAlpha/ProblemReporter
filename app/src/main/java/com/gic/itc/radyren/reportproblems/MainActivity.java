package com.gic.itc.radyren.reportproblems;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton environment = (ImageButton)findViewById(R.id.environment);
        ImageButton traffic = (ImageButton)findViewById(R.id.trafic);
        ImageButton crime = (ImageButton)findViewById(R.id.crime);
        ImageButton accident = (ImageButton)findViewById(R.id.acci);

        environment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                 if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                 startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
             }
            }
        });
    }
}
