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

import com.example.whatsapp_ui.adapters.StatusRecyclerAdapter;
import com.example.whatsapp_ui.pojo.StatusItem;

import java.util.ArrayList;
import java.util.List;


public class StatusFragment extends Fragment {

    public static String title = "STATUS";

    protected RecyclerView rvStatus;
   // View view;
    StatusRecyclerAdapter mStatusRecyclerAdapter;
    LinearLayoutManager mLinearLayoutManager;

  public StatusFragment(){

  }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvStatus = view.findViewById(R.id.rv_status);
        mStatusRecyclerAdapter = new StatusRecyclerAdapter();
        mStatusRecyclerAdapter.setStatusItemList(getStatusList());
        rvStatus.setAdapter(mStatusRecyclerAdapter);
        mLinearLayoutManager =
                new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rvStatus.setLayoutManager(mLinearLayoutManager);
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