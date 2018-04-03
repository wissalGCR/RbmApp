package com.example.wissal1.rbmapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wissal1.rbmapp.database.model.Temperature;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by USER on 30/03/2018.
 */

public class TemperaturesAdapter extends RecyclerView.Adapter<TemperaturesAdapter.MyViewHolder> {
    private Context context;
    private List<Temperature> temperaturesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView temperature;
        public TextView dot;
        public TextView date;
        public TextView num ;

        public MyViewHolder(View view) {
            super(view);
            temperature = view.findViewById(R.id.temperature);
            dot = view.findViewById(R.id.dot);
            date = view.findViewById(R.id.date);
            //num=view.findViewById(R.id.num);
        }
    }


    public TemperaturesAdapter(Context context, List<Temperature> temperaturesList) {
        this.context = context;
        this.temperaturesList = temperaturesList;
    }

    @NonNull
    @Override
    public TemperaturesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.temperature_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TemperaturesAdapter.MyViewHolder holder, int position) {
        Temperature note = temperaturesList.get(position);

        holder.temperature.setText(note.getValeurTemperature());

        // Displaying dot from HTML character code
        holder.dot.setText(Html.fromHtml("&#8226;"));

        // Formatting and displaying timestamp
        holder.date.setText(formatDate(note.getDate()));

    }

    @Override
    public int getItemCount() {
        return temperaturesList.size();
    }

    /**
     * Formatting timestamp to `MMM d` format
     * Input: 2018-02-21 00:15:42
     * Output: Feb 21
     */
    private String formatDate(String dateStr) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = fmt.parse(dateStr);
            SimpleDateFormat fmtOut = new SimpleDateFormat("MMM d HH:mm:ss");
            return fmtOut.format(date);
        } catch (ParseException e) {

        }

        return "";
    }



}
