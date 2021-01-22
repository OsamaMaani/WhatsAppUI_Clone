package com.example.whatsapp_ui;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.whatsapp_ui.adapters.CallsRecyclerAdapter;
import com.example.whatsapp_ui.adapters.ChatsRecyclerAdapter;
import com.example.whatsapp_ui.adapters.PagerAdapter;

import com.example.whatsapp_ui.adapters.StatusRecyclerAdapter;
import com.example.whatsapp_ui.pojo.ChatItem;
import com.example.whatsapp_ui.pojo.StatusItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TabLayout mTabLayout;
    ViewPager mViewPager;
    FloatingActionButton fab;
    RecyclerView rvChats, rvStatus, rvCalls;
//    ChatsRecyclerAdapter mChatsRecyclerAdapter;
    StatusRecyclerAdapter mStatusRecyclerAdapter;
    CallsRecyclerAdapter mCallsRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = findViewById(R.id.tabLayout);
        mViewPager = findViewById(R.id.view_pager);
        fab = findViewById(R.id.fab);
        rvChats = findViewById(R.id.rv_chats);
        rvStatus = findViewById(R.id.rv_status);
        rvCalls = findViewById(R.id.rv_calls);

        Log.d("MainActivity", "onCreate: Start ");
        mStatusRecyclerAdapter = new StatusRecyclerAdapter();
        Log.d("MainActivity", "onCreate: End ");
        mStatusRecyclerAdapter.setStatusItemList(getStatusList());
        rvStatus.setAdapter(mStatusRecyclerAdapter);

        PagerAdapter pagerAdapter =
                new PagerAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        ChatsRecyclerAdapter mChatsRecyclerAdapter = new ChatsRecyclerAdapter();
        mChatsRecyclerAdapter.setList(getChatList());
        rvChats.setAdapter(mChatsRecyclerAdapter);




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


    List<StatusItem> getStatusList(){
        List<StatusItem> listItems = new ArrayList<>();
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        listItems.add(new StatusItem("Ahmed","2020"));
        return listItems;
    }
}