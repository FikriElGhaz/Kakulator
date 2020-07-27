package com.fikri.apple.listpahlawan;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> {


    private ArrayList<HeroModel> listHero;
    private Context context;

    public ListHeroAdapter(ArrayList<HeroModel> list, Context context){
        this.listHero = list;
        this.context = context;
    }




    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hero, parent, false);
        return new ListViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {

        HeroModel heroModel = listHero.get(position);

        Picasso.get().load(heroModel.getPhoto()).into(holder.imgPhoto);
        holder.tvName.setText(heroModel.getName());
        holder.tvFrom.setText(heroModel.getFrom());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailCardActivity.class);
                intent.putExtra("putName",listHero.get(holder.getAdapterPosition()).getName());
                intent.putExtra("putForm",listHero.get(holder.getAdapterPosition()).getFrom());
                intent.putExtra("putImage",listHero.get(holder.getAdapterPosition()).getPhoto());
                context.startActivity(intent);





            }
        });


    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvFrom;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tvItemName);
            tvFrom = itemView.findViewById(R.id.tvItemForm);


        }
    }
}
