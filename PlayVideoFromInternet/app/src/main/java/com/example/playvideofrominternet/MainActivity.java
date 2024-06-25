package com.example.playvideofrominternet;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//For load from internet :

import android.net.Uri;

import android.view.View;
import android.widget.VideoView;
import android.widget.MediaController;
import android.media.MediaPlayer;


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

    public void PlayVideo(View view)
    {
        VideoView v = findViewById(R.id.videoView);

        //Set path:
//        v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.zeinstu);
        String videoUrl =
                "https://www.youtube.com/watch?v=Hf4V9JDjpf0";
        Uri uri = Uri.parse(videoUrl);
        v.setVideoURI(uri);

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