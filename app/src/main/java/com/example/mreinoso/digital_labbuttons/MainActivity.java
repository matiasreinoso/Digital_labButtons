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
            imgBtn26,
            imgBtn27,
            imgBtn28,
            imgBtn29,
            imgBtn30,
            imgBtn31,
            imgBtn32,
            imgBtn33,
            imgBtn34,
            imgBtn35,
            imgBtn36,
            imgBtn37,
            imgBtn38,
            imgBtn39,
            imgBtn40,
            imgBtn41,
            imgBtn42,
            imgBtn43,
            imgBtn44,
            imgBtn45,
            imgBtn46,
            imgBtn47,
            imgBtn48,
            imgBtn49;

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
        imgBtn24 = (Button) findViewById(R.id.imageButton24);
        imgBtn25 = (Button) findViewById(R.id.imageButton25);
        imgBtn26 = (Button) findViewById(R.id.imageButton26);
        imgBtn27 = (Button) findViewById(R.id.imageButton27);
        imgBtn28 = (Button) findViewById(R.id.imageButton28);
        imgBtn29 = (Button) findViewById(R.id.imageButton29);
        imgBtn30 = (Button) findViewById(R.id.imageButton30);
        imgBtn31 = (Button) findViewById(R.id.imageButton31);
        imgBtn32 = (Button) findViewById(R.id.imageButton32);
        imgBtn33 = (Button) findViewById(R.id.imageButton33);
        imgBtn34 = (Button) findViewById(R.id.imageButton34);
        imgBtn35 = (Button) findViewById(R.id.imageButton35);
        imgBtn36 = (Button) findViewById(R.id.imageButton36);
        imgBtn37 = (Button) findViewById(R.id.imageButton37);
        imgBtn38 = (Button) findViewById(R.id.imageButton38);
        imgBtn39 = (Button) findViewById(R.id.imageButton39);
        imgBtn40 = (Button) findViewById(R.id.imageButton40);
        imgBtn41 = (Button) findViewById(R.id.imageButton41);
        imgBtn42 = (Button) findViewById(R.id.imageButton42);
        imgBtn43 = (Button) findViewById(R.id.imageButton43);
        imgBtn44 = (Button) findViewById(R.id.imageButton44);
        imgBtn45 = (Button) findViewById(R.id.imageButton45);
        imgBtn46 = (Button) findViewById(R.id.imageButton46);
        imgBtn47 = (Button) findViewById(R.id.imageButton47);
        imgBtn48 = (Button) findViewById(R.id.imageButton48);
        imgBtn49 = (Button) findViewById(R.id.imageButton49);


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
        imgBtn27.setOnClickListener(this);
        imgBtn28.setOnClickListener(this);
        imgBtn29.setOnClickListener(this);
        imgBtn30.setOnClickListener(this);


        imgBtn31.setOnClickListener(this);
        imgBtn32.setOnClickListener(this);
        imgBtn33.setOnClickListener(this);
        imgBtn34.setOnClickListener(this);
        imgBtn35.setOnClickListener(this);
        imgBtn36.setOnClickListener(this);
        imgBtn37.setOnClickListener(this);
        imgBtn38.setOnClickListener(this);
        imgBtn39.setOnClickListener(this);
        imgBtn40.setOnClickListener(this);
        imgBtn41.setOnClickListener(this);
        imgBtn42.setOnClickListener(this);
        imgBtn43.setOnClickListener(this);
        imgBtn44.setOnClickListener(this);
        imgBtn45.setOnClickListener(this);
        imgBtn46.setOnClickListener(this);
        imgBtn47.setOnClickListener(this);
        imgBtn48.setOnClickListener(this);
        imgBtn49.setOnClickListener(this);
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
            case R.id.imageButton27:
                idAudio = R.raw.clari_polen;
                break;
            case R.id.imageButton28:
                idAudio = R.raw.juanma_pollo;
                break;
            case R.id.imageButton29:
                idAudio = R.raw.juanma_pollo2;
                break;
            case R.id.imageButton30:
                idAudio = R.raw.juanma_fede;
                break;

            case R.id.imageButton31:
                idAudio = R.raw.cachi_comio;
                break;
            case R.id.imageButton32:
                idAudio = R.raw.mati_7juanma;
                break;
            case R.id.imageButton33:
                idAudio = R.raw.juanma_uber;
                break;
            case R.id.imageButton34:
                idAudio = R.raw.juanma_petinato;
                break;
            case R.id.imageButton35:
                idAudio = R.raw.juanma_loco;
                break;
            case R.id.imageButton36:
                idAudio = R.raw.juanma_gamba70;
                break;
            case R.id.imageButton37:
                idAudio = R.raw.juanma_farsante;
                break;
            case R.id.imageButton38:
                idAudio = R.raw.juanma_cachi_perri;
                break;
            case R.id.imageButton39:
                idAudio = R.raw.juanma_bella_ciao;
                break;
            case R.id.imageButton40:
                idAudio = R.raw.juani_valeria_del_mar;
                break;
            case R.id.imageButton41:
                idAudio = R.raw.fede_ruta11;
                break;

            case R.id.imageButton42:
                idAudio = R.raw.juani_mdp;
                break;
            case R.id.imageButton43:
                idAudio = R.raw.fede_tarado;
                break;
            case R.id.imageButton44:
                idAudio = R.raw.fede_rosebar;
                break;
            case R.id.imageButton45:
                idAudio = R.raw.fede_minas;
                break;
            case R.id.imageButton46:
                idAudio = R.raw.fede_mati;
                break;
            case R.id.imageButton47:
                idAudio = R.raw.fede_ari2;
                break;
            case R.id.imageButton48:
                idAudio = R.raw.fede_mate;
                break;
            case R.id.imageButton49:
                idAudio = R.raw.fede_chiste;
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

