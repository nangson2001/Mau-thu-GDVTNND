package com.example.mauthu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaiSanAdapter extends RecyclerView.Adapter<TaiSanAdapter.TaiSanViewHolder>{

    private List<TaiSan> taiSanList;
    private IItemClick iItemClick;

    public interface IItemClick {
        void onUpdateClick(TaiSan taiSan);
        void onDeleteClick(TaiSan taiSan);
    }

    public TaiSanAdapter(List<TaiSan> taiSanList, IItemClick iItemClick) {
        this.taiSanList = taiSanList;
        this.iItemClick = iItemClick;
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
        holder.btnEdit.setOnClickListener(v -> {
            iItemClick.onUpdateClick(taiSan);
        });
        holder.btnDelete.setOnClickListener(v -> {
            iItemClick.onDeleteClick(taiSan);
        });
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
        private ImageButton btnEdit;
        private ImageButton btnDelete;


        public TaiSanViewHolder(@NonNull View itemView) {
            super(itemView);
            STT = itemView.findViewById(R.id.textview_column_1);
            ten = itemView.findViewById(R.id.textview_column_2);
            nhom = itemView.findViewById(R.id.textview_column_3);
            loai = itemView.findViewById(R.id.textview_column_4);
            nguoiSoHuu = itemView.findViewById(R.id.textview_column_5);
            trangThai = itemView.findViewById(R.id.textview_column_6);
            btnEdit = itemView.findViewById(R.id.btn_edit);
            btnDelete = itemView.findViewById(R.id.btn_delete);
        }
    }
}
