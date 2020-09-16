package com.example.utecindependencia.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.utecindependencia.R;
import com.example.utecindependencia.models.Country;

import java.util.List;

public class CountriesAdapter extends  RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>{
    private List<Country> destinations;
    private CountriesListener listener;
    public CountriesAdapter(List<Country> destinations, CountriesListener listener) {
        this.destinations = destinations;
        this.listener = listener;
    }
    @NonNull
    @Override
    public CountriesAdapter.CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_countries, null, false);
        return new CountriesAdapter.CountriesViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final CountriesAdapter.CountriesViewHolder holder, int position) {
        holder.bindData(destinations.get(position), listener);
    }
    @Override
    public int getItemCount() {
        return destinations.size();
    }
    public class CountriesViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre;
        private CardView cardViewCountry;
        public CountriesViewHolder(@NonNull View view) {
            super(view);
            nombre=view.findViewById(R.id.text_country_name);
            cardViewCountry = view.findViewById(R.id.card_view_country);
        }
        public void bindData(final Country dest, final CountriesListener listener) {
            nombre.setText(dest.getName());
            cardViewCountry.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.selectCountry(dest);
                }
            });
        }
    }
}
