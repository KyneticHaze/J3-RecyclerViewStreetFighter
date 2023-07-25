package com.furkanharmanci.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.furkanharmanci.recyclerview.databinding.RecyclerRowItemBinding;

import java.util.ArrayList;

public class StreetFighterAdapter extends RecyclerView.Adapter<StreetFighterAdapter.StreetFighterViewHolder> {

    ArrayList<StreetFighter> sfArrayList;

    public StreetFighterAdapter(ArrayList<StreetFighter> sfArrayList) {
        this.sfArrayList = sfArrayList;
    }

    @NonNull
    @Override
    public StreetFighterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Bağlanılan xml'i oluşturma(onCreate)

        RecyclerRowItemBinding binding = RecyclerRowItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        // inflate(LayoutInflater,ViewGroup,boolean) değerleri istiyor.

        return new StreetFighterViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StreetFighterViewHolder holder, int position) {
        // Tutulan görüntüyü gösterme
        holder.binding.item.setText(sfArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Tutulan görüntüyü başka bir activiteye aktarmak için intent kullanma

                Intent intent = new Intent(holder.itemView.getContext(),SecondActivity.class);

                intent.putExtra("Sf", sfArrayList.get(position));

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return sfArrayList.size();
    }

    public class StreetFighterViewHolder extends RecyclerView.ViewHolder {
            // Görüntü tutucu sınıf oluşturduk

        private RecyclerRowItemBinding binding;
        // recycler_row.xml'i bağladık.

        public StreetFighterViewHolder(RecyclerRowItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
