package com.example.ch_e00587.diabetes2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
public class ListDataAdapter extends ArrayAdapter{
    List list= new ArrayList();
    public ListDataAdapter(Context context,int resource){
        super(context,resource);
    }
    static class LayoutHandler{
        TextView Name,Dob,Cholestrol,Bp,Hypo,Glucose;
    }
    public void add(Object object){
        super.add(object);
        list.add(object);

    }
    public int getCount(){
        return list.size();
    }
    public Object getTtem(int position){
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        LayoutHandler layoutHandler;
        if(row == null)
        {
            LayoutInflater layoutInflater =(LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=layoutInflater.inflate(R.layout.activity_profile,parent,false);
            layoutHandler=new LayoutHandler();
            layoutHandler.Name=(TextView)row.findViewById(R.id.nametv);
            layoutHandler.Dob=(TextView)row.findViewById(R.id.textv2);
            layoutHandler.Cholestrol=(TextView)row.findViewById(R.id.textv4);
            layoutHandler.Bp=(TextView)row.findViewById(R.id.textv3);
            layoutHandler.Hypo=(TextView)row.findViewById(R.id.textv5);
            layoutHandler.Glucose=(TextView)row.findViewById(R.id.textv6);
            row.setTag(layoutHandler);
        }

        else{
            layoutHandler=(LayoutHandler)row.getTag();
        }
        DataProvider dataProvider=(DataProvider)this.getTtem(position);
        layoutHandler.Name.setText(dataProvider.get_name());
        layoutHandler.Dob.setText(dataProvider.get_dob());
        layoutHandler.Cholestrol.setText(dataProvider.get_cholestrol());
        layoutHandler.Bp.setText(dataProvider.get_bp());
        layoutHandler.Hypo.setText(dataProvider.get_hypo());
        layoutHandler.Glucose.setText(dataProvider.get_glucose());
        return row;
    }
}
