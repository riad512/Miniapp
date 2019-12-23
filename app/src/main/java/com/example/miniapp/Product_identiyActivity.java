package com.example.miniapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class Product_identiyActivity extends AppCompatActivity implements View.OnClickListener,MyAdapter.MyAdapterItemClickListener {
    private SqliteHelper dphelper;

    private RecyclerView recyclerView;
    List<Product> strings;
    MyAdapter myAdapter;
    private Button btn;
    private EditText product_name;
    private EditText product_category;
    private EditText product_description;
    private EditText product_price;
    private int toUpdate=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_identiy);
        recyclerView = findViewById(R.id.recycler);
        product_name = findViewById(R.id.product_name);
        product_category = findViewById(R.id.product_cateqory);
        product_description= findViewById(R.id.product_description);
        product_price = findViewById(R.id.product_price);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
        strings = new ArrayList<>();
        myAdapter = new MyAdapter(strings);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Product_identiyActivity.this));
        dphelper = new SqliteHelper(this);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setListener(this);
        showList();

    }


    private void showList() {
        strings.clear();
        strings.addAll(dphelper.getAllStudent());
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        String pro_name = product_name.getText().toString().trim();
        String pro_category = product_category.getText().toString().trim();
        String pro_description = product_description.getText().toString().trim();
        String pro_price = product_price.getText().toString().trim();
        //  strings.add(var);
        //  myAdapter.notifyDataSetChanged();
        dphelper.save(1,pro_name,pro_category,pro_description,500);
        Toast.makeText(Product_identiyActivity.this,"Data Saved",Toast.LENGTH_SHORT).show();
        product_name.setText("");
        product_category.setText("");
        product_description.setText("");
        product_price.setText("");

    }


    public void onItemClick(Product item, int position) {
        product_name.setText(item.getProduct_name());
        product_category.setText(""+item.getProduct_cateqory());
        product_description.setText(""+item.getProduct_descriptionl());
        product_price.setText(""+item.getProduct_price());
        toUpdate=item.getProduct_id();
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemLongClick(Product item, int position) {
        dphelper.delete(item.getProduct_id());
        showList();
    }
}