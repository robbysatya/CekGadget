package com.robby.dicoding.cekgadget;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView list_Gadget;
    private final ArrayList<Gadget> list = new ArrayList<>();

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

        gadgetAdapter.setItemClickCallBack(gadget -> {
            Intent moveIntent = new Intent(MainActivity.this, DetailHp.class);
            moveIntent.putExtra(DetailHp.ITEM_EXTRA, gadget);
            startActivity(moveIntent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menu_id = item.getItemId();

        if(menu_id == R.id.mAbout){
            Intent moveIntent = new Intent(MainActivity.this, AboutMe.class);
            startActivity(moveIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}