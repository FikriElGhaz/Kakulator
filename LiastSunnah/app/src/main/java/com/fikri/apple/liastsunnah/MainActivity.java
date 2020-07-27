package com.fikri.apple.liastsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    String[] title = {"Memelihara Wudhu",
            "Bersiwak",
            "Bersegera Menuju Sholat",
            "Sebelum Tidur Berwudhu",
            "Berbuka Mengan Makanan Ringan",
            "Sujud Syukur Saat Mendapat Nikmat ",
            "Membuat Pembatas Ketika Shalat",
            "Shalat Subuh Berjamaah",
            "Berdzikir Kepada Allah" ,
            "Mengeraskan Suara Saat Zikir "};


    String[] desc = {"Seperti dalam sebuah hadits yang diriwayatkan dari Tsauban Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Istiqamahlah (konsistenlah) kalian semua (dalam menjalankan perintah Allah) dan kalian tidak akan pernah dapat menghitung pahala yang akan Allah berikan. Ketahuilah bahwa sebaik-baik perbuatan adalah shalat, dan tidak ada yang selalu memelihara wudhunya kecuali seorang mukmin.” (HR. Ahmad dan Ibnu Majah)",
            "Bersiwak itu seperti gosok gigi, bedanya kalau bersiwak itu menggunakan kayu yang disebut siwak. Ada hadits yang menyebutkan masalah bersiwak ini, seperti yang diriwayatkan dari Aisyah Radhiyallahu Anha bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Siwak dapat membersihkan mulut dan sarana untuk mendapatkan ridha Allah.” (HR. Ahmad dan An-Nasa`i)",
            "Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Andaikata umat manusia mengetahui pahala di balik adzan dan berdiri pada shaf pertama kemudian mereka tidak mendapatkan bagian kecuali harus mengadakan undian terlebih dahulu niscaya mereka membuat undian itu. Andaikata mereka mengetahui pahala bergegas menuju masjid untuk melakukan shalat, niscaya mereka akan berlomba-lomba melakukannya. Andaikata mereka mengetahui pahala shalat isya dan subuh secara berjamaah, niscaya mereka datang meskipun dengan merangkak.” (HR. Al-Bukhari dan Muslim)",
            "Ada sebuah hadits yang diriwayatkan dari Al-Barra’ bin Azib Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Jika kamu hendak tidur, maka berwudhulah seperti hendak shalat, kemudian tidurlah dengan posisi miring ke kanan dan bacalah, ‘Ya Allah, Aku pasrahkan jiwa ragaku kepada-Mu, aku serahkan semua urusanku kepada-Mu, aku lindungkan punggungku kepada-Mu, karena cinta sekaligus takut kepada-Mu, tiada tempat berlindung mencari keselamatan dari (murka)-Mu kecuali kepada-Mu, aku beriman dengan kitab yang Engkau turunkan dan dengan nabi yang Engkau utus’. Jika engkau meninggal, maka engkau meninggal dalam keadaan fitrah. Dan usahakanlah doa ini sebagai akhir perkataanmu.” (HR. Al-Bukhari dan Muslim)",
            "Diriwayatkan dari Anas bin Malik Radhiyallahu Anhu, ia berkata, “Rasulullah Shallallahu Alaihi wa Sallam berbuka puasa sebelum shalat maghrib dengan beberapa kurma basah. Jika tidak ada maka dengan beberapa kurma kering. Jika tidak ada, maka beliau hanya meminum beberapa teguk air.” (HR. Ahmad, Abu Dawud dan At-Tirmidzi)",
            "Dalam sebuah hadits yang diriwayatkan dari Abu Bakrah Radhiyallahu Anhu ia berkata, “Jika Rasulullah Shallallahu Alaihi wa Sallam mendapatkan sesuatu yang menyenangkan atau disampaikan kabar gembira maka beliau langsung sujud dalam rangka bersyukur kepada Allah.” (HR. Abu Dawud, At-Tirmidzi dan Ibnu Majah).",
            "Diriwayatkan dari Abu Said al-Kudri Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Ketika kalian hendak shalat, maka buatlah pembatas di depannya dan majulah sedikit, dan janganlah membiarkan seseorang lewat di depannya. Jika ada orang yang sengaja lewat di depannya, maka hendaknya dia menghalanginya karena orang itu adalah setan.” (HR. Abu dawud dan Ibnu Majah)",
            "Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Sungguh, shalat yang paling berat bagi orang munafik, adalah shalat isya dan shalat shubuh. sekiranya mereka mengetahui apa yang terkandung di dalamnya, mereka pasti mendatangani keduanya, sekalipun dengan merangkak.” (HR. Bukhari-Muslim).",
            "Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Perumpamaan orang yang berdzikir kepada Tuhannya dan orang yang tidak berdzikir, seperti orang yg hidup dan orang yg mati.” (HR. Bukhari",
            "Di dalam kitab Shahih Al-Bukhari disebutkan, “Ibnu Abbas Radhiyallahu Anhuma mengatakan, mengeraskan suara dalam berzikir setelah orang-orang selesai melaksanakan shalat wajib telah ada sejak zaman Rasulullah Shallallahu Alaihi wa Sallam. Ibnu Abbas juga mengatakan, “Aku mengetahui orang-orang telah selesai melaksanakan shalat karena mendengar zikir mereka.” (HR. Al-Bukhari)"
    };


    String[] urlImage = {"https://i1.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/wudhu-chanelmuslim.com-.jpg?w=900&ssl=1",
            "https://i0.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Bersiwak-islamkingdom.com-.jpg?w=900&ssl=1",
            "https://i1.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Menuju-ke-masjid-penerbitlayar.com-.jpg?w=900&ssl=1",
            "https://i1.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Tidur-miring-ke-kanan-selo-aji.blogspot.co_.id-.jpg?w=900&ssl=1",
            "https://i0.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Kurma-khasiat.co_.id-.jpg?w=900&ssl=1",
            "https://i2.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Sujud-fimadani.com-.jpg?w=900&ssl=1",
            "https://i0.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Sutrah-youtube.com-.jpg?w=1280&ssl=1",
            "https://i1.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/sholat-subuh-jamaah-rezekipengusaha.blogspot.co_.id-.jpg?w=900&ssl=1",
            "https://i1.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Berdzikir-menatahidup.com-.jpg?w=900&ssl=1" ,
            "https://i2.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Jamaah-Istiqlal-wikimedia.org-.jpg?w=900&ssl=1"};

    ListView listSunnah;
    CarouselView carouselView;
    private int pageCount = 0;
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
