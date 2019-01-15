package com.tcawglobal.hzplayer;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class CustomMusicAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Music> arrayList;
    //private ArrayList<File> arrayList;

    public CustomMusicAdapter(Context context, int layout, ArrayList<Music> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
        //this.mySongs = mySongs;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView txtName, txtSinger;
        ImageView ivPlay, ivStop;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout,null);
            viewHolder.txtName = convertView.findViewById(R.id.txtName);
            viewHolder.txtSinger = convertView.findViewById(R.id.txtSinger);
            viewHolder.ivPlay = convertView.findViewById(R.id.ivPlay);
            viewHolder.ivStop = convertView.findViewById(R.id.ivStop);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Music song = arrayList.get(position);

        viewHolder.txtName.setText(song.getName());
        //viewHolder.txtSinger.setText(song.getSinger());
        return convertView;
    }
}
