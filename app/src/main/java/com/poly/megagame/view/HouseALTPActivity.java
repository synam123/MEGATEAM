package com.poly.megagame.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.poly.megagame.R;


public class HouseALTPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_altp);


    }

    public void onClickPlayNow(View view) {
        startActivity(new Intent(getApplicationContext(), PlayGameALTPActivity.class));
    }

    public void onClickAddRequestion(View view) {
        startActivity(new Intent(getApplicationContext(),AddRequestionALTPActivity.class));
    }
}
