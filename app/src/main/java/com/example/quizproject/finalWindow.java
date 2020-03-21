package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class finalWindow extends AppCompatActivity {


    private TextView score;
    private Button butam;
    private String str;
    private EditText nam;
    public String sco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_window);

        score = (TextView) findViewById(R.id.score);

        Bundle bundle = getIntent().getExtras();

        int value = bundle.getInt("tag");

        sco = Integer.toString(value);
        int x = Integer.parseInt(sco);
        x = x * 100;
        sco = Integer.toString(x);
        score.setText(sco);


        butam = (Button) findViewById(R.id.butam);

        nam = (EditText) findViewById(R.id.nam);

        butam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(finalWindow.this, Menu.class);
                tt.putExtra("tag1", nam.getText().toString());
                tt.putExtra("tag2", sco);
                startActivity(tt);

            }
        });


    }
}
