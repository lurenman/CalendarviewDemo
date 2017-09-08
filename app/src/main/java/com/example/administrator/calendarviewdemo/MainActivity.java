package com.example.administrator.calendarviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_CalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initEvents();

    }
    private void initViews() {
        tv_CalendarView = (TextView) findViewById(R.id.tv_CalendarView);
    }
    private void initEvents() {
        tv_CalendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CalendarViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
