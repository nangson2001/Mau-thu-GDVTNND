package com.example.mauthu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KhauHaoAdapter extends RecyclerView.Adapter<KhauHaoAdapter.KhauHaoViewHolder>{

    private List<TaiSan> taiSanList;

    public KhauHaoAdapter(List<TaiSan> taiSanList) {
        this.taiSanList = taiSanList;
    }

    @NonNull
    @Override
    public KhauHaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);
        return new KhauHaoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KhauHaoViewHolder holder, int position) {
        TaiSan taiSan = taiSanList.get(position);
        if (taiSan == null) return;
        holder.STT.setText(String.valueOf(taiSan.getSTT()));
        holder.ten.setText(taiSan.getTen());
        holder.trangThai.setText(String.valueOf(taiSan.getGiaTien() - taiSan.getKhauHaoHangThang()*2));
        holder.nhom.setText(taiSan.getNhom());
        holder.nguoiSoHuu.setText(String.valueOf(taiSan.getKhauHaoHangThang()));
        holder.loai.setText(String.valueOf(taiSan.getGiaTien()));
    }

    @Override
    public int getItemCount() {
        if (taiSanList != null) return taiSanList.size();
        else return 0;
    }

    public class KhauHaoViewHolder extends RecyclerView.ViewHolder {
        private TextView STT;
        private TextView ten;
        private TextView nhom;
        private TextView loai;
        private TextView nguoiSoHuu;
        private TextView trangThai;


        public KhauHaoViewHolder(@NonNull View itemView) {
            super(itemView);
            STT = itemView.findViewById(R.id.textview_column_12);
            ten = itemView.findViewById(R.id.textview_column_22);
            nhom = itemView.findViewById(R.id.textview_column_32);
            loai = itemView.findViewById(R.id.textview_column_42);
            nguoiSoHuu = itemView.findViewById(R.id.textview_column_52);
            trangThai = itemView.findViewById(R.id.textview_column_62);
        }
    }
}
