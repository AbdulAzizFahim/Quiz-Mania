package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mainGame extends AppCompatActivity {

    private TextView txt;
    private Button sb;
    public int point = 0;
    private EditText etxt;
    public int index = 1;
    public String x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        final String[] str = new String[15];
        str[1] = "Question : 1.   2 + 2 = ?";
        str[2] = "Question : 2. solve the Equation :  X = 3 * 2 + 2 * 3";
        str[3] = "Question : 3. what is the only prime which is an even number?";
        str[4] = "Question : 4. 10 & 1 = ?  ";
        str[5] = "Question : 5. A tree has 10 nodes. How many edges does it have?";
        str[6] = "Question : 6. How many divisor do 27 has?";
        str[7] = "Question : 7. What is the decimal value of this binary number : 011001 ";
        str[8] = "Question : 8. Is this a palindrome string : 221222 ?";
        str[9] = "Question : 9. How many odd numbers are present in the first 10 natural numbers? ";
        str[10] = "Question : 10. Is 29 a prime number?  ";

        final String[] ans = new String[15];
        ans[1] = "4";
        ans[2] = "12";
        ans[3] = "2";
        ans[4] = "0";
        ans[5] = "9";
        ans[6] = "3";
        ans[7] = "25";
        ans[8] = "no";
        ans[9] = "5";
        ans[10] = "yes";


        txt = (TextView) findViewById(R.id.gameText);
        sb = (Button) findViewById(R.id.submit);
        etxt = (EditText) findViewById(R.id.myText);


        txt.setText(str[index]);
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                x = etxt.getText().toString();


                if (x.contentEquals("")) {
                } else {
                    if (x.contentEquals(ans[index])) {
                        Toast.makeText(mainGame.this, "Correct", Toast.LENGTH_SHORT).show();
                        point++;
                    } else
                        Toast.makeText(mainGame.this, "Incorrect", Toast.LENGTH_SHORT).show();


                    index++;


                    if (index == 11) {
                        index = 0;
                        Intent tt = new Intent(mainGame.this, finalWindow.class);
                        tt.putExtra("tag", point);
                        startActivity(tt);
                    } else {
                        etxt.setText("");
                        txt.setText(str[index]);

                    }
                }

            }
        });

    }
}