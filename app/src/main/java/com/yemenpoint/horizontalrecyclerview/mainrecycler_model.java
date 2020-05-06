package com.yemenpoint.horizontalrecyclerview;

import androidx.fragment.app.Fragment;

class mainrecycler_model{
    String id ,name ;
    int image ;
    Fragment fragment;

    public mainrecycler_model(String id, String name, int image, Fragment fragment) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.fragment = fragment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}