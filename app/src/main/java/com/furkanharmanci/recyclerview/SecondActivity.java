package com.furkanharmanci.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.furkanharmanci.recyclerview.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Intent

        // getIntent() ile activiteyi çağırma
        Intent intent = getIntent();

        // Serializable implement edilen sınıfın bilgilerini getSerializable şeklinde almak gerekiyor.
        // Serializable provided but (StreetFighter)
        StreetFighter chosenSf = (StreetFighter) intent.getSerializableExtra("Sf");

        // Gelen verileri görünüme ekleme
        binding.nameText.setText(chosenSf.name);
        binding.imageView2.setImageResource(chosenSf.image);
        binding.info.setText(chosenSf.info);
    }
}