package com.example.sharepreferences;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterSubjects extends BaseAdapter implements ListAdapter {
    private Activity activity;
    private List<Item> araylistSubjects;

    @Override
    public int getCount() {
        return araylistSubjects.size();
    }

    @Override
    public Object getItem(int i) {
        return araylistSubjects.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    public AdapterSubjects(Activity activity, List<Item> araylistSubjects) {
        this.activity = activity;
        this.araylistSubjects = araylistSubjects;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        view = layoutInflater.inflate(R.layout.layoutitem, null);


        TextView textV1 = view.findViewById(R.id.tv_name);
        TextView textV2 = view.findViewById(R.id.note);
        TextView textV3 = view.findViewById(R.id.quocgia);
        ImageView textimg = view.findViewById(R.id.imghinh);

        textV1.setText(araylistSubjects.get(i).getTencasi());
        textV2.setText(araylistSubjects.get(i).getNghedanh());
        textV3.setText(araylistSubjects.get(i).getQuocgia());
        textimg.setImageResource(araylistSubjects.get(i).getHinh());

        return view;
    }
}
