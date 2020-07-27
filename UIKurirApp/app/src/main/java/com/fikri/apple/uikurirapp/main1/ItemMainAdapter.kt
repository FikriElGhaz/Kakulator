package com.fikri.apple.uikurirapp.main1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fikri.apple.uikurirapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list_main.view.*

class ItemMainAdapter(private val listMain: ArrayList<MainModel>): RecyclerView.Adapter<ItemMainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_list_main, parent, false)
        return MainViewHolder(view)

    }

    override fun getItemCount(): Int = listMain.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(listMain[position])

    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(model: MainModel){
            with(itemView){
                tvName.text = model.name
                tvNumber.text = model.num
                tvAddress.text = model.address
                tvReceipt.text = model.receipt

                Picasso.get().load(model.image).into(ivPackage)
            }
        }

    }
}
