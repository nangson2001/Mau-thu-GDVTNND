package com.example.mauthu.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mauthu.R;
import com.example.mauthu.Singleton;
import com.example.mauthu.TaiSanAdapter;
import com.example.mauthu.ThemTaiSanActivity;

public class Fragment2 extends Fragment {
    public Singleton singleton;
    RecyclerView recyclerView;
    TaiSanAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        return view;
    }


    public static Fragment2 newInstance() {
        Fragment2 fragment2 = new Fragment2();
        
        Bundle args = new Bundle();
//        args.putParcelableArrayList("list", (ArrayList<? extends Parcelable>) fragment2.taiSanList);
        fragment2.setArguments(args);
        return fragment2;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        singleton = Singleton.getInstance();
        view.findViewById(R.id.button_them_tai_san).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ThemTaiSanActivity.class);
                startActivityForResult(intent, 2);
            }
        });
        recyclerView = view.findViewById(R.id.rcv_thong_tin);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new TaiSanAdapter(singleton.taiSanList);
        recyclerView.setAdapter(adapter);
        RecyclerView.ItemDecoration decoration = new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(decoration);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        adapter.notifyDataSetChanged();
        Toast toast = Toast.makeText(getContext(), "Thêm tài sản thành công", Toast.LENGTH_SHORT);
        toast.getView().setBackgroundResource(R.drawable.toast);
        toast.show();
    }
}
