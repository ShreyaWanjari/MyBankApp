package com.example.android.mybank;

public class Contacts {
    private String mphoneno;
    private String mname;
    private String mRupees;

    public Contacts(String PhoneNo, String Name,String Rupees){
        mphoneno = PhoneNo;
        mname = Name;
        mRupees=Rupees;
    }
    public String getName(){
        return mname;
    }
    public String getPhone(){
        return mphoneno;
    }
    public String getRupees(){ return mRupees;
    }


}
