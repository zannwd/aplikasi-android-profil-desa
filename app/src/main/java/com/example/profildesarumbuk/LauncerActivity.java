package com.example.profildesarumbuk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class LauncerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcer); // Buat layout untuk splash screen

        // Delay 2 detik sebelum berpindah ke IntroActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LauncerActivity.this, IntroActivity.class);
                startActivity(intent);
                finish(); // Hapus activity ini dari back stack
            }
        }, 2000); // 2000ms = 2 detik
    }
}
