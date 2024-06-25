package com.example.androidmedia;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//import for Toast :

import android.widget.Toast;

//Import Mediaplayer to play audio :

import android.view.View;
import android.media.MediaPlayer;

//Import to play Video :
import android.widget.VideoView;
import android.widget.MediaController;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Function to play audio :
    public void PlayMusic(View view)
    {
        MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.tumhi);
        ring.start();

        //Toast message to display while audio playing
        Toast.makeText(MainActivity.this, "Audio Playing.....",
                Toast.LENGTH_SHORT).show();

    }
    public void PlayVideo(View view)
    {
        VideoView v = findViewById(R.id.videoView2);

        //Set path:
        v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.zeinstu);

        //Create object of media controller class:
        MediaController mediaController = new MediaController((this));

        //Set anchor view for the VideoView2
        mediaController.setAnchorView(v);

        //Set media player to VideoView2
        mediaController.setMediaPlayer(v);

        //set media controller to the VideoView
        v.setMediaController(mediaController);

        //Starts the video:
        v.start();


    }



}