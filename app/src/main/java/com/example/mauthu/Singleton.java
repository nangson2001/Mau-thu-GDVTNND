package com.example.mauthu;

import java.util.ArrayList;
import java.util.List;

public class Singleton  {



    private static Singleton INSTANCE = null;

    public List<TaiSan> taiSanList = new ArrayList<>();
    public void addData() {
        taiSanList.add(new TaiSan(1, "Mercedes Car 1", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 4000, 500));
        taiSanList.add(new TaiSan(2, "Mercedes Car 2", "Xe cộ", "Tài sản dài hạn", "Bob", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(3, "Mercedes Car 3", "Xe cộ", "Tài sản dài hạn", "Catherine", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(4, "Mercedes Car 4", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(5, "Mercedes Car 5", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 4000, 500));
        taiSanList.add(new TaiSan(6, "Mercedes Car 6", "Xe cộ", "Tài sản dài hạn", "Bob", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(7, "Mercedes Car 7", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(8, "Mercedes Car 8", "Xe cộ", "Tài sản dài hạn", "Bob", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(9, "Mercedes Car 9", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 4000, 500));
        taiSanList.add(new TaiSan(10, "Mercedes Car 10", "Xe cộ", "Tài sản dài hạn", "Catherine", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(11, "Mercedes Car 11", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(12, "Mercedes Car 12", "Xe cộ", "Tài sản dài hạn", "Bob", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(13, "Mercedes Car 13", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(14, "Mercedes Car 14", "Xe cộ", "Tài sản dài hạn", "Catherine", "Đang sử dụng", 4000, 500));
        taiSanList.add(new TaiSan(15, "Mercedes Car 15", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(16, "Mercedes Car 16", "Xe cộ", "Tài sản dài hạn", "Catherine", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(17, "Mercedes Car 17", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 4000, 500));
        taiSanList.add(new TaiSan(18, "Mercedes Car 18", "Xe cộ", "Tài sản dài hạn", "Catherine", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(19, "Mercedes Car 19", "Xe cộ", "Tài sản dài hạn", "Alice", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(20, "Mercedes Car 20", "Xe cộ", "Tài sản dài hạn", "Bob", "Đang sử dụng", 6000, 500));
        taiSanList.add(new TaiSan(21, "Laptop ASUS 1", "Máy móc", "Tài sản cố định", "Tamarine", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(22, "Laptop ASUS 2", "Máy móc", "Tài sản cố định", "Zerato", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(23, "Laptop ASUS 3", "Máy móc", "Tài sản cố định", "Vildred", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(24, "Laptop ASUS 4", "Máy móc", "Tài sản cố định", "Zerato", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(25, "Laptop ASUS 5", "Máy móc", "Tài sản cố định", "Tamarine", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(26, "Laptop ASUS 6", "Máy móc", "Tài sản cố định", "Vildred", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(27, "Laptop ASUS 7", "Máy móc", "Tài sản cố định", "Tamarine", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(28, "Laptop ASUS 8", "Máy móc", "Tài sản cố định", "Zerato", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(29, "Laptop ASUS 9", "Máy móc", "Tài sản cố định", "Tamarine", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(30, "Laptop ASUS 10", "Máy móc", "Tài sản cố định", "Vildred", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(31, "Laptop ASUS 11", "Máy móc", "Tài sản cố định", "Tamarine", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(32, "Laptop ASUS 12", "Máy móc", "Tài sản cố định", "Zerato", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(33, "Laptop ASUS 13", "Máy móc", "Tài sản cố định", "Tamarine", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(34, "Laptop ASUS 14", "Máy móc", "Tài sản cố định", "Vildred", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(35, "Laptop ASUS 15", "Máy móc", "Tài sản cố định", "Tamarine", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(36, "Laptop ASUS 16", "Máy móc", "Tài sản cố định", "Zerato", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(37, "Laptop ASUS 17", "Máy móc", "Tài sản cố định", "Vildred", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(38, "Laptop ASUS 18", "Máy móc", "Tài sản cố định", "Zerato", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(39, "Laptop ASUS 19", "Máy móc", "Tài sản cố định", "Tamarine", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(40, "Laptop ASUS 20", "Máy móc", "Tài sản cố định", "Zerato", "Sẵn sàng sử dụng", 2000, 100));
        taiSanList.add(new TaiSan(41, "Lô đất ven hồ 1", "Mặt bằng", "Tài sản cố định vô hình", "Dominiel", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(42, "Lô đất ven hồ 2", "Mặt bằng", "Tài sản cố định vô hình", "Seraphine", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(43, "Lô đất ven hồ 3", "Mặt bằng", "Tài sản cố định vô hình", "Luxana", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(44, "Lô đất ven hồ 4", "Mặt bằng", "Tài sản cố định vô hình", "Seraphine", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(45, "Lô đất ven hồ 5", "Mặt bằng", "Tài sản cố định vô hình", "Luxana", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(46, "Lô đất ven hồ 6", "Mặt bằng", "Tài sản cố định vô hình", "Dominiel", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(47, "Lô đất ven hồ 7", "Mặt bằng", "Tài sản cố định vô hình", "Luxana", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(48, "Lô đất ven hồ 8", "Mặt bằng", "Tài sản cố định vô hình", "Dominiel", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(49, "Lô đất ven hồ 9", "Mặt bằng", "Tài sản cố định vô hình", "Luxana", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(50, "Lô đất ven hồ 10", "Mặt bằng", "Tài sản cố định vô hình", "Seraphine", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(51, "Lô đất ven hồ 11", "Mặt bằng", "Tài sản cố định vô hình", "Luxana", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(52, "Lô đất ven hồ 12", "Mặt bằng", "Tài sản cố định vô hình", "Dominiel", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(53, "Lô đất ven hồ 13", "Mặt bằng", "Tài sản cố định vô hình", "Dominiel", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(54, "Lô đất ven hồ 14", "Mặt bằng", "Tài sản cố định vô hình", "Seraphine", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(55, "Lô đất ven hồ 15", "Mặt bằng", "Tài sản cố định vô hình", "Dominiel", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(56, "Lô đất ven hồ 16", "Mặt bằng", "Tài sản cố định vô hình", "Luxana", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(57, "Lô đất ven hồ 17", "Mặt bằng", "Tài sản cố định vô hình", "Dominiel", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(58, "Lô đất ven hồ 18", "Mặt bằng", "Tài sản cố định vô hình", "Seraphine", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(59, "Lô đất ven hồ 19", "Mặt bằng", "Tài sản cố định vô hình", "Luxana", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(60, "Lô đất ven hồ 20", "Mặt bằng", "Tài sản cố định vô hình", "Seraphine", "Hỏng hóc", 10000, 400));
        taiSanList.add(new TaiSan(61, "Đồng phục 1", "Khác", "Tài sản cố định vô hình", "Ken", "Mất", 500, 20));
        taiSanList.add(new TaiSan(62, "Đồng phục 2", "Khác", "Tài sản cố định vô hình", "Kaido", "Mất", 500, 20));
        taiSanList.add(new TaiSan(63, "Đồng phục 3", "Khác", "Tài sản cố định vô hình", "Roger", "Mất", 500, 20));
        taiSanList.add(new TaiSan(64, "Đồng phục 4", "Khác", "Tài sản cố định vô hình", "Ken", "Mất", 500, 20));
        taiSanList.add(new TaiSan(65, "Đồng phục 5", "Khác", "Tài sản cố định vô hình", "Kaido", "Mất", 500, 20));
        taiSanList.add(new TaiSan(66, "Đồng phục 6", "Khác", "Tài sản cố định vô hình", "Ken", "Mất", 500, 20));
        taiSanList.add(new TaiSan(67, "Đồng phục 7", "Khác", "Tài sản cố định vô hình", "Kaido", "Mất", 500, 20));
        taiSanList.add(new TaiSan(68, "Đồng phục 8", "Khác", "Tài sản cố định vô hình", "Ken", "Mất", 500, 20));
        taiSanList.add(new TaiSan(69, "Đồng phục 9", "Khác", "Tài sản cố định vô hình", "Kaido", "Mất", 500, 20));
        taiSanList.add(new TaiSan(70, "Đồng phục 10", "Khác", "Tài sản cố định vô hình", "Roger", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(71, "Đồng phục 11", "Khác", "Tài sản cố định vô hình", "Roger", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(72, "Đồng phục 12", "Khác", "Tài sản cố định vô hình", "Ken", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(73, "Đồng phục 13", "Khác", "Tài sản cố định vô hình", "Kaido", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(74, "Đồng phục 14", "Khác", "Tài sản cố định vô hình", "Ken", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(75, "Đồng phục 15", "Khác", "Tài sản cố định vô hình", "Kaido", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(76, "Đồng phục 16", "Khác", "Tài sản cố định vô hình", "Roger", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(77, "Đồng phục 17", "Khác", "Tài sản cố định vô hình", "Ken", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(78, "Đồng phục 18", "Khác", "Tài sản cố định vô hình", "Kaido", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(79, "Đồng phục 19", "Khác", "Tài sản cố định vô hình", "Roger", "Thanh lý", 500, 20));
        taiSanList.add(new TaiSan(80, "Đồng phục 20", "Khác", "Tài sản cố định vô hình", "Ken", "Thanh lý", 500, 20));
    }
    public TaiSan taiSan;

    private Singleton() {};

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return(INSTANCE);
    }

    public int autoGenerateSTT() {
        return taiSanList.get(taiSanList.size() - 1).getSTT() + 1;
    }
}

