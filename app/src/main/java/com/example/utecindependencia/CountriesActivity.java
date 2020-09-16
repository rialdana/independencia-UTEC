package com.example.utecindependencia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.utecindependencia.adapters.CountriesAdapter;
import com.example.utecindependencia.adapters.CountriesListener;
import com.example.utecindependencia.models.Country;
import com.example.utecindependencia.models.Currency;
import com.example.utecindependencia.models.NationalSymbol;

import java.util.ArrayList;

public class CountriesActivity extends AppCompatActivity implements CountriesListener {
    private RecyclerView listCountries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        listCountries = findViewById(R.id.listCountries);
        listCountries.setAdapter(new CountriesAdapter(createAllCountries(), this));
    }

    private ArrayList<Country> createAllCountries() {
        ArrayList<Country> countries = new ArrayList<>();

        // adding a new country to the list
        countries.add(new Country(
                "El Salvador",
                "https://lh3.googleusercontent.com/proxy/hA6gpKplT5yljAsJtxiP9hJPTmi0PEfdlduzp9BYg-2kGggTPxtiQSK15gl2KBt2j-89IBZN3qv8dAlfZltH5Ux7EAwpkwXNjOCHcMMqtc5LwNcAJVWZWfa82osa1Z2yMTc",
                "15 de septiembre de 1811",
                new Currency(
                        "Dolar",
                        "https://ca-times.brightspotcdn.com/dims4/default/1e2a56a/2147483647/strip/true/crop/2000x854+0+0/resize/840x359!/quality/90/?url=https%3A%2F%2Fcalifornia-times-brightspot.s3.amazonaws.com%2F38%2F63%2F41c5de26aa74fdb7d35633811e56%2Fhoyla-usa-billetes-de-10-dolares-tendran-rostr-001",
                        "https://upload.wikimedia.org/wikipedia/commons/7/7b/Obverse_of_the_series_2009_%24100_Federal_Reserve_Note.jpg",
                        "https://cloud10.todocoleccion.online/billetes-extranjeros/tc/2017/10/26/15/101539144_1509024994.jpg"),
                "https://republicadeelsalvador.com/wp-content/uploads/2019/02/escudo-de-el-salvador.jpg",
                new NationalSymbol("Torogoz", "https://www.radioumasferrer.com/images/stories/2016/02/pajarop.jpg"),
                new NationalSymbol("Maquilishuat", "https://www.diariotrv.com/asset/thumbnail,1140,800,center,center//media/diariotrv/images/2019/09/15/2019091509081113431.jpg"))
        );
        countries.add(new Country(
                "Guatemala",
                "https://lh3.googleusercontent.com/proxy/hA6gpKplT5yljAsJtxiP9hJPTmi0PEfdlduzp9BYg-2kGggTPxtiQSK15gl2KBt2j-89IBZN3qv8dAlfZltH5Ux7EAwpkwXNjOCHcMMqtc5LwNcAJVWZWfa82osa1Z2yMTc",
                "15 de septiembre de 1811",
                new Currency(
                        "Dolar",
                        "https://ca-times.brightspotcdn.com/dims4/default/1e2a56a/2147483647/strip/true/crop/2000x854+0+0/resize/840x359!/quality/90/?url=https%3A%2F%2Fcalifornia-times-brightspot.s3.amazonaws.com%2F38%2F63%2F41c5de26aa74fdb7d35633811e56%2Fhoyla-usa-billetes-de-10-dolares-tendran-rostr-001",
                        "https://upload.wikimedia.org/wikipedia/commons/7/7b/Obverse_of_the_series_2009_%24100_Federal_Reserve_Note.jpg",
                        "https://cloud10.todocoleccion.online/billetes-extranjeros/tc/2017/10/26/15/101539144_1509024994.jpg"),
                "https://republicadeelsalvador.com/wp-content/uploads/2019/02/escudo-de-el-salvador.jpg",
                new NationalSymbol("Torogoz", "https://www.radioumasferrer.com/images/stories/2016/02/pajarop.jpg"),
                new NationalSymbol("Maquilishuat", "https://www.diariotrv.com/asset/thumbnail,1140,800,center,center//media/diariotrv/images/2019/09/15/2019091509081113431.jpg"))
        );

        return countries;
    }

    @Override
    public void selectCountry(Country country) {
        //Toast.makeText(this, country.getName(), Toast.LENGTH_SHORT-30).show();
        Intent intent = new Intent(this, CountryDetailActivity.class);

        intent.putExtra("intentCountry", country);
        startActivity(intent);
    }
}