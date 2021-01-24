package com.example.whatsapp_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;

import com.example.whatsapp_ui.adapters.ContactsRecyclerAdapter;
import com.example.whatsapp_ui.pojo.ContactsItem;

import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends AppCompatActivity {

    RecyclerView rvContacts;
    ContactsRecyclerAdapter mContactsRecyclerAdapter;
    LinearLayoutManager mLinearLayoutManager;
    Cursor phoneContacts;
    List<ContactsItem> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Log.d("Contacts Activity", "gettingSomeContacts: Getting contacts #1 ");
        Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        phoneContacts = getContentResolver().query(uri,null,null,null,null);
        rvContacts = findViewById(R.id.rv_contacts);
        Log.d("Contacts Activity", "gettingSomeContacts: Getting contacts #2");
        mContactsRecyclerAdapter = new ContactsRecyclerAdapter();

        mContactsRecyclerAdapter.setList(gettingSomeContacts(40));
        rvContacts.setAdapter(mContactsRecyclerAdapter);
        mLinearLayoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);
        rvContacts.setLayoutManager(mLinearLayoutManager);
    }


    protected  List<ContactsItem> gettingSomeContacts(int count){
        Log.d("Contacts Activity", "gettingSomeContacts: Getting contacts #3");
        int x = 0;
        while(phoneContacts.moveToNext()){
            int nameIndex = phoneContacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
            int imgIndex = phoneContacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.PHOTO_URI);
            if(phoneContacts.getInt(imgIndex) != 0){
                items.add(new ContactsItem(phoneContacts.getString(nameIndex),phoneContacts.getInt(imgIndex)));
            }else{
                items.add(new ContactsItem(phoneContacts.getString(nameIndex),R.drawable.ic_launcher_background));
            }
            mContactsRecyclerAdapter.notifyDataSetChanged();
            x++;
            if(x==count) break;
        }

        return items;
    }
}