package com.example.administrator.calendarviewdemo;

import android.support.annotation.NonNull;
import android.widget.Toast;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

import java.util.Calendar;

/**
 * Created by Administrator on 2017/9/8.
 * 引用控件
 * https://github.com/prolificinteractive/material-calendarview
 */

public class CalendarViewActivity extends BaseActivity {
    private MaterialCalendarView calendarView;

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_calendar);
        calendarView = (MaterialCalendarView) findViewById(R.id.calendarView);
        //编辑日历属性
        calendarView.state().edit()
                .setFirstDayOfWeek(Calendar.MONDAY)   //设置每周开始的第一天
                .setMinimumDate(CalendarDay.from(2010, 4, 3))  //设置可以显示的最早时间
                .setMaximumDate(CalendarDay.from(2018, 5, 12))//设置可以显示的最晚时间
                .setCalendarDisplayMode(CalendarMode.MONTHS)//设置显示模式，可以显示月的模式，也可以显示周的模式
                .commit();// 返回对象并保存

    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        calendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                int year = date.getYear();
                int month = date.getMonth() + 1; //月份跟系统一样是从0开始的，实际获取时要加1
                int day = date.getDay();
                Toast.makeText(getApplicationContext(), date.toString() + "你选中的是：" + year + "-" + month + "-" + day, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void loadData() {

    }
}
