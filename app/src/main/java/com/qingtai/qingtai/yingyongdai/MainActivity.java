package com.qingtai.qingtai.yingyongdai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import in.srain.cube.views.GridViewWithHeaderAndFooter;

public class MainActivity extends AppCompatActivity {


    private GridViewWithHeaderAndFooter gridView;
    private ArrayAdapter<Integer> adapter;
    private Integer[] drawablesResource = {R.mipmap.a, R.mipmap.b, R.mipmap.c, R.mipmap.d, R.mipmap.f,
            R.mipmap.e, R.mipmap.g, R.mipmap.h, R.mipmap.i, R.mipmap.j, R.mipmap.k};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化Bmob
        Bmob.initialize(this, "c69cff7e338312b3e2d613d29228f22b");

        gridView = (GridViewWithHeaderAndFooter)findViewById(R.id.grid_view);
        setGridViewHeaderAndFooter();

        adapter = new GridViewAdapter(this, R.layout.item_grid, drawablesResource);
        gridView.setAdapter(adapter);

    }

    private void setGridViewHeaderAndFooter() {
        LayoutInflater layoutInflater = LayoutInflater.from(this);

        View headerView = layoutInflater.inflate(R.layout.item_header, null, false);
        View footerView = layoutInflater.inflate(R.layout.item_bottom, null, false);

        //locate views
        TextView headerText = (TextView)headerView.findViewById(R.id.text);
        TextView footerText = (TextView)footerView.findViewById(R.id.text);
//
//        headerText.setText("GridView Header");
//        footerText.setText("GridView Footer");

        headerView.setOnClickListener(onClickListener(0));
        footerView.setOnClickListener(onClickListener(1));

        gridView.addHeaderView(headerView);
        gridView.addFooterView(footerView);
    }
    private View.OnClickListener onClickListener(final int i) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    Toast.makeText(MainActivity.this, "Header Clicked!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Footer Clicked!", Toast.LENGTH_SHORT).show();
                }
            }
        };
    }
}
