package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;

public class scoreWindow extends AppCompatActivity {

    public TextView Text1;
    public TextView Text2;
    public TextView Text3;
    public TextView Text4;
    public TextView Text5;
    public String flag = "false";
    public String str1;
    public String str2;


    public int index = 1;
    public String[] score = new String[15];
    public String line;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_window);


        Text1 = (TextView) findViewById(R.id.text1);
        Text2 = (TextView) findViewById(R.id.text2);
        Text3 = (TextView) findViewById(R.id.text3);
        Text4 = (TextView) findViewById(R.id.text4);
        Text5 = (TextView) findViewById(R.id.text5);

        Bundle bundle = getIntent().getExtras();
        str1 = "     Fahim                   900";
        if (bundle != null) {
            flag = bundle.getString("bol");
            str1 = bundle.getString("tag1");
            str2 = bundle.getString("tag2");
            str1 = "     " + str1 + "                    " + str2;

        }

        Text1.setText(str1);
        str1 = "     Rifat                      900";
        Text2.setText(str1);

        str1 = "     Pabon                   800";

        Text3.setText(str1);

        str1 = "     Saief                      700";
        Text4.setText(str1);
        str1 = "     Mak                       600";
        Text5.setText(str1);

    }
}
