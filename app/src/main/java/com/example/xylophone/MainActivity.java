package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private Button mbuttonC;
    private Button mbuttonD;
    private Button mbuttonE;
    private Button mbuttonF;
    private Button mbuttonG;
    private Button mbuttonA;
    private Button mbuttonB;
    private SoundPool mSoundPool;
    private int mSoundID_C;
    private int mSoundID_D;
    private int mSoundID_E;
    private int mSoundID_F;
    private int mSoundID_G;
    private int mSoundID_A;
    private int mSoundID_B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbuttonC = findViewById(R.id.buttonC);
        mbuttonD = findViewById(R.id.buttonD);
        mbuttonE = findViewById(R.id.buttonE);
        mbuttonF = findViewById(R.id.buttonF);
        mbuttonG = findViewById(R.id.buttonG);
        mbuttonA = findViewById(R.id.buttonA);
        mbuttonB = findViewById(R.id.buttonB);

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);
        mSoundID_C = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mSoundID_D = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mSoundID_E = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mSoundID_F = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mSoundID_G = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mSoundID_A = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mSoundID_B = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

        mbuttonC.setOnClickListener(this);
        mbuttonD.setOnClickListener(this);
        mbuttonE.setOnClickListener(this);
        mbuttonF.setOnClickListener(this);
        mbuttonG.setOnClickListener(this);
        mbuttonA.setOnClickListener(this);
        mbuttonB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonC:
                mSoundPool.play(mSoundID_C,RIGHT_VOLUME,LEFT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.buttonD:
                mSoundPool.play(mSoundID_D,RIGHT_VOLUME,LEFT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.buttonE:
                mSoundPool.play(mSoundID_E,RIGHT_VOLUME,LEFT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.buttonF:
                mSoundPool.play(mSoundID_F,RIGHT_VOLUME,LEFT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.buttonG:
                mSoundPool.play(mSoundID_G,RIGHT_VOLUME,LEFT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.buttonA:
                mSoundPool.play(mSoundID_A,RIGHT_VOLUME,LEFT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.buttonB:
                mSoundPool.play(mSoundID_B,RIGHT_VOLUME,LEFT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;


        }
    }
}