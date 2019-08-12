package com.phong.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.phong.baitaprenluyen8.R;
import com.phong.model.SanPham;

public class SanPhamAdapter extends ArrayAdapter<SanPham> {
    Activity context;
    int resource;
    public SanPhamAdapter(Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View customView = this.context.getLayoutInflater().inflate(this.resource, null);
        TextView txtTen = (TextView) customView.findViewById(R.id.txtTen);
        TextView txtGia = (TextView) customView.findViewById(R.id.txtGia);
        ImageView imgHinh = (ImageView) customView.findViewById(R.id.imgHinh);
        ImageView imgMua = (ImageView) customView.findViewById(R.id.imgMua);
        final EditText edtSoLuong = (EditText) customView.findViewById(R.id.edtSoLuong);

        final SanPham sanPham = getItem(position);
        txtTen.setText(sanPham.getTen());
        txtGia.setText(sanPham.getGia() + " VND");
        if (sanPham.getSoLuong() > 0)
        {
            edtSoLuong.setText(sanPham.getSoLuong() + "");
        }
        imgMua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sl = Integer.parseInt(edtSoLuong.getText().toString());
                sanPham.setSoLuong(sl);
            }
        });
        imgHinh.setImageResource(sanPham.getHinh());
        return customView;
    }
}
