package com.example.utecindependencia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.utecindependencia.models.Country;

public class CountryDetailActivity extends AppCompatActivity {
    private Country country;
    private TextView NombrePais, FechaI, Moneda;
    private Toolbar mToolbar;
    private   ImageView imageViewmapa, imageViewEscudo, imageViewAve, imageViewarbol ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        country = (Country) getIntent().getSerializableExtra("intentCountry");
        Toast.makeText(this, country.getName(), Toast.LENGTH_SHORT-30).show();

        mToolbar= findViewById(R.id.toolbar_countries);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        NombrePais = findViewById(R.id.nombrePais);
        NombrePais.setText(country.getName());

        FechaI = findViewById(R.id.fecha);
        FechaI.setText(country.getIndependenceDate());

        Moneda=findViewById(R.id.moneda);
        Moneda.setText(country.getCurrency().getCurrencyName());

        imageViewmapa=(ImageView )findViewById(R.id.imgMapa);
        imageViewEscudo= (ImageView ) findViewById(R.id.escudo);
        imageViewAve=(ImageView ) findViewById(R.id.ave);
        imageViewarbol=(ImageView )findViewById(R.id.arbol);

        Glide.with(imageViewmapa.getContext()).load(country.getMapImage()).into(imageViewmapa);
        Glide.with(imageViewAve.getContext()).load(country.getNationalBird().getImage()).into(imageViewAve);
        Glide.with(imageViewarbol.getContext()).load(country.getNationalTree().getImage()).into(imageViewarbol);
        Glide.with(imageViewEscudo.getContext()).load(country.getNationalShieldImage()).into(imageViewEscudo);

        imageViewAve.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(imageViewmapa.getContext() ,country.getNationalBird().getName(), Toast.LENGTH_SHORT).show();
            }
        });

        imageViewarbol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(imageViewarbol.getContext() ,country.getNationalTree().getName(), Toast.LENGTH_SHORT).show();
            }
        });

        Moneda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(Moneda.getContext() ,country.getCurrency().getCurrencyName(), Toast.LENGTH_SHORT).show();
                selectCurrency(country);
            }
        });
    }

    public void selectCurrency(Country country) {
        Intent intent = new Intent(this, Currency_detail.class);
        intent.putExtra("intentCurrency", country);
        startActivity(intent);
    }

}