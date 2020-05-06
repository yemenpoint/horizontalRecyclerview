package com.yemenpoint.horizontalrecyclerview;

import android.app.Activity;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Phenomenal on 2/22/2019.
 */

public class LikeRecyclerAdapter extends RecyclerView.Adapter<LikeRecyclerAdapter.ViewHolder> {
    private ArrayList<mainrecycler_model> isnaf_array = new ArrayList<>();
    private Context mContext;
    private ClickCallback clickCallback;
    public int focpostion = 1;
    public LikeRecyclerAdapter( Context mContext,ArrayList<mainrecycler_model> isnaf_array,ClickCallback clickCallbac) {
        this.mContext = mContext;
        this.isnaf_array = isnaf_array;
        this.clickCallback = clickCallbac;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.likerecylerview_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        try {
            focpostion = position;
            final mainrecycler_model mainrecycler_model = isnaf_array.get(position);
            holder.like_text.setText(mainrecycler_model.getName());
            holder.like_img.setImageResource(mainrecycler_model.getImage());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickCallback.onClick(position,isnaf_array.get(position));
                }
            });
        }catch (Exception e){}
    }
    @Override
    public int getItemCount() {
        return isnaf_array.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView like_img;
        TextView like_text;


        public ViewHolder(View itemView){
            super(itemView);
            like_img = (ImageView) itemView.findViewById(R.id.like_img);
            like_text = (TextView) itemView.findViewById(R.id.like_text);
//            Typeface tf = Typeface.createFromAsset(mContext.getAssets(), "fonts/Cocon_next_arabic_light.otf");
//            like_text.setTypeface(tf);
        }
    }
}
