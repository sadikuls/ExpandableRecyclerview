package com.sadikul.expandablerecyclerview.model;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by ASUS on 21-Jan-18.
 */

public class Genre extends ExpandableGroup<Artist> {

    String outerString;
    List<Artist> items;

    public String getOuterString() {
        return outerString;
    }

    public void setOuterString(String outerString) {
        this.outerString = outerString;
    }

    public Genre(String title, List<Artist> items) {
        super(title, items);
        outerString = title;
        this.items = items;
    }

    @Override
    public List<Artist> getItems() {
        return items;
    }

    public void setItems(List<Artist> items) {
        this.items = items;
    }
}
