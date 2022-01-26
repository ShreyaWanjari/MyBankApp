package com.example.android.mybank;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class UsersAdapter extends ArrayAdapter<Contacts> {


    public UsersAdapter(Activity context, ArrayList<Contacts> contact) {
        super(context,0, contact);
    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listItemView= convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Contacts currentContact = getItem(position);

        TextView nameView = (TextView) listItemView.findViewById(R.id.name);
        nameView.setText(currentContact.getName());

        TextView phoneView = (TextView) listItemView.findViewById(R.id.phoneNo);
        phoneView.setText(currentContact.getPhone());


        TextView rupeesView = (TextView) listItemView.findViewById(R.id.Rupees);
        rupeesView.setText(currentContact.getRupees());
        return listItemView;
    }
}
