package com.sadikul.expandablerecyclerview.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ASUS on 21-Jan-18.
 */

public class Artist implements Parcelable {
    String innerName;

    public Artist(String innerName) {
        this.innerName = innerName;
    }

    protected Artist(Parcel in) {
        innerName = in.readString();
    }

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    public String getInnerName() {
        return innerName;
    }

    public void setInnerName(String innerName) {
        this.innerName = innerName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(innerName);
    }
}
