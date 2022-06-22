package com.nareshittechnologies.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private ListView custom_list_view;
    private int[] images;
    private String[] names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        custom_list_view = findViewById(R.id.custom_list_view);

        images = new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,
        R.drawable.e, R.drawable.f,R.drawable.g,R.drawable.h};
        names = new String[]{"Apple","Bat","Cat","Dog","Eagle","Flight","Golf","Horse"};

        custom_list_view.setAdapter(new CustomAdapter());
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 8;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View v, ViewGroup viewGroup) {
            if(v ==null){
                v =  getLayoutInflater().inflate(R.layout.custom_list_view_layout,viewGroup,false);
            }

            ImageView iv = v.findViewById(R.id.imageView);
            TextView tv = v.findViewById(R.id.textView);

            iv.setImageResource(images[i]);
            tv.setText(names[i]);

            return v;
        }
    }
}