package com.example.profildesarumbuk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tombol navigasi ke halaman lain
        findViewById(R.id.btn_peta_desa).setOnClickListener(v -> openActivity(PetaDesaActivity.class));
        findViewById(R.id.btn_sejarah).setOnClickListener(v -> openActivity(SejarahActivity.class));
        findViewById(R.id.btn_geografis).setOnClickListener(v -> openActivity(GeografisActivity.class));
        findViewById(R.id.btn_perekonomian).setOnClickListener(v -> openActivity(PerekonomianActivity.class));
        findViewById(R.id.btn_sosial_budaya).setOnClickListener(v -> openActivity(SosialBudayaActivity.class));
        findViewById(R.id.btn_sarana_prasarana).setOnClickListener(v -> openActivity(SaranaPrasaranaActivity.class));

        // Tombol untuk Hubungi Kami
        findViewById(R.id.btn_hubungi_kami).setOnClickListener(v -> openWhatsApp());
    }

    // Metode untuk membuka halaman lain
    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

    // Metode untuk membuka WhatsApp
    private void openWhatsApp() {
        String phoneNumber = "6287840453339"; // Ganti dengan nomor WhatsApp Anda, gunakan kode negara (62 untuk Indonesia).
        String message = "Halo, saya ingin bertanya tentang Profil Desa Rumbuk Timur."; // Pesan default yang akan dikirim.

        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message)));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
