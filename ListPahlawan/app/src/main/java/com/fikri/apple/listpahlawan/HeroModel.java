package com.fikri.apple.listpahlawan;

import android.os.Parcel;
import android.os.Parcelable;

public class HeroModel implements Parcelable {
    private String name;
    private String from;
    private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.from);
        dest.writeString(this.photo);

    }

    HeroModel(){

    }

    private HeroModel(Parcel in){
        this.name = in.readString();
        this.from = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<HeroModel> CREATOR = new Parcelable.Creator<HeroModel>(){

        @Override
        public HeroModel createFromParcel(Parcel source) {
            return new HeroModel(source);
        }

        @Override
        public HeroModel[] newArray(int size) {
            return new HeroModel[size];
        }
    };
}
