package com.example.developer.instagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean firstTime = true;
    private ImageView allNew;
    private ImageView search;
    private ImageView addNew;
    private ImageView event;
    private ImageView profile;
    private int previous;


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
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentMother, new Fragment1())
                .commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (firstTime == false){
            setAllGrey();
            if(previous == 1){
                allNew.setColorFilter(getResources().getColor(R.color.customBlack));
            }else if(previous == 2){
                search.setColorFilter(getResources().getColor(R.color.customBlack));
            }else if(previous == 4){
                event.setColorFilter(getResources().getColor(R.color.customBlack));
            }else if(previous == 5){
                profile.setColorFilter(getResources().getColor(R.color.customBlack));
            }
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.allNew:{

                previous = 1;
                setAllGrey();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentMother, new Fragment1())
                        .commit();
                allNew.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }
            case R.id.search:{

                previous = 2;
                setAllGrey();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentMother, new Fragment2())
                        .commit();
                search.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }
            case R.id.addNew:{
                firstTime = false;
                setAllGrey();
                Intent intent = new Intent(this,ActivityAdd.class);
                startActivity(intent);
                addNew.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }
            case R.id.event:{

                previous = 4;
                setAllGrey();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentMother, new Fragment4())
                        .commit();
                event.setColorFilter(getResources().getColor(R.color.customBlack));
                break;
            }
            case R.id.profile:{

                previous = 5;
                setAllGrey();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentMother, new Fragment5())
                        .commit();
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
