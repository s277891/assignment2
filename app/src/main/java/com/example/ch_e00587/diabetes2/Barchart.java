package com.example.ch_e00587.diabetes2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

public class Barchart extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barchart);
        BarChart barChart = (BarChart) findViewById(R.id.chart);

        // HorizontalBarChart barChart= (HorizontalBarChart) findViewById(R.id.chart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));

        BarDataSet dataset = new BarDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Cholesterol");
        labels.add("Blood pressure");
        labels.add("Blood glucose");
        labels.add("Hypo");
        labels.add("HbA1c");
        labels.add("Depression");

        ArrayList<BarEntry> group1 = new ArrayList<>();
        group1.add(new BarEntry(4, 0));
        group1.add(new BarEntry(130, 1));
        group1.add(new BarEntry(4, 2));
        group1.add(new BarEntry(4, 3));
        group1.add(new BarEntry(7, 4));
        group1.add(new BarEntry(0, 5));

        ArrayList<BarEntry> group2 = new ArrayList<>();
        group2.add(new BarEntry(8, 0));
        group2.add(new BarEntry(185, 1));
        group2.add(new BarEntry(6, 2));
        group2.add(new BarEntry(8, 3));
        group2.add(new BarEntry(10, 4));
        group2.add(new BarEntry(40, 5));

        BarDataSet barDataSet1 = new BarDataSet(group1, "Minimum units");
        //barDataSet1.setColor(Color.rgb(0, 155, 0));
        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);

        BarDataSet barDataSet2 = new BarDataSet(group2, "Maximum units");
        barDataSet2.setColors(ColorTemplate.JOYFUL_COLORS);

        ArrayList<BarDataSet> dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);

        BarData data = new BarData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); 
        barChart.setData(data);
        barChart.animateY(5000);

    }
}