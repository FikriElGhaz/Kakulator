package com.fikri.apple.mahzabfikih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    ListView listMazhab;
    CarouselView carouselView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listSunnah = findViewById(R.id.listViewSunnah);
        CostomListviewAdapter costomListviewAdapter = new CostomListviewAdapter();
        listSunnah.setAdapter(costomListviewAdapter);

        carouselView = findViewById(R.id.carouserView);
        carouselView.setPageCount(urlImage.length);
        carouselView.setImageListener(imageListener);
        Toolbar toolbarSunnah = findViewById(R.id.tbSunnah);
        setSupportActionBar(toolbarSunnah);





        listSunnah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailSunnahActivity.class);
                intent.putExtra("putTitle",title[position]);
                intent.putExtra("putDesc",desc[position]);
                intent.putExtra("putImage",urlImage[position]);

                startActivity(intent);
            }
        });

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            Picasso.get().load(urlImage[position]).into(imageView);
        }
    };

    private class CostomListviewAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return title.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.costum_listview, null);

            ImageView imageSunnah = convertView.findViewById(R.id.imgSunnah);
            TextView textTitle = convertView.findViewById(R.id.txtTitle);
            TextView textDesc = convertView.findViewById(R.id.txtDecs);

            Picasso.get().load(urlImage[position]).into(imageSunnah);
            textTitle.setText(title[position]);
            textDesc.setText(desc[position]);

            return convertView;

        }
    }
}
