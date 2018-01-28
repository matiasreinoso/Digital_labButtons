package com.example.mreinoso.digital_labbuttons;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    MediaPlayer mp = new MediaPlayer();
    ImageButton imgBtn1, imgBtn2, imgBtn3, imgBtn4, imgBtn5, imgBtn6, imgBtn7, imgBtn8, imgBtn9, imgBtn10, imgBtn11, imgBtn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtn1 = (ImageButton) findViewById(R.id.imageButton);
        imgBtn2 = (ImageButton) findViewById(R.id.imageButton2);
        imgBtn3 = (ImageButton) findViewById(R.id.imageButton3);
        imgBtn4 = (ImageButton) findViewById(R.id.imageButton4);
        imgBtn5 = (ImageButton) findViewById(R.id.imageButton5);
        imgBtn6 = (ImageButton) findViewById(R.id.imageButton6);
        imgBtn7 = (ImageButton) findViewById(R.id.imageButton7);
        imgBtn8 = (ImageButton) findViewById(R.id.imageButton8);
        imgBtn9 = (ImageButton) findViewById(R.id.imageButton9);
        imgBtn10 = (ImageButton) findViewById(R.id.imageButton10);
        imgBtn11 = (ImageButton) findViewById(R.id.imageButton11);
        imgBtn12 = (ImageButton) findViewById(R.id.imageButton12);
    }

    @Override
    public void onClick(View v) {

        int idAudio = R.raw.eee;

        switch (v.getId()) {
            case R.id.imageButton:
                idAudio = R.raw.eee;
                break;
            case R.id.imageButton2:
                idAudio = R.raw.besis;
                break;
            case R.id.imageButton3:
                idAudio = R.raw.caroo;
                break;
            case R.id.imageButton4:
                idAudio = R.raw.chicos;
                break;
            case R.id.imageButton5:
                idAudio = R.raw.juanmagato;
                break;
            case R.id.imageButton6:
                idAudio = R.raw.ohpordios;
                break;
            case R.id.imageButton7:
                idAudio = R.raw.sirens;
                break;
            case R.id.imageButton8:
                idAudio = R.raw.eee;
                break;
            case R.id.imageButton9:
                idAudio = R.raw.eee;
                break;
            case R.id.imageButton10:
                idAudio = R.raw.eee;
                break;
            case R.id.imageButton11:
                idAudio = R.raw.eee;
                break;
            case R.id.imageButton12:
                idAudio = R.raw.eee;
                break;
        }

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, idAudio);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();
    }


}

