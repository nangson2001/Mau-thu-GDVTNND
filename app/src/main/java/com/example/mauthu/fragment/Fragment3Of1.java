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

public class Fragment3Of1 extends Fragment {
    TextView tv11, tv12, tv13, tv14, tv15;
    TextView tv21, tv22, tv23, tv24, tv25;
    PieChart pieChart;
    PieChart pieChart2;
    List<TaiSan> list;
    float size;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3_of_1, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv11 = view.findViewById(R.id.tv11);
        tv12 = view.findViewById(R.id.tv12);
        tv13 = view.findViewById(R.id.tv13);
        tv14 = view.findViewById(R.id.tv14);
        tv15 = view.findViewById(R.id.tv15);
        pieChart = view.findViewById(R.id.piechart31);

        tv21 = view.findViewById(R.id.tv21);
        tv22 = view.findViewById(R.id.tv22);
        tv23 = view.findViewById(R.id.tv23);
        tv24 = view.findViewById(R.id.tv24);
        tv25 = view.findViewById(R.id.tv25);
        pieChart2 = view.findViewById(R.id.piechart32);

        list = Singleton.getInstance().taiSanList;
        size = list.size();
        setData();
        setData2();
    }

    private void setData() {
        float pcR = 0;
        float pcPython = 0;
        float pcCPP = 0;
        float pc4 = 0;
        for (int i = 0; i < size; i++) {
            String nhom = list.get(i).getTrangThai();
            if (nhom.equals("Sẵn sàng sử dụng")) pcR++;
            if (nhom.equals("Đang sử dụng")) pcPython++;
            if (nhom.equals("Hỏng hóc")) pcCPP++;
            if (nhom.equals("Mất")) pc4++;
        }
        pcR = pcR*100/size;
        pcPython = pcPython*100/size;
        pcCPP = pcCPP*100/size;
        pc4 = pc4*100/size;
        pcR = ((float) Math.round(pcR * 100))/100;
        pcPython = ((float) Math.round(pcPython * 100))/100;
        pcCPP = ((float) Math.round(pcCPP * 100))/100;
        pc4 = ((float) Math.round(pc4 * 100))/100;
        float pcJava = 100 - pcCPP - pcPython - pcR - pc4;
        pcJava = ((float) Math.round(pcJava * 100))/100;
        tv11.setText("Sẵn sàng sử dụng: " + Float.toString(pcR) + "%");
        tv12.setText("Đang sử dụng: " + Float.toString(pcPython)+ "%");
        tv13.setText("Hỏng hóc: " + Float.toString(pcCPP)+ "%");
        tv14.setText("Mất: " + Float.toString(pc4)+ "%");
        tv15.setText("Thanh lý: " + Float.toString(pcJava)+ "%");
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
                        pcCPP,
                        Color.parseColor("#EF5350")));
        pieChart.addPieSlice(
                new PieModel(
                        "C++",
                        pc4,
                        Color.parseColor("#4C8EDD")));
        pieChart.addPieSlice(
                new PieModel(
                        "Java",
                        pcJava,
                        Color.parseColor("#D710ED")));
        pieChart.startAnimation();
    }

    private void setData2() {
        float pcR = 0;
        float pcPython = 0;
        float pcCPP = 0;
        float pc4 = 0;
        for (int i = 0; i < size; i++) {
            TaiSan taiSan = list.get(i);
            float giaTien = taiSan.getGiaTien();
            if (giaTien <= 1000) {pcR++; continue;}
            if (giaTien <= 3000) {pcPython++; continue;}
            if (giaTien <= 5000) {pcCPP++; continue;}
            if (giaTien <= 7000) {pc4++; continue;}
        }
        pcR = pcR*100/size;
        pcPython = pcPython*100/size;
        pcCPP = pcCPP*100/size;
        pc4 = pc4*100/size;
        pcR = ((float) Math.round(pcR * 100))/100;
        pcPython = ((float) Math.round(pcPython * 100))/100;
        pcCPP = ((float) Math.round(pcCPP * 100))/100;
        pc4 = ((float) Math.round(pc4 * 100))/100;
        float pcJava = 100 - pcCPP - pcPython - pcR - pc4;
        pcJava = ((float) Math.round(pcJava * 100))/100;
        tv21.setText("Giá trị <= 1000$: " + Float.toString(pcR) + "%");
        tv22.setText("Giá trị <= 3000$: " + Float.toString(pcPython)+ "%");
        tv23.setText("Giá trị <= 5000$: " + Float.toString(pcCPP)+ "%");
        tv24.setText("Giá trị <= 7000$: " + Float.toString(pc4)+ "%");
        tv25.setText("Giá trị > 7000$: " + Float.toString(pcJava)+ "%");
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
                        pcCPP,
                        Color.parseColor("#EF5350")));
        pieChart2.addPieSlice(
                new PieModel(
                        "C++",
                        pc4,
                        Color.parseColor("#4C8EDD")));
        pieChart2.addPieSlice(
                new PieModel(
                        "Java",
                        pcJava,
                        Color.parseColor("#D710ED")));
        pieChart2.startAnimation();
    }
}
