package com.example.whatsapp_ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp_ui.adapters.ChatsRecyclerAdapter;
import com.example.whatsapp_ui.pojo.ChatItem;

import java.util.ArrayList;
import java.util.List;


public class ChatsFragment extends Fragment {

    public static String title = "CHATS";
    RecyclerView rvChats;
    LinearLayoutManager mLinearLayoutManager;

    public ChatsFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvChats = view.findViewById(R.id.rv_chats);
        ChatsRecyclerAdapter mChatsRecyclerAdapter = new ChatsRecyclerAdapter();
        mChatsRecyclerAdapter.setList(getChatList());
        rvChats.setAdapter(mChatsRecyclerAdapter);
        mLinearLayoutManager =
                new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rvChats.setLayoutManager(mLinearLayoutManager);
    }

    List<ChatItem> getChatList(){
        List<ChatItem> listItems = new ArrayList<>();
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));
        listItems.add(new ChatItem("Ahmed",
                "I am very pleased to talk to you","20/12/2020"));

        return listItems;
    }

}