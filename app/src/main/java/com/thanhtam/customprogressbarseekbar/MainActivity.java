package com.thanhtam.customprogressbarseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
SeekBar seekBar2;
    TextView tvProgress,tvLimit,tvFurther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar2 = (SeekBar)findViewById(R.id.seekBar2);
        tvProgress = (TextView)findViewById(R.id.tvProgress);
        tvLimit = (TextView)findViewById(R.id.tvLimit);
        tvFurther = (TextView)findViewById(R.id.tvFurther);
        seekBar2.setMax(5000);

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvProgress.setText(progress+"ms/so");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                tvLimit.setVisibility(View.VISIBLE);
                tvFurther.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tvLimit.setVisibility(View.GONE);
                tvFurther.setVisibility(View.GONE);
            }
        });
    }
}
