package com.example.utsav.androiddatabindingexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.utsav.androiddatabindingexample.BR;

public class User extends BaseObservable {
    /**
     * name : Tom Hardy
     * image : https://api.androidhive.info/json/images/tom_hardy.jpg
     * phone : (541) 754-3010
     */

    private String name;
    private String image;
    private String phone;

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String image) {
        Glide.with(view.getContext())
                .load(image)
                .into(view);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

    @Bindable
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        notifyPropertyChanged(BR.phone);
    }

    /**
     * name : Tom Hardy
     * image : https://api.androidhive.info/json/images/tom_hardy.jpg
     * phone : (541) 754-3010
     */


}
