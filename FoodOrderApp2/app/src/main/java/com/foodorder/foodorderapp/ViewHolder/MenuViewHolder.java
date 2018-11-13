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

public class MenuViewHolder extends RecyclerView.ViewHolder {

    public TextView txtMenuName;
    public ImageView imageView;

    View mview;
    private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemView) {
        super(itemView);
        mview = itemView;

        // itemView.setOnClickListener(this);
    }

    public void setDetails(Context context, String name, String image) {
        txtMenuName = mview.findViewById(R.id.menu_name);
        imageView = mview.findViewById(R.id.menu_image);

        txtMenuName.setText(name);
        Picasso.with(context).load(image).into(imageView);
    }


}
