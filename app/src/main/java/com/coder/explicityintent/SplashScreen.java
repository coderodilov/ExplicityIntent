package com.coder.explicityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.coder.explicityintent.databinding.ActivitySplashScreenBinding;

import java.util.concurrent.atomic.AtomicInteger;

public class SplashScreen extends AppCompatActivity {

    private ActivitySplashScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] logos = {R.drawable.android, R.drawable.window, R.drawable.linux};
        AtomicInteger counter = new AtomicInteger(0);

        CountDownTimer countDownTimer = new CountDownTimer(1800,600) {
            @Override
            public void onTick(long millisUntilFinished) {
                binding.logos.setImageResource(logos[counter.get()]);
                counter.getAndIncrement();
            }
            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();

    }
}