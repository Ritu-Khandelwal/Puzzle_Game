package com.example.puzzlegame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ChoiceActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView card1;
    public CardView card2;
    public CardView card3;
    public CardView card5;
    public CardView card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);


        //Declaration of options provided in gridlayout
        card1=(CardView) findViewById(R.id.plant);
        //Applying setonclick listener
        card1.setOnClickListener(this);

        //Declaration of options provided in gridlayout
        card2=(CardView) findViewById(R.id.disease);
        //Applying setonclick listener
        card2.setOnClickListener(this);

        //Declaration of options provided in gridlayout
        card3=(CardView) findViewById(R.id.beauty);
        //Applying setonclick listener
        card3.setOnClickListener(this);

        //Declaration of options provided in gridlayout
        card5=(CardView) findViewById(R.id.gallery);
        //Applying setonclick listener
        card5.setOnClickListener(this);

        //Declaration of options provided in gridlayout
        card6=(CardView) findViewById(R.id.camera);
        //Applying setonclick listener
        card6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        //Different cases provided. Clicking on one option will shift the user to the next assigned activity.
        switch (v.getId()){
            case R.id.plant:
                i = new Intent(this,SelectionActivity.class);
                startActivity(i);
                break;

            case R.id.disease:
                i = new Intent(this,Selection2Activity.class);
                startActivity(i);
                break;

            case R.id.beauty:
                i = new Intent(this,Selection3Activity.class);
                startActivity(i);
                break;


            case R.id.gallery:
                i = new Intent(this,GridActivity.class);
                startActivity(i);
                break;

            case R.id.camera:
                i = new Intent(this,GridcActivity.class);
                startActivity(i);
                break;

        }

    }


}