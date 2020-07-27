package com.fikri.apple.listpahlawan;

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

public class CardViewHeroAdapter extends RecyclerView.Adapter<CardViewHeroAdapter.CardViewViewHolder> {

    private ArrayList<HeroModel> heroModels;
    private Context context;

    public  CardViewHeroAdapter(ArrayList<HeroModel> list, Context context){
        this.heroModels = list;
        this.context = context;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_hero, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {


        final HeroModel heroModel = heroModels.get(position);

        Picasso.get().load(heroModel.getPhoto()).into(holder.imgPhoto);
        holder.tvName.setText(heroModel.getName());
        holder.tvForm.setText(heroModel.getFrom());
        
        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " + heroModels.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,"Share " + heroModels.get(holder.getAdapterPosition()).getName());
                sendIntent.setType("text/plain");
                context.startActivity(sendIntent);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailCardActivity.class);
                intent.putExtra("putName",heroModels.get(holder.getAdapterPosition()).getName());
                intent.putExtra("putForm",heroModels.get(holder.getAdapterPosition()).getFrom());
                intent.putExtra("putImage",heroModels.get(holder.getAdapterPosition()).getPhoto());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return heroModels.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvForm;
        Button btnShare, btnFavorite;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_card_photo);
            tvName = itemView.findViewById(R.id.tv_item_card_name);
            tvForm = itemView.findViewById(R.id.tv_item_card_form);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
