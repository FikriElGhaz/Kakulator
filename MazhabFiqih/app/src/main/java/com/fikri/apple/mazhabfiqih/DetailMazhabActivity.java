package com.fikri.apple.mazhabfiqih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.fikri.apple.mazhabfiqih.ui.home.HomeFragment;
import com.squareup.picasso.Picasso;

public class DetailMazhabActivity extends AppCompatActivity {

    String kajian,fotoKajian,nameUstad, idUstad;


    String[] namaKajianUstEvie = {"Hati yang Terluka","Sehidup Sesurga","Cinta Ditolak Allah Bertindak",
    "Nikmatnya Hijrah Dalam Ketaatan","Rek Kitu Wae?"};

    String[] kajianUstEvie = {"https://www.youtube.com/watch?v=yOf_myKiRls","https://www.youtube.com/watch?v=TfFUPz-wOiI",
    "https://www.youtube.com/watch?v=rswjjYAvJJM&t=42s","https://www.youtube.com/watch?v=hZAJ8yYo0xg","https://www.youtube.com/watch?v=WrMEyfMGkVY"};

    String[] fotoKajianUstEvie = {"https://i.ytimg.com/vi/yOf_myKiRls/hqdefault.jpg","https://i.ytimg.com/vi/TfFUPz-wOiI/hqdefault.jpg",
    "https://i.ytimg.com/vi/rswjjYAvJJM/hqdefault.jpg","https://i.ytimg.com/vi/hZAJ8yYo0xg/hqdefault.jpg","https://i.ytimg.com/vi/WrMEyfMGkVY/hqdefault.jpg"};


    String[] namaKajianUstHanan = {"Diam", "Doain Orang yang Ngeselin", "Hukum Berpacaran", "Pertolongan Allah SWT Selalu Tepat Waktu", "menjemput JODOH lewat DOA dan YAKIN kepada ALLAH"};

    String[] kajianUstHanan = {"https://www.youtube.com/watch?v=GI_kqU40H8g", "https://www.youtube.com/watch?v=3a630Qn4VJ0", "https://www.youtube.com/watch?v=lwUJYbgzKVk", "https://www.youtube.com/watch?v=5EmaGXcUZsA", "https://www.youtube.com/watch?v=ITaB1SbIm_Y"};

    String[] fotoKajianUstHanan = {"https://i.ytimg.com/vi/GI_kqU40H8g/hqdefault.jpg", "https://i.ytimg.com/vi/3a630Qn4VJ0/hqdefault.jpg", "https://i.ytimg.com/vi/lwUJYbgzKVk/hqdefault.jpg", "https://i.ytimg.com/vi/5EmaGXcUZsA/hqdefault.jpg", "https://i.ytimg.com/vi/ITaB1SbIm_Y/hqdefault.jpg"};

    String[] namakajianUstAbdulSomad = {"TANDA-TANDA AKHIR ZAMAN, KIAMAT.! - Ust. Abdul Somad. Lc., MA",
            "CERAMAH FULL.! UNTUK APA KITA HIDUP DI DUNIA - Ust. Abdul Somad. Lc. MA",
            "Ceramah Ustadz Abdul Somad Terbaru 2019 UAS - Kisah Saat Maut Mejemput (Batam)\n",
            "AMALAN AGAR REZEKI ANDA LANCAR - Ustadz. Abdul Somad. Lc., MA\n",
            "BERBAKTILAH KEPADA IBUMU SEBELUM KAMU MENYESAL - Ust. Abdul Somad. Lc., MA\n"};

    String[] kajianUstAbdulSomad = {"https://www.youtube.com/watch?v=7ZalUVLW6mE", "https://www.youtube.com/watch?v=xCsJn8Jyc7A", "https://www.youtube.com/watch?v=gsyMUZykz18",
            "https://www.youtube.com/watch?v=1uxjygGGssw", "https://www.youtube.com/watch?v=ehpME2cLkTA"};

    String[] fotokajianUstAbdulSomad = {"https://i.ytimg.com/vi/7ZalUVLW6mE/hqdefault.jpg","https://i.ytimg.com/vi/xCsJn8Jyc7A/hqdefault.jpg",
            "https://i.ytimg.com/vi/gsyMUZykz18/hqdefault.jpg", "https://i.ytimg.com/vi/1uxjygGGssw/hqdefault.jpg","https://i.ytimg.com/vi/ehpME2cLkTA/hqdefault.jpg"};

    String[] namaKajianUstKhalid = {"Pentingnya Sholat Perlu Anda Ketahui","EFEK MENIKAH MUDA","Apakah Jodoh merupakan Takdir Allah ?",
            "Bolehkah Tahlilan Kematian dan Yasinan ??","Inilah Janji Allah Untuk Orang Yang Mau Berubah"};

