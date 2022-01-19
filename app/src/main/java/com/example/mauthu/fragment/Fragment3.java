package com.example.mauthu.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mauthu.KhauHaoAdapter;
import com.example.mauthu.R;
import com.example.mauthu.Singleton;
import com.example.mauthu.SuaTaiSanActivity;
import com.example.mauthu.TaiSan;

public class Fragment3 extends Fragment {
    public Singleton singleton;
    RecyclerView recyclerView;
    KhauHaoAdapter adapter;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getContext();
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        singleton = Singleton.getInstance();
        recyclerView = view.findViewById(R.id.rcv_thong_tin2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new KhauHaoAdapter(singleton.taiSanList, new KhauHaoAdapter.IItemKHClick() {
            @Override
            public void onUpdateClick(TaiSan taiSan) {
                updateTaiSan(taiSan);
            }

            @Override
            public void onDeleteClick(TaiSan taiSan) {
                deleteTaiSan(taiSan);
            }
        });
        recyclerView.setAdapter(adapter);
        RecyclerView.ItemDecoration decoration = new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(decoration);

        view.findViewById(R.id.button_search).setOnClickListener(v -> {
            singleton.resetList();
            EditText editTextSearch = view.findViewById(R.id.edittext_search);
            String keyWord = editTextSearch.getText().toString();
            int size = singleton.taiSanList.size();
            for (int i = 0; i < size; i++) {
                TaiSan taiSan = singleton.taiSanList.get(i);
                if (!taiSan.getTen().contains(keyWord)) {
                    singleton.taiSanList.remove(taiSan);
                    i--;
                    size--;
                }
            }
            adapter.notifyDataSetChanged();
            editTextSearch.setText("");
            editTextSearch.clearFocus();
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 33) {
            adapter.notifyDataSetChanged();
            Toast toast = Toast.makeText(getContext(), "Cập nhật thông tin tài sản thành công", Toast.LENGTH_SHORT);
            toast.getView().setBackgroundResource(R.drawable.toast);
            toast.show();
        }
    }

    void updateTaiSan(TaiSan taiSan) {
        Intent intent = new Intent(getContext(), SuaTaiSanActivity.class);
        singleton.taiSan = taiSan;
        startActivityForResult(intent, 3);
    }

    void deleteTaiSan(TaiSan taiSan) {
        new AlertDialog.Builder(context).setTitle("Xóa tài sản")
                .setMessage("Bạn có chắc chắn muốn xóa tài sản này không?")
                .setPositiveButton("Xóa", (dialog, which) -> {
                    adapter.notifyItemRemoved(singleton.taiSanList.indexOf(taiSan));
                    singleton.taiSanList.remove(taiSan);
                    singleton.taiSanListRemove.add(taiSan);
                    Toast toast = Toast.makeText(getContext(), "Xóa tài sản thành công", Toast.LENGTH_SHORT);
                    toast.getView().setBackgroundResource(R.drawable.toast);
                    toast.show();
                })
                .setNegativeButton("Hủy", null).show();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onDetach() {
        singleton.resetList();
        super.onDetach();
    }
}
