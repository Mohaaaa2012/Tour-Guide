package com.greatcairo.tourguide;

/**
 * Created by Mohaaaa on 12-Jun-17.
 */

public class Tourism
{
    private String name , consDate  ;
    private int imageResourceId ;
    private long phoneNumber ;

    public Tourism (String mName  , String mConDate  ,int mimageResourceId )
    {
        this.name = mName ;
        this.consDate = mConDate ;
        this.imageResourceId = mimageResourceId ;
    }

    public Tourism (String mName  , int mPhoneNumber ,int mimageResourceId )
    {
        this.name = mName ;
        this.phoneNumber = mPhoneNumber ;
        this.imageResourceId = mimageResourceId ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setConsDate(String consDate) {
        this.consDate = consDate;
    }

    public String getConsDate() {
        return consDate;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
