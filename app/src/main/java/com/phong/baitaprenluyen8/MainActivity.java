package com.phong.baitaprenluyen8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.phong.adapter.SanPhamAdapter;
import com.phong.model.SanPham;

public class MainActivity extends AppCompatActivity {

    GridView gvSanPham;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        fakeData();
    }

    private void fakeData() {
        sanPhamAdapter.add(new SanPham("Hoa 1",25000,R.drawable.h1,0));
        sanPhamAdapter.add(new SanPham("Hoa 2",35000,R.drawable.h2,0));
        sanPhamAdapter.add(new SanPham("Hoa 3",45000,R.drawable.h3,0));
        sanPhamAdapter.add(new SanPham("Hoa 4",55000,R.drawable.h4,0));
        sanPhamAdapter.add(new SanPham("Hoa 5",65000,R.drawable.h5,0));
        sanPhamAdapter.add(new SanPham("Hoa 6",75000,R.drawable.h6,0));
        sanPhamAdapter.add(new SanPham("Hoa 7",85000,R.drawable.h7,0));
        sanPhamAdapter.add(new SanPham("Hoa 8",95000,R.drawable.h8,0));
        sanPhamAdapter.add(new SanPham("Hoa 9",15000,R.drawable.h9,0));
        sanPhamAdapter.add(new SanPham("Hoa 10",5000,R.drawable.h10,0));
        sanPhamAdapter.add(new SanPham("Hoa 11",20000,R.drawable.h11,0));
        sanPhamAdapter.add(new SanPham("Hoa 12",30000,R.drawable.h12,0));
    }

    private void addControl() {
        gvSanPham = (GridView) findViewById(R.id.gvSanPham);
        sanPhamAdapter = new SanPhamAdapter(MainActivity.this, R.layout.item);
        //Gán Adapter cho GridView:
        gvSanPham.setAdapter(sanPhamAdapter);
    }
}
