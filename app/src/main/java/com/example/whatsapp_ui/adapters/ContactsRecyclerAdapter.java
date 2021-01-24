package com.example.whatsapp_ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.whatsapp_ui.R;
import com.example.whatsapp_ui.pojo.ContactsItem;

import java.util.List;

public class ContactsRecyclerAdapter extends RecyclerView.Adapter<ContactsRecyclerAdapter.ContactsViewHolder> {

    private List<ContactsItem> mContactsItemList;


    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsRecyclerAdapter.ContactsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contacts_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
               holder.tvName.setText(mContactsItemList.get(position).getName());
               holder.img.setImageResource(mContactsItemList.get(position).getImgResource());
    }

    @Override
    public int getItemCount() {
        return mContactsItemList.size();
    }

    public void setList(List<ContactsItem> list){
        this.mContactsItemList = list;
    }

    protected class ContactsViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        ImageView img;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.contact_name);
            img = itemView.findViewById(R.id.img_contact);
        }
    }
}
