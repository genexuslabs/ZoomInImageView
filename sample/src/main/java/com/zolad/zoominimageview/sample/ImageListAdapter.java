package com.zolad.zoominimageview.sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

import java.util.List;

public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ImgViewHolder> {

    private List<Integer> mImgList;
    Context mContext;

    ImageListAdapter(Context context) {
        this.mContext = context;
    }

    @NonNull
    @Override
    public ImgViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_image, parent, false);
        return new ImgViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImgViewHolder holder, int position) {
        holder.tv_position.setText("picture" + (position + 1));
        Glide.with(mContext).load(mImgList.get(position)).into(holder.iv_pic);
        holder.iv_pic.setOnClickListener(v -> Toast.makeText(mContext, "click", Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return mImgList == null ? 0 : mImgList.size();
    }

    public void setImgList(List<Integer> imgList) {
        mImgList = imgList;
        notifyDataSetChanged();
    }

    public static class ImgViewHolder extends RecyclerView.ViewHolder {
        public final ZoomInImageView iv_pic;
        public final TextView tv_position;

        public ImgViewHolder(View itemView) {
            super(itemView);
            iv_pic = itemView.findViewById(R.id.iv_pic);
            tv_position = itemView.findViewById(R.id.tv_position);
        }
    }
}
