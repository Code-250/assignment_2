package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

//        create array of data
        ArrayList<ServiceData> arrayList = new ArrayList<>();

        arrayList.add(new ServiceData("Services", "No Services", "Add a premium service to your account now"));
        arrayList.add(new ServiceData("Equipment Installment plan", "$ 480 35", "Due Dec 17,2015"));
        arrayList.add(new ServiceData("Need help?", "6am-10pm 1(800937-97)", "611 from your T-mobile phone"));
        arrayList.add(new ServiceData("Services", "No Services", "Add a premium service to your account now"));
    }
}