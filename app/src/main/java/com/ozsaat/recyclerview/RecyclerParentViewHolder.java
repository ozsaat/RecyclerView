package com.ozsaat.recyclerview;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerParentViewHolder extends ParentViewHolder {

    public ImageView parentImageView;
    public TextView parentTitleTextView;

    public RecyclerParentViewHolder(View itemView) {
        super(itemView);

        parentImageView = (ImageView) itemView.findViewById(R.id.imageIcon);
        parentTitleTextView = (TextView) itemView.findViewById(R.id.parent_list_text_view);
    }
}
