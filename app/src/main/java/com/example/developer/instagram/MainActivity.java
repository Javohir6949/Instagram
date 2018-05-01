package com.example.developer.instagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView allNew;
    private ImageView search;
    private ImageView addNew;
    private ImageView event;
    private ImageView profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allNew = findViewById(R.id.allNew);
        search = findViewById(R.id.search);
        addNew = findViewById(R.id.addNew);
        event = findViewById(R.id.event);
        profile = findViewById(R.id.profile);
        allNew.setOnClickListener(this);
        search.setOnClickListener(this);
        addNew.setOnClickListener(this);
        event.setOnClickListener(this);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.allNew:{
                setAllGrey();
                allNew.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }
            case R.id.search:{
                setAllGrey();
                search.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }
            case R.id.addNew:{
                setAllGrey();
                addNew.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }
            case R.id.event:{
                setAllGrey();
                event.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }
            case R.id.profile:{
                setAllGrey();
                profile.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }

        }
    }

    private void setAllGrey() {
        allNew.setColorFilter(getResources().getColor(R.color.customGrey));
        search.setColorFilter(getResources().getColor(R.color.customGrey));
        addNew.setColorFilter(getResources().getColor(R.color.customGrey));
        event.setColorFilter(getResources().getColor(R.color.customGrey));
        profile.setColorFilter(getResources().getColor(R.color.customGrey));
    }
}
