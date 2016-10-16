package com.akazam.mdcoordinator.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.SeekBar;

import com.akazam.mdcoordinator.R;

public class New2Activity extends AppCompatActivity {

    private CardView card_view;
    private SeekBar seek_ele;
    private SeekBar seek_z;
    private SeekBar seekBar_rad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        initView();
    }

    private void initView() {
        card_view = (CardView) findViewById(R.id.card_view);
        seek_ele = (SeekBar) findViewById(R.id.seek_ele);
        seek_z = (SeekBar) findViewById(R.id.seek_z);
        seek_ele.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                card_view.setCardElevation(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                card_view.setCardElevation(seekBar.getProgress());
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                card_view.setCardElevation(seekBar.getProgress());
            }
        });
        seek_z.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                card_view.setTranslationZ(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                card_view.setTranslationZ(seekBar.getProgress());
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                card_view.setTranslationZ(seekBar.getProgress());
            }
        });
        seekBar_rad = (SeekBar) findViewById(R.id.seekBar_rad);
        seekBar_rad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                card_view.setRadius(seekBar_rad.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                card_view.setRadius(seekBar_rad.getProgress());
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                card_view.setRadius(seekBar_rad.getProgress());
            }
        });
    }
}
