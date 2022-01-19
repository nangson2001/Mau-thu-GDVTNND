package com.example.mauthu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KhauHaoAdapter extends RecyclerView.Adapter<KhauHaoAdapter.KhauHaoViewHolder>{

    private List<TaiSan> taiSanList;
    private IItemKHClick iItemKHClick;

    public KhauHaoAdapter(List<TaiSan> taiSanList, IItemKHClick iItemKHClick) {
        this.taiSanList = taiSanList;
        this.iItemKHClick = iItemKHClick;
    }

    public interface IItemKHClick {
        void onUpdateClick(TaiSan taiSan);
        void onDeleteClick(TaiSan taiSan);
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

        holder.btnEdit.setOnClickListener(v -> {
            iItemKHClick.onUpdateClick(taiSan);
        });
        holder.btnDelete.setOnClickListener(v -> {
            iItemKHClick.onDeleteClick(taiSan);
        });
    }

    @Override
    public int getItemCount() {
        if (taiSanList != null) return taiSanList.size();
        else return 0;
    }

    public class KhauHaoViewHolder extends RecyclerView.ViewHolder {
        TextView STT;
        TextView ten;
        TextView nhom;
        TextView loai;
        TextView nguoiSoHuu;
        TextView trangThai;
        ImageButton btnEdit, btnDelete;


        public KhauHaoViewHolder(@NonNull View itemView) {
            super(itemView);
            STT = itemView.findViewById(R.id.textview_column_12);
            ten = itemView.findViewById(R.id.textview_column_22);
            nhom = itemView.findViewById(R.id.textview_column_32);
            loai = itemView.findViewById(R.id.textview_column_42);
            nguoiSoHuu = itemView.findViewById(R.id.textview_column_52);
            trangThai = itemView.findViewById(R.id.textview_column_62);
            btnDelete = itemView.findViewById(R.id.btn_delete);
            btnEdit = itemView.findViewById(R.id.btn_edit);
        }
    }
}
