package com.Muh.syaefudin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nik, nama,nokk, alamat;
    Spinner pilihan;
    Button daftar;
    String[] kelas ={"kelas pagi","kelas sore"};
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nik = findViewById(R.id.Etnik);
        nama = findViewById(R.id.Etnama);
        nokk = findViewById(R.id.Etnokk);
        alamat = findViewById(R.id.Etalamat);
        daftar = findViewById(R.id.btndaftar);
        pilihan = findViewById(R.id.Spinner);
        tvhasil = findViewById(R.id.tvhasil);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pilihan.getSelectedItem().toString().equals(kelas[0])) {
                    tvhasil.setText("Akhwan, Harus Bisa Membaca Al quran");
                } else {
                    tvhasil.setText("Akhwat, Harus Bisa Membaca Al quran");
                }
            }


        });
        ArrayAdapter adapter1= new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, kelas);
        pilihan.setAdapter(adapter1);
    }
}