    String[] kajianUstKhalid = {"https://www.youtube.com/watch?v=RWP44GSF9xc","https://www.youtube.com/watch?v=VJqdtjWNo78",
            "https://www.youtube.com/watch?v=gadO3mZuG84","https://www.youtube.com/watch?v=_CgLq2-_APg","https://www.youtube.com/watch?v=moKHzV9ca4o"};

    String[] fotoKajianUstKhalid = {"https://i.ytimg.com/vi/RWP44GSF9xc/hqdefault.jpg","https://i.ytimg.com/vi/VJqdtjWNo78/hqdefault.jpg",
            "https://i.ytimg.com/vi/gadO3mZuG84/hqdefault.jpg","https://i.ytimg.com/vi/_CgLq2-_APg/hqdefault.jpg","https://i.ytimg.com/vi/moKHzV9ca4o/hqdefault.jpg"};

    String[] namakajianUstAdihidayat = {"5 Amalan Biar Hati Tenang | Ustad Adi Hidayat, Lc., MA","Ustadz Adi Hidayat Lc, MA - Mendidik Anak Secara Islami\n","Sumber Rezeki dari Allah (Bagian 4: Makna Ikhtiar) - Ustadz Adi Hidayat\n"
            ,"Ustadz Adi Hidayat Lc, MA - Mendidik Anak Secara Islami\n","Tanya Jawab Fiqh - Ustadz Adi Hidayat\n"};

    String[] kajianUstAdihidayat = {"https://www.youtube.com/embed/sQbqWW7GsA8","https://www.youtube.com/embed/BkUJue-XMDw","https://www.youtube.com/embed/rHobVQkCKBY"
            ,"https://www.youtube.com/watch?v=BkUJue-XMDw","https://www.youtube.com/watch?v=Dbv7mjuvCyQ"};

    String[] fotokajianUstAdihidayat = {"https://i.ytimg.com/vi/sQbqWW7GsA8/hqdefault.jpg","https://i.ytimg.com/vi/BkUJue-XMDw/hqdefault.jpg","https://i.ytimg.com/vi/rHobVQkCKBY/hqdefault.jpg"
            ,"https://i.ytimg.com/vi/BkUJue-XMDw/hqdefault.jpg","https://i.ytimg.com/vi/Dbv7mjuvCyQ/hqdefault.jpg"};

    

    ListView listKajian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mazhab);

        Intent intent = getIntent();
        nameUstad = intent.getStringExtra("putTitle");
        idUstad = intent.getStringExtra("putId");
        listKajian = findViewById(R.id.listViewKajian);

        CostomListviewAdapter costomListviewAdapter = new CostomListviewAdapter();
        listKajian.setAdapter(costomListviewAdapter);

        listKajian.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DetailMazhabActivity.this, DetailKajianActivity.class);

                if (idUstad.equals("1")){
                    intent.putExtra("putLink", kajianUstEvie[0]);
                    startActivity(intent);
                    }
                else if (idUstad.equals("2")){
                    intent.putExtra("putLink", kajianUstHanan[1]);
                    startActivity(intent);
                }else if (idUstad.equals("3")){
                    intent.putExtra("putLink", kajianUstAbdulSomad[2]);
                    startActivity(intent);
                }else if (idUstad.equals("4")){
                    intent.putExtra("putLink", kajianUstKhalid[3]);
                    startActivity(intent);
                }else if (idUstad.equals("3")){
                    intent.putExtra("putLink", kajianUstAdihidayat[4]);
                    startActivity(intent);
                }


                }




        });




    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();


        }


        return super.onOptionsItemSelected(item);


    }


    private class CostomListviewAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return namaKajianUstEvie.length;
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
            convertView = getLayoutInflater().inflate(R.layout.item_row, null);
            ImageView imageKajian = convertView.findViewById(R.id.ivKajian);

            if(idUstad.equals("1")){
                Picasso.get().load(fotoKajianUstEvie[position]).into(imageKajian);
            }
            else if (idUstad.equals("2")){
                Picasso.get().load(fotoKajianUstHanan[position]).into(imageKajian);
            }
            else if (idUstad.equals("3")){
                Picasso.get().load(fotokajianUstAbdulSomad[position]).into(imageKajian);
            } else if (idUstad.equals("4")){
                Picasso.get().load(fotoKajianUstKhalid[position]).into(imageKajian);
            } else if (idUstad.equals("5")){
                Picasso.get().load(fotokajianUstAdihidayat[position]).into(imageKajian);
            }



            return convertView;

        }
    }
}
