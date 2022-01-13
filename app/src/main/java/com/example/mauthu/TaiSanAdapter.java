package com.example.mauthu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaiSanAdapter extends RecyclerView.Adapter<TaiSanAdapter.TaiSanViewHolder>{

    private List<TaiSan> taiSanList;

    public TaiSanAdapter(List<TaiSan> taiSanList) {
        this.taiSanList = taiSanList;
    }

    @NonNull
    @Override
    public TaiSanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new TaiSanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaiSanViewHolder holder, int position) {
        TaiSan taiSan = taiSanList.get(position);
        if (taiSan == null) return;
        holder.STT.setText(String.valueOf(taiSan.getSTT()));
        holder.ten.setText(taiSan.getTen());
        holder.trangThai.setText(taiSan.getTrangThai());
        holder.nhom.setText(taiSan.getNhom());
        holder.nguoiSoHuu.setText(taiSan.getNguoiSoHuu());
        holder.loai.setText(taiSan.getLoai());
    }

    @Override
    public int getItemCount() {
        if (taiSanList != null) return taiSanList.size();
        else return 0;
    }

    public class TaiSanViewHolder extends RecyclerView.ViewHolder {
        private TextView STT;
        private TextView ten;
        private TextView nhom;
        private TextView loai;
        private TextView nguoiSoHuu;
        private TextView trangThai;


        public TaiSanViewHolder(@NonNull View itemView) {
            super(itemView);
            STT = itemView.findViewById(R.id.textview_column_1);
            ten = itemView.findViewById(R.id.textview_column_2);
            nhom = itemView.findViewById(R.id.textview_column_3);
            loai = itemView.findViewById(R.id.textview_column_4);
            nguoiSoHuu = itemView.findViewById(R.id.textview_column_5);
            trangThai = itemView.findViewById(R.id.textview_column_6);
        }
    }
}
