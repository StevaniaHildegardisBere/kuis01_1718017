package com.example.reclyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaAdapter adapter;
    private ArrayList<keluarga>keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recylerview);
        adapter = new keluargaAdapter(keluargaArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
     private void addData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Andereas Bere","bapak", R.drawable.bapak));
        keluargaArrayList.add(new keluarga("Yosephina Mutik", "Mama",R.drawable.mama));
        keluargaArrayList.add(new keluarga("Wilfridus Aprilius Bere","Anak ke-1", R.drawable.kakak));
        keluargaArrayList.add(new keluarga("Stevania Hildegardis Bere","Anak ke-2", R.drawable.vani));
        keluargaArrayList.add(new keluarga("Jansensius Diksi Bere","Anak ke-3", R.drawable.adik));
    }
}
