package com.sadikul.expandablerecyclerview.CustomHolder;

import android.view.View;
import android.widget.TextView;

import com.sadikul.expandablerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by ASUS on 21-Jan-18.
 */

public class OuterViewHolder extends GroupViewHolder{

        private TextView genreTitle;

        public OuterViewHolder(View itemView) {
            super(itemView);
            genreTitle = itemView.findViewById(R.id.outerText);
        }

        public void setGenreTitle(ExpandableGroup group) {
            genreTitle.setText(group.getTitle());
        }
}
