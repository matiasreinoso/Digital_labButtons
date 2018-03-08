package com.example.mreinoso.digital_labbuttons;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    MediaPlayer mp = new MediaPlayer();
    Button imgBtn1, imgBtn2, imgBtn3, imgBtn4, imgBtn5, imgBtn6, imgBtn7, imgBtn8, imgBtn9,
            imgBtn10, imgBtn11, imgBtn12,
            imgBtn13,
            imgBtn14,
            imgBtn15,
            imgBtn16,
            imgBtn17,
            imgBtn18,
            imgBtn19,
            imgBtn20,
            imgBtn21,
            imgBtn22,
            imgBtn23,
            imgBtn24,
            imgBtn25,
            imgBtn26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgBtn1 = (Button) findViewById(R.id.imageButton);
        imgBtn2 = (Button) findViewById(R.id.imageButton2);
        imgBtn3 = (Button) findViewById(R.id.imageButton3);
        imgBtn4 = (Button) findViewById(R.id.imageButton4);
        imgBtn5 = (Button) findViewById(R.id.imageButton5);
        imgBtn6 = (Button) findViewById(R.id.imageButton6);
        imgBtn7 = (Button) findViewById(R.id.imageButton7);
        imgBtn8 = (Button) findViewById(R.id.imageButton8);
        imgBtn9 = (Button) findViewById(R.id.imageButton9);
        imgBtn10 = (Button) findViewById(R.id.imageButton10);
        imgBtn11 = (Button) findViewById(R.id.imageButton11);
        imgBtn12 = (Button) findViewById(R.id.imageButton12);
        imgBtn13 = (Button) findViewById(R.id.imageButton13);
        imgBtn14 = (Button) findViewById(R.id.imageButton14);
        imgBtn15 = (Button) findViewById(R.id.imageButton15);
        imgBtn16 = (Button) findViewById(R.id.imageButton16);
        imgBtn17 = (Button) findViewById(R.id.imageButton17);
        imgBtn18 = (Button) findViewById(R.id.imageButton18);
        imgBtn19 = (Button) findViewById(R.id.imageButton19);
        imgBtn20 = (Button) findViewById(R.id.imageButton20);
        imgBtn21 = (Button) findViewById(R.id.imageButton21);
        imgBtn22 = (Button) findViewById(R.id.imageButton22);
        imgBtn23 = (Button) findViewById(R.id.imageButton23);
        imgBtn24 = (Button) findViewById(R.id.imageButton23);
        imgBtn25 = (Button) findViewById(R.id.imageButton23);
        imgBtn26 = (Button) findViewById(R.id.imageButton23);

        imgBtn1.setOnClickListener(this);
        imgBtn2.setOnClickListener(this);
        imgBtn3.setOnClickListener(this);
        imgBtn4.setOnClickListener(this);
        imgBtn5.setOnClickListener(this);
        imgBtn6.setOnClickListener(this);
        imgBtn7.setOnClickListener(this);
        imgBtn8.setOnClickListener(this);
        imgBtn9.setOnClickListener(this);
        imgBtn10.setOnClickListener(this);
        imgBtn11.setOnClickListener(this);
        imgBtn12.setOnClickListener(this);
        imgBtn13.setOnClickListener(this);
        imgBtn14.setOnClickListener(this);
        imgBtn15.setOnClickListener(this);
        imgBtn16.setOnClickListener(this);
        imgBtn17.setOnClickListener(this);
        imgBtn18.setOnClickListener(this);
        imgBtn19.setOnClickListener(this);
        imgBtn20.setOnClickListener(this);
        imgBtn21.setOnClickListener(this);
        imgBtn22.setOnClickListener(this);
        imgBtn23.setOnClickListener(this);
        imgBtn24.setOnClickListener(this);
        imgBtn25.setOnClickListener(this);
        imgBtn26.setOnClickListener(this);
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
                idAudio = R.raw.quehaceperri;
                break;
            case R.id.imageButton9:
                idAudio = R.raw.venite_dale;
                break;
            case R.id.imageButton10:
                idAudio = R.raw.perri;
                break;
            case R.id.imageButton11:
                idAudio = R.raw.minutos;
                break;
            case R.id.imageButton12:
                idAudio = R.raw.cagon;
                break;
            case R.id.imageButton13:
                idAudio = R.raw.rosebar;
                break;
            case R.id.imageButton14:
                idAudio = R.raw.china_aparece;
                break;
            case R.id.imageButton15:
                idAudio = R.raw.china_caliente;
                break;
            case R.id.imageButton16:
                idAudio = R.raw.juli_bar;
                break;
            case R.id.imageButton17:
                idAudio = R.raw.botonera;
                break;
            case R.id.imageButton18:
                idAudio = R.raw.sabado_casa;
                break;
            case R.id.imageButton19:
                idAudio = R.raw.too_much;
                break;
            case R.id.imageButton20:
                idAudio = R.raw.sin_palabras;
                break;
            case R.id.imageButton21:
                idAudio = R.raw.escucho;
                break;
            case R.id.imageButton22:
                idAudio = R.raw.estantodos;
                break;
            case R.id.imageButton23:
                idAudio = R.raw.arii;
                break;
            case R.id.imageButton24:
                idAudio = R.raw.ahbueno;
                break;
            case R.id.imageButton25:
                idAudio = R.raw.untemon;
                break;
            case R.id.imageButton26:
                idAudio = R.raw.uncalor;
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

