package com.foodorder.foodorderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.foodorder.foodorderapp.Model.Category;
import com.foodorder.foodorderapp.Interface.ItemClickListener;
import com.foodorder.foodorderapp.ViewHolder.MenuViewHolder;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class Main extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference category;
    TextView test;
    TextView txtFullName;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //test= (TextView) findViewById(R.id.test);
        //test.setText("gvvvvvvvvvvvv");
//        database = FirebaseDatabase.getInstance();
//        category = database.getReference("category");
//
//        recyclerView = (RecyclerView) findViewById(R.id.recycler_menu);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
       // loadMenu();
    }

//    private void loadMenu() {
//        FirebaseRecyclerAdapter<Category, MenuViewHolder> adapter = new FirebaseRecyclerAdapter<Category, MenuViewHolder>(Category.class, R.layout.menu_item, MenuViewHolder.class, category) {
//            @Override
//            protected void populateViewHolder(MenuViewHolder viewHolder, Category model, int position) {
//
//                //test.setText(model.getName());
//                Toast.makeText(Main.this, "" + model.getName()+"|"+model.getImage(), Toast.LENGTH_SHORT).show();
//                //viewHolder.txtMenuName.setText(model.getName());
//                Picasso.with(getBaseContext()).load(model.getImage())
//                        .into(viewHolder.imageView);
//                final Category clickItem = model;
//                //viewHolder.setItemClickListener(new ItemClickListener() {
//                    @Override
//                    public void onClick(View view, int position, boolean isLongClick) {
//                        Toast.makeText(Main.this, "" + clickItem.getName(), Toast.LENGTH_SHORT).show();
//                    }
//                });
//            }
//        };
//
//       recyclerView.setAdapter(adapter);
//    }
}
