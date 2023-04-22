package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcv);
        productAdapter= new ProductAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        productAdapter.setData(getListProduct());
        recyclerView.setAdapter(productAdapter);
    }


//    call from api
    private List<Product> getListProduct() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));

        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));












        return list;
    }
}