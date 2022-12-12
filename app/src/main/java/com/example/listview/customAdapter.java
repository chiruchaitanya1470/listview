package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter<listView> {
    private ArrayList<listView> data;
    Context context;
    public customAdapter(ArrayList<listView> data,Context context){
        super(context,R.layout.custom_list,data);
        this.data=data;
        this.context=context;
    }
    public static class ViewHolder{
        TextView disease;
        TextView docinfo;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // getting data for this position
        listView posdata = getItem(position);
        final View result;
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.custom_list,
                    parent,
                    false);
            viewHolder.disease = (TextView) convertView.findViewById(R.id.textview);
            viewHolder.docinfo = (TextView) convertView.findViewById(R.id.textinfo);
            result= convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
//            return null;
        }
        viewHolder.disease.setText(posdata.getDisease());
        viewHolder.docinfo.setText(posdata.getDocinfo());
        return convertView;



        //  return super.getView(position, convertView, parent);
    }
}
