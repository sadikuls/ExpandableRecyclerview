package com.sadikul.expandablerecyclerview.CustomHolder;

import android.view.View;
import android.widget.TextView;

import com.sadikul.expandablerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by ASUS on 21-Jan-18.
 */

public class InnerViewHolder extends ChildViewHolder {

    private TextView artistName;

    public InnerViewHolder(View itemView) {
        super(itemView);
        artistName = itemView.findViewById(R.id.inner_text);
    }

    public void setSubTitletName(String name) {
        artistName.setText(name);
    }
}