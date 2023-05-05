package com.robby.dicoding.cekgadget;

import android.os.Parcel;
import android.os.Parcelable;

public class Gadget implements Parcelable {
    private String name;
    private String detail;
    private int img;

    public Gadget(){

    }

    protected Gadget(Parcel in) {
        name = in.readString();
        detail = in.readString();
        img = in.readInt();
    }

    public static final Creator<Gadget> CREATOR = new Creator<Gadget>() {
        @Override
        public Gadget createFromParcel(Parcel in) {
            return new Gadget(in);
        }

        @Override
        public Gadget[] newArray(int size) {
            return new Gadget[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(img);
    }
}
