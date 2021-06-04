package com.rifiandev.rifianapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.ListViewHolder> {
    private ArrayList<Friendly> dailyList;

    public DailyAdapter(ArrayList<Friendly> list){
        this.dailyList = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily, parent,false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyAdapter.ListViewHolder holder, int position) {
        Friendly f = dailyList.get(position);
        holder.tv_kegiatan.setText(f.getKegiatan());

    }

    @Override
    public int getItemCount() {
        return dailyList.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_kegiatan;
        ListViewHolder(View itemview) {
            super(itemview);
            tv_kegiatan = itemview.findViewById(R.id.itemDaily);
        }
    }
}
