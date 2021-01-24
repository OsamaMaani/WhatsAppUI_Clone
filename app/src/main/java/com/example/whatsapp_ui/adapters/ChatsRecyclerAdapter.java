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
import com.example.whatsapp_ui.pojo.ChatItem;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class ChatsRecyclerAdapter extends RecyclerView.Adapter<ChatsRecyclerAdapter.ChatsViewHolder> {

    private List<ChatItem> mChatItemList;

    public ChatsRecyclerAdapter(){

    }

    @NonNull
    @Override
    public ChatsRecyclerAdapter.ChatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chats_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsRecyclerAdapter.ChatsViewHolder holder, int position) {
         holder.img.setImageResource(R.drawable.book);
         holder.details.setText(mChatItemList.get(position).getDetails());
         holder.date.setText(mChatItemList.get(position).getDate());
         holder.title.setText(mChatItemList.get(position).getChatName());
    }
    public void setList(List<ChatItem> list){
        this.mChatItemList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mChatItemList.size();
    }

    public class ChatsViewHolder extends RecyclerView.ViewHolder {
        CircularImageView img;
        TextView title;
        TextView date;
        TextView details;
        public ChatsViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_chat);
            img.setBorderColor(Color.BLACK);
            title = itemView.findViewById(R.id.chat_title);
            date = itemView.findViewById(R.id.chat_date);
            details = itemView.findViewById(R.id.chat_detail);
        }
    }
}
