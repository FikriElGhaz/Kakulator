package com.fikri.apple.mazhabfiqih.ui.home;


import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.fikri.apple.mazhabfiqih.DetailMazhabActivity;
import com.fikri.apple.mazhabfiqih.R;
import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    String[] idUstadz ={"1","2","3","4","5"};

    String[] nameUstadz = {"Ustad Evie Effendi",
            "Ustad Hanan Attaki",
            "Ustad Abdul Somad",
            "Ustadz Khalid Basalamah",
            "Ustadz Adi Hidayat"

    };

    String[] decsUstadz = {
            "Nama : Evie Effendi\n" +
                    "Lahir: 19 Januari 1976, Bandung, Indonesia\n" +
                    "Agama: islam\n" +
                    "Istri / menikah dengan: Ani Mulyani \n" +
                    "Anak: 3 orang\n" +
                    "Hobi : Off Road\n" +
                    "Alamat rumah: Sindang Laya, Bandung Jawa Barat 40195\n" +
                    "Nomor Telepon : 02270534118\n" +
                    "Akun media sosial: instagram @evieeffendie",

            "Lahir: Tengku Hanan Attaki, 31 Desember 1981, Aceh\n" +
                    "Pendidikan: Universitas al-Azhar-Mesir, Fakultas Ushuluddin, Jurusan Tafsir al-Qur’an\n" +
                    "Akun media sosial: instagram @hanan_attaki\n" +
                    "website: http://pemudahijrah.com/  ",

            "Nama Lengkap : Abdul Somad Batubara, Lc., D.E.S.A.\n" +
                    "Lahir : Silo Lama, Asahan, Sumatera Utara, 18 Mei 1977\n" +
                    "Orang Tua : Hj. Rohana\n" +
                    "Pekerjaan : Penceramah, Ahli ilmu Hadist, Ulama, Dosen\n" +
                    "Pendidikan : S1 Al-Azhar, Kairo, Mesir, S2 Daar al-Hadits Al-Hassania Institute, Kerajaan Maroko",

            "Nama lengkap: Khalid Zeed Abdullah Basalamah\n" +
                    "Lahir: 01-Mei-1975, Makassar, Indonesia\n" +
                    "Pendidikan: S1 Universitas Islam Madinah (Arab Saudi), S2 Universitas Muslim Indonesia (Indonesia), S3 Universitas Tun Abdul Razzak (Malaysia)\n" +
                    "Situs web: https://www.khalidbasalamah.com/\n" +
                    "Saluran YouTube: https://www.youtube.com/user/khalidbasalamah/\n" +
                    "Akun media sosial: \n" +
                    "Instagram: @ustadzkhalid",

            "Nama : Adi Hidayat, Lc, MA\n" +
                    "Lahir : Pandeglang, Banten, 11 September 1984\n" +
                    "Orang Tua : Warso Supena (Ayah), Hj.Rafiah Akhyar (Ibu)\n" +
                    "Saudara : Ade Rahmat, Neng Inayatin, Ima Rakhmawati, Ita Haryati\n" +
                    "Istri : (Belum Diketahui)\n" +
                    "Anak : 2 Orang\n" +
                    "Pekerjaan : Penceramah"


    };

    String[] imageUstadz = {
            "https://awsimages.detik.net.id/visual/2018/08/16/9509aa97-bf90-455e-964f-2c85eec7345c_169.jpeg?w=650",
            "https://cdn2.tstatic.net/medan/foto/bank/images/ustaz-hanan-attaki_20180723_123218.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnNGbRm2JDKNdl6CqAsOkM3gsxlUUTLfqZwubazeb2TYpY4TPn",
            "https://2.bp.blogspot.com/-7etnaja8PO4/WUOQAwClScI/AAAAAAAAE-E/QtiYG3AwHswxCWNOyATAWDjmphmOq3buwCLcBGAs/s1600/ustadz%2Bkhalid%2Bbasalamah%2Bbiografi%2Bbeliau.jpg",
            "https://cdn2.tstatic.net/bangka/foto/bank/images/ustaz-adi-hidayat.jpg"

    };



    ListView listMazhab;
    CarouselView carouselImage;


    public HomeFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        listMazhab = view.findViewById(R.id.listViewMazhab);
        carouselImage = view.findViewById(R.id.carouserView);
        CostomListviewAdapter costomListviewAdapter = new CostomListviewAdapter();
        listMazhab.setAdapter(costomListviewAdapter);

        carouselImage.setPageCount(imageUstadz.length);
        carouselImage.setImageListener(imageListener);

        listMazhab.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), DetailMazhabActivity.class);
                intent.putExtra("putTitle", nameUstadz[position]);
                intent.putExtra("putDesc", decsUstadz[position]);
                intent.putExtra("putImage", imageUstadz[position]);
                intent.putExtra("putId",idUstadz[position]);

                startActivity(intent);
            }
        });



    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            Picasso.get().load(imageUstadz[position]).into(imageView);
        }
    };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    private class CostomListviewAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return nameUstadz.length;
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

            ImageView imageSunnah = convertView.findViewById(R.id.ivUstadz);
            TextView textTitle = convertView.findViewById(R.id.tvNamaUstadz);

            Picasso.get().load(imageUstadz[position]).into(imageSunnah);
            textTitle.setText(nameUstadz[position]);



            return convertView;

        }
    }
}
