package com.example.georgemanya.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by George Manya on 06/04/2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;


    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        if (convertView == null) {

            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(95, 95));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }


        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    private Integer[] mThumbIds = {R.drawable.manzana, R.drawable.pera,
            R.drawable.sandia, R.drawable.banano, R.drawable.mora,
            R.drawable.mango, R.drawable.naranja, R.drawable.duazno,
            R.drawable.fresa, R.drawable.limon, R.drawable.kiwi,
            R.drawable.pinna
    };
}
