package com.escobedo.jees.sound_app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        MediaPlayer sonido1;
        MediaPlayer sonido2;
        MediaPlayer sonido3;

    Button s1;
    Button s2;
    Button s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonido1 =MediaPlayer.create(this,R.raw.homero30);
        sonido2 =MediaPlayer.create(this,R.raw.homero27);
        sonido3 =MediaPlayer.create(this,R.raw.homero28);

        s1= (Button)findViewById(R.id.button);
        s2= (Button)findViewById(R.id.button2);
        s3= (Button)findViewById(R.id.button3);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido1.start();;
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido2.start();;
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido3.start();;
            }
        });
    }
}
