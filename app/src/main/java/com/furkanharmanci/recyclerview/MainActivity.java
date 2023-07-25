package com.furkanharmanci.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.furkanharmanci.recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    // StreetFighter sınıflı bir liste tipinden bir değişken bildirdik.
    ArrayList<StreetFighter> sfArrayList;

    // Her satıra ayrı ayrı yazacağımız metni tek değişkene atfedip onu da constructor'da kullandık.
    String info = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setContentView(view);

        // Liste değişkenini yeni bir liste şeklinde tanımladık.
        sfArrayList = new ArrayList<>();

        // Objeleri tanımladık
        StreetFighter akuma = new StreetFighter("Akuma",R.drawable.akuma,info);
        StreetFighter vega = new StreetFighter("Vega",R.drawable.vega,info);
        StreetFighter bison = new StreetFighter("Bison",R.drawable.bison,info);
        StreetFighter balrog = new StreetFighter("Balrog",R.drawable.balrog,info);

        // Objeleri obje listesine ekleme
        sfArrayList.add(akuma);
        sfArrayList.add(bison);
        sfArrayList.add(vega);
        sfArrayList.add(balrog);


        // RecyclerView

        //layout
        binding.recyclerViewMain.setLayoutManager(new LinearLayoutManager(this));

        // Adapter oluşturduk
        StreetFighterAdapter sfAdapter = new StreetFighterAdapter(sfArrayList);


        // Adapter bağladık
        binding.recyclerViewMain.setAdapter(sfAdapter);
    }
}