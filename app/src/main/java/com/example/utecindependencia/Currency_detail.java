package com.example.utecindependencia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.utecindependencia.models.Country;

public class Currency_detail extends AppCompatActivity {
    private Country country;
    private TextView nameCurrency;
    private ImageView imgCurrencyOne,imgCurrencyTwo,imgCurrencyThree;
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_detail);
        country = (Country) getIntent().getSerializableExtra("intentCurrency");
        nameCurrency=findViewById(R.id.nomMoneda);
        imgCurrencyOne=(ImageView)findViewById(R.id.imgCurrencyOne);
        imgCurrencyTwo=(ImageView)findViewById(R.id.imgCurrencyTwo);
        imgCurrencyThree=(ImageView)findViewById(R.id.imgCurrencyThree);

        mToolbar= findViewById(R.id.toolbar_country);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        nameCurrency.setText(country.getCurrency().getCurrencyName());
        Glide.with(imgCurrencyOne.getContext()).load(country.getCurrency().getCurrencyImageOne()).into(imgCurrencyOne);
        Glide.with(imgCurrencyTwo.getContext()).load(country.getCurrency().getCurrencyImageTwo()).into(imgCurrencyTwo);
        Glide.with(imgCurrencyThree.getContext()).load(country.getCurrency().getCurrencyImageThree()).into(imgCurrencyThree);


    }
}