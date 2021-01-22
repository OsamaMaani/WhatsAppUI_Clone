package com.example.whatsapp_ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp_ui.R;
import com.example.whatsapp_ui.pojo.StatusItem;

import java.util.List;

public class StatusRecyclerAdapter extends RecyclerView.Adapter<StatusRecyclerAdapter.StatusViewHolder>{

    List<StatusItem> mStatusItemList;

    public StatusRecyclerAdapter(){

    }
    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StatusRecyclerAdapter.StatusViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.status_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StatusViewHolder holder, int position) {
        holder.img.setImageResource(R.drawable.ic_launcher_foreground);
        holder.date.setText(mStatusItemList.get(position).getDate());
        holder.title.setText(mStatusItemList.get(position).getChatName());
    }

    @Override
    public int getItemCount() {
        return mStatusItemList.size();
    }

    public void setStatusItemList(List<StatusItem> list){
        this.mStatusItemList = list;
    }

    public class StatusViewHolder  extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        TextView date;
        public StatusViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_status);
            title = itemView.findViewById(R.id.status_title);
            date = itemView.findViewById(R.id.status_date);

        }
    }
}
