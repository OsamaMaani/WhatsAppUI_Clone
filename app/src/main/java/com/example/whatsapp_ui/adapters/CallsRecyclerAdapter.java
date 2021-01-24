package com.example.whatsapp_ui.adapters;


import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp_ui.R;
import com.example.whatsapp_ui.pojo.CallsItem;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;


public class CallsRecyclerAdapter extends RecyclerView.Adapter<CallsRecyclerAdapter.CallsViewHolder> {

    private List<CallsItem> mCallsItems;


    @NonNull
    @Override
    public CallsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CallsRecyclerAdapter.CallsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calls_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CallsViewHolder holder, int position) {
        holder.img.setImageResource(R.drawable.book);
        holder.date.setText(mCallsItems.get(position).getDate());
        holder.title.setText(mCallsItems.get(position).getChatName());
    }

    @Override
    public int getItemCount() {
        return mCallsItems.size();
    }

    public void setCallsItems(List<CallsItem> list){
        this.mCallsItems = list;
    }

    public class CallsViewHolder extends RecyclerView.ViewHolder {
        CircularImageView img;
        TextView title;
        TextView date;
        public CallsViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_calls);
            img.setBorderColor(Color.BLACK);
            title = itemView.findViewById(R.id.calls_title);
            date = itemView.findViewById(R.id.calls_date);
        }
    }
}
