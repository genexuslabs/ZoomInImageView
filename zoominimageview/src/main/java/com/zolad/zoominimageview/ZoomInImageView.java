package com.zolad.zoominimageview;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

/**
 * A zoomable ImageView for Android, can be used in AdapterView and Recyclerview.
 * */
public class ZoomInImageView extends AppCompatImageView {


    ZoomInImageViewAttacher  attacher;

    public ZoomInImageView(Context context) {
        this(context,null);

    }

    public ZoomInImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);

    }


    public ZoomInImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        attacher  = new ZoomInImageViewAttacher(this);




    }






}
