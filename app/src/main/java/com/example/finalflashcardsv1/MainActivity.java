package com.example.finalflashcardsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_topic1;
    Button button_topic2;
    Button button_topic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_topic1 =(Button) findViewById(R.id.button_topic1);
        button_topic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTopic1();
            }
        });

        button_topic2 =(Button) findViewById(R.id.button_topic2);
        button_topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTopic2();
            }
        });

        button_topic3 =(Button) findViewById(R.id.button_topic3);
        button_topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTopic3();
            }
        });

    }
    public void openTopic1(){
        Intent intent = new Intent(this,Topic1.class);
        startActivity(intent);
    }

    public void openTopic2(){
        Intent intent = new Intent(this,Topic2.class);
        startActivity(intent);
    }

    public void openTopic3(){
        Intent intent = new Intent(this,Topic3.class);
        startActivity(intent);
    }

}
