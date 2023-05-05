package com.robby.dicoding.cekgadget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailHp extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_hp);

        ImageView imgGadget = findViewById(R.id.imgGadget);
        TextView text_judul = findViewById(R.id.text_judul);
        TextView text_detail = findViewById(R.id.text_detail);

        Gadget gadget = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(gadget != null){
            Glide.with(this)
                    .load(gadget.getImg())
                    .into(imgGadget);
            text_judul.setText(gadget.getName());
            text_detail.setText(gadget.getDetail());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Gadget");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
