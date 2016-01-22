package com.example.akshay.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        Button program = (Button) findViewById(R.id.programming);
        Button notes = (Button) findViewById(R.id.notes);
        Button videos = (Button) findViewById(R.id.videos);
        Button forum = (Button) findViewById(R.id.forum);

        notes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        NotesListActivity.class);
                startActivity(i);
                finish();
            }
        });

        videos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        NotesListActivity.class);
                startActivity(i);
                finish();
            }
        });

        forum.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Main.class);
                startActivity(i);
                finish();
            }
        });
    }

}
