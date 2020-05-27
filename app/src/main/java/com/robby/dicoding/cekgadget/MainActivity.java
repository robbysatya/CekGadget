package com.robby.dicoding.cekgadget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView list_Gadget;
    private ArrayList<Gadget> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_Gadget = findViewById(R.id.list_gadget);
        list_Gadget.setHasFixedSize(true);

        list.addAll(GadgetData.getListData());
        showList();
    }

    //Menu Menampilkan List Menu
    private void showList(){
        list_Gadget.setLayoutManager(new LinearLayoutManager(this));
        GadgetAdapter gadgetAdapter = new GadgetAdapter(list);
        list_Gadget.setAdapter(gadgetAdapter);

        gadgetAdapter.setItemClickCallBack(new GadgetAdapter.ItemClickCallBack() {
            @Override
            public void itemClicked(Gadget data) {

            }
        });
    }
}
