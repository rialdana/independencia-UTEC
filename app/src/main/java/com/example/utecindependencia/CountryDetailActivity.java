package com.example.utecindependencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.utecindependencia.models.Country;

public class CountryDetailActivity extends AppCompatActivity {
    private Country country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        country = (Country) getIntent().getSerializableExtra("intentCountry");
        Toast.makeText(this, country.getName(), Toast.LENGTH_SHORT-30).show();
    }
}