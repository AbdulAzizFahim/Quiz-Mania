package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    public String str1 = "";
    public String str2 = "";
    public String flag = "false";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            flag = "true";
            str1 = bundle.getString("tag1");
            str2 = bundle.getString("tag2");
        }


        btn1 = (Button) findViewById(R.id.startButton);
        btn2 = (Button) findViewById(R.id.scoreButton);
        btn3 = (Button) findViewById(R.id.exitButton);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, mainGame.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, scoreWindow.class);
                if (flag == "true") {
                    intent.putExtra("tag1", str1);
                    intent.putExtra("tag2", str2);
                    intent.putExtra("bol", flag);
                }
                startActivity(intent);

            }
        });


    }
}
