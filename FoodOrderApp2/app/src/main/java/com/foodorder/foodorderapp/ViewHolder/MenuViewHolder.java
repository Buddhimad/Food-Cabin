package com.foodorder.foodorderapp.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.foodorder.foodorderapp.Interface.ItemClickListener;
import com.foodorder.foodorderapp.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Dell-7000 on 11/12/2018.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtMenuName;
    public ImageView imageView;

    View mview;
    private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemView) {
        super(itemView);
        mview = itemView;
        txtMenuName = itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);
        itemView.setOnClickListener(this);
        // itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }
}
