package com.example.mauthu.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mauthu.R;
import com.example.mauthu.Singleton;
import com.example.mauthu.TaiSan;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.List;

public class Fragment2Of1 extends Fragment {

    TextView tvR, tvPython, tvCPP;
    TextView tvR2, tvPython2, tvCPP2;
    TextView tvR3, tvPython3, tvCPP3;
    PieChart pieChart;
    PieChart pieChart2;
    PieChart pieChart3;
    List<TaiSan> list;
    float size;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2_of_1, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvR = view.findViewById(R.id.tvR);
        tvPython = view.findViewById(R.id.tvPython);
        tvCPP = view.findViewById(R.id.tvCPP);
        pieChart = view.findViewById(R.id.piechart21);

        tvR2 = view.findViewById(R.id.tvR2);
        tvPython2 = view.findViewById(R.id.tvPython2);
        tvCPP2 = view.findViewById(R.id.tvCPP2);
        pieChart2 = view.findViewById(R.id.piechart22);

        tvR3 = view.findViewById(R.id.tvR3);
        tvPython3 = view.findViewById(R.id.tvPython3);
        tvCPP3 = view.findViewById(R.id.tvCPP3);
        pieChart3 = view.findViewById(R.id.piechart23);
        list = Singleton.getInstance().taiSanList;
        size = list.size();
        setData();
        setData2();
        setData3();
    }

    private void setData() {
        float pcR = 0;
        float pcPython = 0;
        for (int i = 0; i < size; i++) {
            String nhom = list.get(i).getLoai();
            if (nhom.equals("Tài sản cố định")) pcR++;
            if (nhom.equals("Tài sản dài hạn")) pcPython++;
        }
        pcR = pcR*100/size;
        pcPython = pcPython*100/size;
        pcR = ((float) Math.round(pcR * 100))/100;
        pcPython = ((float) Math.round(pcPython * 100))/100;
        float pcJava = 100 - pcPython - pcR;
        pcJava = ((float) Math.round(pcJava * 100))/100;
        tvR.setText("Tài sản cố định: " + Float.toString(pcR) + "%");
        tvPython.setText("Tài sản dài hạn: " + Float.toString(pcPython)+ "%");
        tvCPP.setText("Tài sản cố định vô hình: " + Float.toString(pcJava)+ "%");
        pieChart.addPieSlice(
                new PieModel(
                        "R",
                        pcR,
                        Color.parseColor("#FFA726")));
        pieChart.addPieSlice(
                new PieModel(
                        "Python",
                        pcPython,
                        Color.parseColor("#66BB6A")));
        pieChart.addPieSlice(
                new PieModel(
                        "C++",
                        pcJava,
                        Color.parseColor("#EF5350")));
    }
    private void setData2() {
        float pcR = 0;
        float pcPython = 0;
        float total = 0;
        for (int i = 0; i < size; i++) {
            TaiSan taiSan = list.get(i);
            String nhom = taiSan.getLoai();
            total += taiSan.getGiaTien();
            if (nhom.equals("Tài sản cố định")) pcR += taiSan.getGiaTien();
            if (nhom.equals("Tài sản dài hạn")) pcPython += taiSan.getGiaTien();
        }
        pcR = pcR*100/total;
        pcPython = pcPython*100/total;
        pcR = ((float) Math.round(pcR * 100))/100;
        pcPython = ((float) Math.round(pcPython * 100))/100;
        float pcJava = 100 - pcPython - pcR;
        pcJava = ((float) Math.round(pcJava * 100))/100;
        tvR2.setText("Tài sản cố định: " + Float.toString(pcR) + "%");
        tvPython2.setText("Tài sản dài hạn: " + Float.toString(pcPython)+ "%");
        tvCPP2.setText("Tài sản cố định vô hình: " + Float.toString(pcJava)+ "%");
        pieChart2.addPieSlice(
                new PieModel(
                        "R",
                        pcR,
                        Color.parseColor("#FFA726")));
        pieChart2.addPieSlice(
                new PieModel(
                        "Python",
                        pcPython,
                        Color.parseColor("#66BB6A")));
        pieChart2.addPieSlice(
                new PieModel(
                        "C++",
                        pcJava,
                        Color.parseColor("#EF5350")));
    }
    private void setData3() {
        float pcR = 0;
        float pcPython = 0;
        float total = 0;
        for (int i = 0; i < size; i++) {
            TaiSan taiSan = list.get(i);
            String nhom = taiSan.getLoai();
            total += taiSan.getKhauHaoHangThang();
            if (nhom.equals("Tài sản cố định")) pcR += taiSan.getKhauHaoHangThang();
            if (nhom.equals("Tài sản dài hạn")) pcPython += taiSan.getKhauHaoHangThang();
        }
        pcR = pcR*100/total;
        pcPython = pcPython*100/total;
        pcR = ((float) Math.round(pcR * 100))/100;
        pcPython = ((float) Math.round(pcPython * 100))/100;
        float pcJava = 100 - pcPython - pcR;
        pcJava = ((float) Math.round(pcJava * 100))/100;
        tvR3.setText("Tài sản cố định: " + Float.toString(pcR) + "%");
        tvPython3.setText("Tài sản dài hạn: " + Float.toString(pcPython)+ "%");
        tvCPP3.setText("Tài sản cố định vô hình: " + Float.toString(pcJava)+ "%");
        pieChart3.addPieSlice(
                new PieModel(
                        "R",
                        pcR,
                        Color.parseColor("#FFA726")));
        pieChart3.addPieSlice(
                new PieModel(
                        "Python",
                        pcPython,
                        Color.parseColor("#66BB6A")));
        pieChart3.addPieSlice(
                new PieModel(
                        "C++",
                        pcJava,
                        Color.parseColor("#EF5350")));
    }
}
