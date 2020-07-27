package com.fikri.apple.footballapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemCountryAdapter extends RecyclerView.Adapter<ItemCountryAdapter.CountryViewHolder> {
    private ArrayList<CountryModel> listCountry;
    private Context context;

    public ItemCountryAdapter(ArrayList<CountryModel> list, Context context){
        this.listCountry = list;
        this.context = context;
    }



    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team_row, parent,false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CountryViewHolder holder, int position) {

        final CountryModel countryModel = listCountry.get(position);

        Picasso.get().load(countryModel.getImageFlagCountry()).into(holder.imgFlagCountry);
        Picasso.get().load(countryModel.getImageCountry()).into(holder.imgCountry);
        holder.nameCountry.setText(countryModel.getNameaCountry());
        holder.descCountry.setText(countryModel.getDescCountry());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailCardActivity.class);
                intent.putExtra("putName",listCountry.get(holder.getAdapterPosition()).getNameaCountry());
                intent.putExtra("putForm",listCountry.get(holder.getAdapterPosition()).getDescCountry());
                intent.putExtra("putImageCountry",listCountry.get(holder.getAdapterPosition()).getImageCountry());
                intent.putExtra("putImageFlag",listCountry.get(holder.getAdapterPosition()).getImageFlagCountry());
                intent.putExtra("putImageIcon",listCountry.get(holder.getAdapterPosition()).getImageIconCountry());
                context.startActivity(intent);

            }
        });

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " + listCountry.get(holder.getAdapterPosition()).getNameaCountry(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,"Share " + listCountry.get(holder.getAdapterPosition()).getNameaCountry());
                sendIntent.setType("text/plain");
                context.startActivity(sendIntent);
            }
        });




    }

    @Override
    public int getItemCount() {
        return listCountry.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {




        TextView nameCountry, descCountry;
        CircleImageView imgFlagCountry;
        ImageView imgCountry;
        Button btnShare, btnFavorite;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            nameCountry = itemView.findViewById(R.id.tvNameCountry);
            descCountry = itemView.findViewById(R.id.tvDecsCountry);
            imgFlagCountry = itemView.findViewById(R.id.ivFlagCountry);
            imgCountry = itemView.findViewById(R.id.ivCountry);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
