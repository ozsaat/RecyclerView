package com.ozsaat.recyclerview;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import android.view.View;
import android.widget.TextView;

public class RecyclerChildViewHolder extends ChildViewHolder{

    public TextView childTitleTextView;

    public RecyclerChildViewHolder(View itemView) {
        super(itemView);

        childTitleTextView = (TextView) itemView.findViewById(R.id.child_list_text_view);
    }
}
