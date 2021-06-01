package com.example.minimo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class MyAdapter {

    private List<Insignias> insiginias;
    private List<Insignias> insiginiasUser;
    private Context context;

    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        context = parent.getContext();
        return new MyAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_recyclerview,parent,false));

    }

    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position){

        Insignias insignia = insiginias.get(position);
        String nombreInsignia = insignia.getName();
        String URL_IMG= insignia.getAvatar();
        //Glide.with(context).load(URL_IMG).into(holder.imageView);
        holder.name.setText(nombreInsignia);
        Insignias insignia2 = insiginiasUser.get(position);
        String nombreInsignia2 = insignia2.getName();
        String URL_IMG2= insignia2.getAvatar();
        //Glide.with(context).load(URL_IMG2).into(holder.imageView);
        holder.name.setText(nombreInsignia2);

    }

    public class ViewHolder {
        TextView insignias;
        ImageView fotoInsignia;
        ImageView avatar;
        TextView user;
        TextView name;
        ImageView insigniasUser;
        TextView insigniasName;
        public View layout;

        public ViewHolder(View itemView) {
            super(itemView);
            layout = itemView;
            insignias = itemView.findViewById(R.id.insignias);
            fotoInsignia = itemView.findViewById(R.id.fotoInsignia);
            user = itemView.findViewById(R.id.user);
            name = itemView.findViewById(R.id.name);
            insigniasUser = itemView.findViewById(R.id.insignias);
            insigniasName = itemView.findViewById(R.id.insigniasName);
            avatar = itemView.findViewById(R.id.avatar);

        }
    }
}
