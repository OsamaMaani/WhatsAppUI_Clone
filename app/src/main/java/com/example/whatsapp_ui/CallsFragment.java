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

import com.example.whatsapp_ui.adapters.CallsRecyclerAdapter;
import com.example.whatsapp_ui.pojo.CallsItem;

import java.util.ArrayList;
import java.util.List;


public class CallsFragment extends Fragment {


    public static String title = "CALLS";
    RecyclerView rvCalls;
    CallsRecyclerAdapter mCallsRecyclerAdapter;
    LinearLayoutManager mLinearLayoutManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCalls = view.findViewById(R.id.rv_calls);
        mCallsRecyclerAdapter  = new CallsRecyclerAdapter();
        mCallsRecyclerAdapter.setCallsItems(getCallsItems());
        rvCalls.setAdapter(mCallsRecyclerAdapter);
        mLinearLayoutManager =
                new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rvCalls.setLayoutManager(mLinearLayoutManager);
    }


    List<CallsItem> getCallsItems(){
      List<CallsItem> list = new ArrayList<>();
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));
        list.add(new CallsItem("Osama","1/12/2020"));

        return list;
    }


}