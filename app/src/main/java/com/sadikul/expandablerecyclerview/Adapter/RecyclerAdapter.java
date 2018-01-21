package com.sadikul.expandablerecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sadikul.expandablerecyclerview.CustomHolder.InnerViewHolder;
import com.sadikul.expandablerecyclerview.CustomHolder.OuterViewHolder;
import com.sadikul.expandablerecyclerview.R;
import com.sadikul.expandablerecyclerview.model.Artist;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by ASUS on 21-Jan-18.
 */

public class RecyclerAdapter extends ExpandableRecyclerViewAdapter<OuterViewHolder, InnerViewHolder> {

    Context context;
    public RecyclerAdapter(Context context, List<? extends ExpandableGroup> groups) {
        super(groups);
        this.context = context;
    }

    @Override
    public OuterViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.outer_layout, parent, false);
        return new OuterViewHolder(view);
    }

    @Override
    public InnerViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.inner_layout, parent, false);
        return new InnerViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(InnerViewHolder holder, int flatPosition, ExpandableGroup group,
                                      int childIndex) {
        final Artist artist = (Artist) group.getItems().get(childIndex);
        holder.setSubTitletName(artist.getInnerName());
    }

    @Override
    public void onBindGroupViewHolder(OuterViewHolder holder, int flatPosition,
                                      ExpandableGroup group) {
        holder.setGenreTitle(group);
    }
}
