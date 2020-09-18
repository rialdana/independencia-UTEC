package com.example.utecindependencia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.example.utecindependencia.adapters.CountriesAdapter;
import com.example.utecindependencia.adapters.CountriesListener;
import com.example.utecindependencia.models.Country;
import com.example.utecindependencia.models.Currency;
import com.example.utecindependencia.models.NationalSymbol;

import java.util.ArrayList;

public class CountriesActivity extends AppCompatActivity implements CountriesListener {
    private RecyclerView listCountries;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        listCountries = findViewById(R.id.listCountries);
        listCountries.setAdapter(new CountriesAdapter(createAllCountries(), this));

        mToolbar= findViewById(R.id.toolbar_countries);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private ArrayList<Country> createAllCountries() {
        ArrayList<Country> countries = new ArrayList<>();

        // adding a new country to the list
        countries.add(new Country(
                "El Salvador",
                "https://lh3.googleusercontent.com/-G6KpHf6_6LI/U06e5BwE75I/AAAAAAAAERc/AYsBwg3Xv-Q/s600/mapa-de-el-salvador-departamentos.png",
                "15 de septiembre de 1821",
                new Currency(
                        "Dolar Estadounidense",
                        "https://2.bp.blogspot.com/-wMDJNAh0mD0/WcgcWEEunoI/AAAAAAAADQA/b7tmp4je-IwAQKy2V3rMj2RPAUP91-UaQCLcBGAs/s1600/dolar.jpg",
                        "https://3.bp.blogspot.com/--QYZQzeYDdU/WcgcVtsuzNI/AAAAAAAADP8/hfY8X80cDzw1aH8cciN7W0TKtw1bQuOFgCLcBGAs/s1600/images.jpg",
                        "https://2.bp.blogspot.com/-b2FJpDwRRSA/WcgcXdPlkYI/AAAAAAAADQE/0Elqd6vCe4sCxOhfnY5HP5JbrYy-OyhbgCLcBGAs/s1600/monedas-americanas.png"),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Coat_of_arms_of_El_Salvador.svg/800px-Coat_of_arms_of_El_Salvador.svg.png",
                new NationalSymbol("Torogoz", "https://www.radioumasferrer.com/images/stories/2016/02/pajarop.jpg"),
                new NationalSymbol("Maquilishuat (Tabebuia Rosea)", "https://www.diariotrv.com/asset/thumbnail,1140,800,center,center//media/diariotrv/images/2019/09/15/2019091509081113431.jpg"))
        );
        countries.add(new Country(
                "Guatemala",
                "https://d-maps.com/m/america/guatemala/guatemala21.gif",
                "15 de septiembre de 1821",
                new Currency(
                        "Quetzal",
                        "https://3.bp.blogspot.com/-Lq3mM6pM2zM/WcgbzaBUglI/AAAAAAAADP0/quQ_Qvl5_OUL57lr4-WYvHI_lDTd6Gk2wCLcBGAs/s1600/1qgua.jpg",
                        "https://1.bp.blogspot.com/-r6rkZIQ9RQc/Wcgby9Ie9II/AAAAAAAADPw/D98I5WhyxEwZo4FX9oFfJFt7DroJwSY-gCLcBGAs/s1600/Billete%2Bde%2B5.jpg",
                        "https://2.bp.blogspot.com/-uivfkUSrV-4/Wcgbzrw6gCI/AAAAAAAADP4/lpKdb-oFr70Hgmkf-0oYs1_gBcS7qd9oQCLcBGAs/s1600/Quetzal_monedas.png"),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Coat_of_arms_of_Guatemala.svg/512px-Coat_of_arms_of_Guatemala.svg.png",
                new NationalSymbol("Quetzal (Pharomacrus mocinno)", "http://4.bp.blogspot.com/_JjjPYIIKotc/TN8ZsjQMOpI/AAAAAAAAABs/lbcsPD6LOdc/s1600/quetzal-ave-nacional-guatemala.jpg"),
                new NationalSymbol("Ceiba Pentandra", "https://st-listas.20minutos.es/images/2014-11/389289/4568603_640px.jpg?1557914525"))
        );
        countries.add(new Country(
                "Belice",
                "https://d-maps.com/m/america/belize/belize21.gif",
                "21 de septiembre de 1821",
                new Currency(
                        "Dólar Beliceño",
                        "https://ca-times.brightspotcdn.com/dims4/default/1e2a56a/2147483647/strip/true/crop/2000x854+0+0/resize/840x359!/quality/90/?url=https%3A%2F%2Fcalifornia-times-brightspot.s3.amazonaws.com%2F38%2F63%2F41c5de26aa74fdb7d35633811e56%2Fhoyla-usa-billetes-de-10-dolares-tendran-rostr-001",
                        "https://upload.wikimedia.org/wikipedia/commons/7/7b/Obverse_of_the_series_2009_%24100_Federal_Reserve_Note.jpg",
                        "https://cloud10.todocoleccion.online/billetes-extranjeros/tc/2017/10/26/15/101539144_1509024994.jpg"),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Coat_of_arms_of_Belize.svg/500px-Coat_of_arms_of_Belize.svg.png",
                new NationalSymbol("Tucán de Quilla o Picoiris (Ramphastos Solfurantus)", "http://4.bp.blogspot.com/_JjjPYIIKotc/TN8aSGY2CVI/AAAAAAAAABw/v1vLKO3vV6Q/s1600/picoier.jpg"),
                new NationalSymbol("Caoba de las Indicias Occidentales (Swietenia mahagoni)", "https://paisajismodigital.com/blog/wp-content/uploads/2017/11/Swietenia-Macrophylla.jpg"))
        );
        countries.add(new Country(
                "Honduras",
                "https://d-maps.com/m/america/honduras/honduras21.gif",
                "15 de septiembre de 1821",
                new Currency(
                        "Lempira",
                        "https://2.bp.blogspot.com/-J-vlu9ZzHf8/WcgcwxQ2USI/AAAAAAAADQM/E8pfBaJTeFMNga64WVDezbkCr2VmBYMNwCLcBGAs/s1600/869_001-e1472656518774.jpg",
                        "https://1.bp.blogspot.com/-rmXs8iUDmgc/Wcgcw--dOjI/AAAAAAAADQQ/KV8AbRhFzOEO8PWhESE3Xwlm4bRjts0YACLcBGAs/s1600/un-lempira.jpg",
                        "https://2.bp.blogspot.com/-5S00Wt_voBM/Wcgcwvvsh7I/AAAAAAAADQI/lMmhAD0YDNgiHPiPoqgp3nobFeqpy9-1wCLcBGAs/s1600/HNL_coins.jpg"),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Coat_of_arms_of_Honduras.svg/507px-Coat_of_arms_of_Honduras.svg.png",
                new NationalSymbol("Lapa Roja (Ara macao)", "http://4.bp.blogspot.com/_JjjPYIIKotc/TN8fKSOYEoI/AAAAAAAAAB4/OX6VCo7kzsI/s1600/LAPA.jpg"),
                new NationalSymbol("Pino (Pinus oocarpa, o pino ocote)", "https://paisajismodigital.com/blog/wp-content/uploads/2017/11/Pinus-oocarpa-768x1024.jpg"))
        );
        countries.add(new Country(
                "Nicaragua",
                "https://d-maps.com/m/america/nicaragua/nicaragua21.gif",
                "15 de septiembre de 1821",
                new Currency(
                        "Córdoba",
                        "https://1.bp.blogspot.com/-ncQG22HzlPI/WcgdRR_Vc1I/AAAAAAAADQU/hho9NrLWOu8kXzekEKhzLfp5K-_tvCdjQCLcBGAs/s1600/1_cordoba_Nicaragua_1990_recto.jpg",
                        "https://2.bp.blogspot.com/-7GGT01KmZnY/WcgdRZGeARI/AAAAAAAADQY/y-M2pAYiVeEMo816IoLgDjEa-UzD0IbdgCLcBGAs/s1600/S_6247-MLA91399478_2872-O.jpg",
                        "https://1.bp.blogspot.com/-8W4KEY0qpsc/WcgdRiKQR5I/AAAAAAAADQc/1NaGyUiSVFgZTYnVJLZ-0diEuNB-zuu3ACLcBGAs/s1600/650_cordoba_nicaragua.png"),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Coat_of_arms_of_Nicaragua.svg/500px-Coat_of_arms_of_Nicaragua.svg.png",
                new NationalSymbol("Guardabarranco (Eumomota superciliosa)", "http://1.bp.blogspot.com/_JjjPYIIKotc/TN8M_IM7ofI/AAAAAAAAABc/jYp2B8Y6nZ0/s1600/110153527.Su7jp7Qm.jpg"),
                new NationalSymbol("Madroño", "https://live.staticflickr.com/3150/3100943513_2214026b6f_b.jpg"))
        );
        countries.add(new Country(
                "Costa Rica",
                "https://d-maps.com/m/america/costa/costa21.gif",
                "15 de septiembre de 1821",
                new Currency(
                        "Colón Costarricense",
                        "https://upload.wikimedia.org/wikipedia/commons/e/e2/Costa_Rica_banknotes_10_Colones_banknote_of_1967..JPG",
                        "https://museosdelbancocentral.org/wp-content/uploads/2017/08/billete_1000-700x375.jpg",
                        "http://worldbanknotegallery.com/wcg/img_hr/img17/46-228b.jpg"),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Coat_of_arms_of_Costa_Rica.svg/500px-Coat_of_arms_of_Costa_Rica.svg.png",
                new NationalSymbol("Yigüirro o Cenzontle de Agua (Turdus grayi)", "http://4.bp.blogspot.com/_JjjPYIIKotc/TOAZjFk5ICI/AAAAAAAAACI/xhaLeAC3A2M/s1600/Turdus_grayi%252C_Clay-colored_Robin%252CI_LHT2386.jpg"),
                new NationalSymbol("Guanacaste", "https://paisajismodigital.com/blog/wp-content/uploads/2017/11/Enterolobium-cyclocarpum.jpg"))
        );
        countries.add(new Country(
                "Panama",
                "https://d-maps.com/m/america/panama/panama21.gif",
                "28 de noviembre de 1821",
                new Currency(
                        "Balboa y Dolar Estadounidense",
                        "https://www.ecured.cu/images/6/60/Billete-1-balboa.jpg",
                        "https://2.bp.blogspot.com/-wMDJNAh0mD0/WcgcWEEunoI/AAAAAAAADQA/b7tmp4je-IwAQKy2V3rMj2RPAUP91-UaQCLcBGAs/s1600/dolar.jpg",
                        "http://2.bp.blogspot.com/_wX9qlt5MXxU/TU2A4u6cdqI/AAAAAAAAB_s/49UP514viMM/s1600/imgpana.jpg"),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Coat_of_arms_of_Panama.svg/500px-Coat_of_arms_of_Panama.svg.png",
                new NationalSymbol("Águila Arpía", "http://2.bp.blogspot.com/_JjjPYIIKotc/TN8UZW4CQVI/AAAAAAAAABk/KgSYC2OIK-g/s1600/aguilaarpia.jpg"),
                new NationalSymbol("Panamá, Camoruco o Anacahuita (Sterculia apetala)", "https://paisajismodigital.com/blog/wp-content/uploads/2017/11/Sterculia-apetala-1024x678.jpg"))
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
