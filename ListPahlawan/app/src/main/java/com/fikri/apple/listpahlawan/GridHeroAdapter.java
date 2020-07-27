package com.fikri.apple.listpahlawan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class GridHeroAdapter extends RecyclerView.Adapter<GridHeroAdapter.GridViewHolder> {

    private ArrayList<HeroModel> heroModels;
    private Context context;

    public  GridHeroAdapter(ArrayList<HeroModel> list, Context context){
        this.heroModels = list;
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_hero, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, final int position) {

        HeroModel heroModel = heroModels.get(position);

        Picasso.get().load(heroModel.getPhoto()).into(holder.imgPhoto);

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

    public class GridViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_grid_photo);
        }
    }
}
