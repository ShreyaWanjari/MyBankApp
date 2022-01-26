package com.example.android.mybank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AllUsers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_users);
        ArrayList<Contacts> contacts = new ArrayList<Contacts>();

        contacts.add(new Contacts("7425896310","Shreya","₹500"));
        contacts.add(new Contacts("8475963214","Aayush","₹850"));
        contacts.add(new Contacts("7214896533","Rutika","₹952"));
        contacts.add(new Contacts("9875588446","Avantika","₹1000"));
        contacts.add(new Contacts("9477559966","Khushi","₹1452"));
        contacts.add(new Contacts("7745244855","Aditi","₹520"));
        contacts.add(new Contacts("8854776895","Bhushan","₹855"));
        contacts.add(new Contacts("9579594955","Rohit","₹900"));
        contacts.add(new Contacts("7083698874","Rahul","₹1500"));
        contacts.add(new Contacts("8024596674","Rupal","₹2000"));

     // LinearLayout rootview = (LinearLayout) findViewById(R.id.contacts);
//      int index = 0;
//   while (index < contacts.size()) {
//       TextView contactview = new TextView(this);
//       contactview.setText(contacts.get(index));
//       rootview.addView(contactview);
//       index++;
//   }
        UsersAdapter adapter = new UsersAdapter(this,contacts);
        ListView listView = (ListView) findViewById(R.id.contacts);
        listView.setAdapter(adapter);
    }

}