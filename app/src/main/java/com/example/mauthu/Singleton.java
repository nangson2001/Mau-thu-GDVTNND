package com.example.mauthu;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Singleton  {

    public TaiSan taiSan;

    private static Singleton INSTANCE = null;

    public List<TaiSan> taiSanList = new ArrayList<>();
    public List<TaiSan> taiSanListAdd = new ArrayList<>();
    public List<TaiSan> taiSanListRemove = new ArrayList<>();

    public void addData() {
        taiSanList.add(new TaiSan(1, "Xe Mercedes Benz C class C200 2015", "Xe cộ", "Tài sản dài hạn", "Nguyễn Văn Lâm", "Đang sử dụng", 4262, 531));
        taiSanList.add(new TaiSan(2, "Xe Mercedes Benz GLS 400 4Matic 2018", "Xe cộ", "Tài sản dài hạn", "Nguyễn Trí Tùng", "Đang sử dụng", 6436, 522));
        taiSanList.add(new TaiSan(3, "Xe BMW 7 Series 730Li 2015", "Xe cộ", "Tài sản dài hạn", "Lê Thị Nguyệt", "Mất", 6854, 547));
        taiSanList.add(new TaiSan(4, "Xe BMW 3 Series 320i 2016", "Xe cộ", "Tài sản dài hạn", "Trấn Quang Ánh", "Đang sử dụng", 6842, 589));
        taiSanList.add(new TaiSan(5, "Xe Toyota Fortuner 2.7V 4x2 AT 2017 ", "Xe cộ", "Tài sản dài hạn", "Nguyễn Nhật Quang", "Đang sử dụng", 4789, 522));
        taiSanList.add(new TaiSan(6, "Xe Kia Rio 1.4 AT 2015", "Xe cộ", "Tài sản dài hạn", "Nguyên Thanh Nhàn", "Đang sử dụng", 6224, 346));
        taiSanList.add(new TaiSan(7, "Xe BMW 3 Series 320i 2009", "Xe cộ", "Tài sản dài hạn", "Trần Đức Trung", "Đang sử dụng", 6134, 457));
        taiSanList.add(new TaiSan(8, "Xe Toyota Fortuner 2.4G 4x2 AT 2019", "Xe cộ", "Tài sản dài hạn", "Trần Trí Toàn", "Mất", 6579, 421));
        taiSanList.add(new TaiSan(9, "Xe LandRover Range Rover SVAutobiography LWB 3.0 I6 2021", "Xe cộ", "Tài sản dài hạn", "Lê Quang Liêm", "Đang sử dụng", 4679, 438));
        taiSanList.add(new TaiSan(10, "Xe Nissan Teana 2.0 AT 2010", "Xe cộ", "Tài sản dài hạn", "Nguyễn Hoài Anh", "Đang sử dụng", 6384, 443));
        taiSanList.add(new TaiSan(11, "Xe Cadillac Escalade Platinum Luxury ESV 2021", "Xe cộ", "Tài sản dài hạn", "Nguyễn Nhật Ánh", "Đang sử dụng", 6293, 568));
        taiSanList.add(new TaiSan(12, "Xe Toyota Fortuner 2.4G 4x2 MT 2017", "Xe cộ", "Tài sản dài hạn", "Nguyễn Hoàng Anh", "Hỏng hóc", 6852, 587));
        taiSanList.add(new TaiSan(13, "Xe Toyota Fortuner 2.4G 4x2 MT 2017 ", "Xe cộ", "Tài sản dài hạn", "Trần Văn Công", "Đang sử dụng", 6358, 532));
        taiSanList.add(new TaiSan(14, "Xe Toyota Fortuner 2.4G 4x2 AT 2019", "Xe cộ", "Tài sản dài hạn", "Lê Văn Toản", "Hỏng hóc", 4689, 576));
        taiSanList.add(new TaiSan(15, "Xe BMW 5 Series 520i 2016", "Xe cộ", "Tài sản dài hạn", "Nguyễn Trí Tuân", "Đang sử dụng", 6962, 347));
        taiSanList.add(new TaiSan(16, "Xe Mercedes Benz GLC 200 4Matic 2020", "Xe cộ", "Tài sản dài hạn", "Nguyễn Văn Lâm", "Đang sử dụng", 6328, 487));
        taiSanList.add(new TaiSan(17, "Xe Lexus RX 300 2018", "Xe cộ", "Tài sản dài hạn", "Trần Nhật Quý", "Đang sử dụng", 4680, 346));
        taiSanList.add(new TaiSan(18, "Xe Toyota Hilux 2.8G 4x4 AT 2019", "Xe cộ", "Tài sản dài hạn", "Nguyễn Quang Hải", "Thanh lý", 6248, 568));
        taiSanList.add(new TaiSan(19, "Xe Hyundai Grand Starex Đông Lạnh 2016", "Xe cộ", "Tài sản dài hạn", "Lê Văn Toàn", "Đang sử dụng", 6357, 457));
        taiSanList.add(new TaiSan(20, "Xe Hyundai Grand Starex 2.5 MT 2016", "Xe cộ", "Tài sản dài hạn", "Hoàng Thị Diệu Linh", "Đang sử dụng", 6342, 568));
        taiSanList.add(new TaiSan(21, "Laptop ASUS", "Máy móc", "Tài sản cố định", "Nguyễn Văn Lâm", "Sẵn sàng sử dụng", 2342, 97));
        taiSanList.add(new TaiSan(22, "Laptop DELL", "Máy móc", "Tài sản cố định", "Nguyễn Trí Tùng", "Hỏng hóc", 2143, 87));
        taiSanList.add(new TaiSan(23, "Laptop Lenovo", "Máy móc", "Tài sản cố định", "Lê Thị Nguyệt", "Sẵn sàng sử dụng", 2086, 79));
        taiSanList.add(new TaiSan(24, "Laptop Acer", "Máy móc", "Tài sản cố định", "Trấn Quang Ánh", "Sẵn sàng sử dụng", 1986, 90));
        taiSanList.add(new TaiSan(25, "Laptop HP", "Máy móc", "Tài sản cố định", "Nguyễn Nhật Quang", "Sẵn sàng sử dụng", 1756, 87));
        taiSanList.add(new TaiSan(26, "Laptop Microsoft", "Máy móc", "Tài sản cố định", "Nguyên Thanh Nhàn", "Thanh lý", 1579, 67));
        taiSanList.add(new TaiSan(27, "Laptop Macbook", "Máy móc", "Tài sản cố định", "Trần Đức Trung", "Sẵn sàng sử dụng", 1567, 87));
        taiSanList.add(new TaiSan(28, "Asus VivoBook A415EA i5 1135G7", "Máy móc", "Tài sản cố định", "Trần Trí Toàn", "Sẵn sàng sử dụng", 1987, 56));
        taiSanList.add(new TaiSan(29, "Asus VivoBook A515EA OLED i5 1135G7", "Máy móc", "Tài sản cố định", "Nguyễn Hoài Anh", "Sẵn sàng sử dụng", 1876, 66));
        taiSanList.add(new TaiSan(30, "Asus ZenBook UX371EA i7 1165G7", "Máy móc", "Tài sản cố định", "Nguyễn Nhật Ánh", "Thanh lý", 1567, 112));
        taiSanList.add(new TaiSan(31, "Asus ZenBook UX363EA i7 1165G7", "Máy móc", "Tài sản cố định", "Lê Quang Liêm", "Sẵn sàng sử dụng", 2143, 97));
        taiSanList.add(new TaiSan(32, "Asus ZenBook Duo UX482EA i5 1135G7", "Máy móc", "Tài sản cố định", "Trần Hải Nam", "Sẵn sàng sử dụng", 2442, 90));
        taiSanList.add(new TaiSan(33, "Asus ZenBook Duo UX482EA i5 1135G7", "Máy móc", "Tài sản cố định", "Nguyễn Hoàng Anh", "Sẵn sàng sử dụng", 2543, 94));
        taiSanList.add(new TaiSan(34, "Asus TUF Gaming FX516PE i7 11370H", "Máy móc", "Tài sản cố định", "Trần Văn Công", "Sẵn sàng sử dụng", 2312, 92));
        taiSanList.add(new TaiSan(35, "Asus ROG Strix Gaming G513IH R7 4800H", "Máy móc", "Tài sản cố định", "Lê Văn Toản", "Sẵn sàng sử dụng", 2122, 106));
        taiSanList.add(new TaiSan(36, "Asus ZenBook UX325EA i5 1135G7", "Máy móc", "Tài sản cố định", "Nguyễn Trí Tuân", "Sẵn sàng sử dụng", 1233, 101));
        taiSanList.add(new TaiSan(37, "Asus ZenBook Flip UX363EA i5 1135G7", "Máy móc", "Tài sản cố định", "Trần Nhật Quý", "Sẵn sàng sử dụng", 1547, 54));
        taiSanList.add(new TaiSan(38, "Asus VivoBook Pro 14 OLED M3401QA R7 5800H", "Máy móc", "Tài sản cố định", "Nguyễn Quang Hải", "Sẵn sàng sử dụng", 1754, 69));
        taiSanList.add(new TaiSan(39, "Asus ZenBook UX425E i5 1135G7", "Máy móc", "Tài sản cố định", "Lê Văn Toàn", "Sẵn sàng sử dụng", 1678, 79));
        taiSanList.add(new TaiSan(40, "Asus ZenBook Flip UX363EA i5 1135G7", "Máy móc", "Tài sản cố định", "Hoàng Thị Diệu Linh", "Sẵn sàng sử dụng", 1756, 87));
        taiSanList.add(new TaiSan(41, "Lô đất Center C1", "Mặt bằng", "Tài sản cố định vô hình", "Lê Thị Nguyệt", "Hỏng hóc", 12421, 458));
        taiSanList.add(new TaiSan(42, "Lô đất Center C2", "Mặt bằng", "Tài sản cố định vô hình", "Trấn Quang Ánh", "Hỏng hóc", 52145, 653));
        taiSanList.add(new TaiSan(43, "Lô đất Center C3", "Mặt bằng", "Tài sản cố định vô hình", "Nguyễn Nhật Quang", "Hỏng hóc", 52214, 876));
        taiSanList.add(new TaiSan(44, "Lô đất Service S1", "Mặt bằng", "Tài sản cố định vô hình", "Nguyên Thanh Nhàn", "Hỏng hóc", 53211, 643));
        taiSanList.add(new TaiSan(45, "Lô đất Service S2", "Mặt bằng", "Tài sản cố định vô hình", "Trần Đức Trung", "Hỏng hóc", 43113, 1126));
        taiSanList.add(new TaiSan(46, "Lô đất Service S3", "Mặt bằng", "Tài sản cố định vô hình", "Nguyễn Hoài Anh", "Hỏng hóc", 14678, 468));
        taiSanList.add(new TaiSan(47, "Lô đất Service S4", "Mặt bằng", "Tài sản cố định vô hình", "Nguyễn Hoàng Anh", "Hỏng hóc", 44221, 897));
        taiSanList.add(new TaiSan(48, "Lô đất Working W1", "Mặt bằng", "Tài sản cố định vô hình", "Trần Hải Nam", "Hỏng hóc", 13568, 970));
        taiSanList.add(new TaiSan(49, "Lô đất Working W2", "Mặt bằng", "Tài sản cố định vô hình", "Lê Văn Toản", "Hỏng hóc", 6245, 953));
        taiSanList.add(new TaiSan(50, "Lô đất Working W3", "Mặt bằng", "Tài sản cố định vô hình", "Trần Nhật Quý", "Hỏng hóc", 5467, 422));
        taiSanList.add(new TaiSan(51, "Lô đất Working W4", "Mặt bằng", "Tài sản cố định vô hình", "Nguyễn Quang Hải", "Hỏng hóc", 15674, 568));
        taiSanList.add(new TaiSan(52, "Lô đất Working W5", "Mặt bằng", "Tài sản cố định vô hình", "Lê Thị Nguyệt", "Hỏng hóc", 19844, 527));
        taiSanList.add(new TaiSan(53, "Đồng phục nam", "Khác", "Tài sản cố định vô hình", "Nguyễn Nhật Quang", "Mất", 211, 12));
        taiSanList.add(new TaiSan(54, "Đồng phục nữ", "Khác", "Tài sản cố định vô hình", "Nguyễn Quang Hải", "Mất", 432, 21));
        taiSanList.add(new TaiSan(55, "Điều hòa", "Khác", "Tài sản cố định vô hình", "Nguyễn Hoàng Anh", "Mất", 332, 32));
        taiSanList.add(new TaiSan(56, "Bàn ghế", "Khác", "Tài sản cố định vô hình", "Nguyên Thanh Nhàn", "Mất", 12, 1));
        taiSanList.add(new TaiSan(57, "Máy in", "Khác", "Tài sản cố định vô hình", "Nguyễn Hoàng Anh", "Mất", 644, 34));
        taiSanList.add(new TaiSan(58, "Cây cảnh", "Khác", "Tài sản cố định vô hình", "Trần Hải Nam", "Mất", 866, 42));
        taiSanList.add(new TaiSan(59, "Quạt cây", "Khác", "Tài sản cố định vô hình", "Lê Thị Nguyệt", "Mất", 557, 48));
        taiSanList.add(new TaiSan(60, "Quạt trần", "Khác", "Tài sản cố định vô hình", "Nguyễn Nhật Quang", "Mất", 644, 59));
        taiSanList.add(new TaiSan(61, "Rèm cửa", "Khác", "Tài sản cố định vô hình", "Trấn Quang Ánh", "Mất", 235, 46));
        taiSanList.add(new TaiSan(62, "Cây thông Noel", "Khác", "Tài sản cố định vô hình", "Nguyễn Quang Hải", "Thanh lý", 532, 55));
        taiSanList.add(new TaiSan(63, "Cửa sắt", "Khác", "Tài sản cố định vô hình", "Nguyên Thanh Nhàn", "Thanh lý", 231, 42));
        taiSanList.add(new TaiSan(64, "Rào chống trộm", "Khác", "Tài sản cố định vô hình", "Trần Đức Trung", "Thanh lý", 124, 13));
    }

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return(INSTANCE);
    }

    public int autoGenerateSTT() {
        return taiSanList.get(taiSanList.size() - 1).getSTT() + 1;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void resetList() {
        taiSanList.clear();
        addData();
        taiSanList.removeAll(taiSanListRemove);
        taiSanList.addAll(taiSanListAdd);
        taiSanList.sort(Comparator.comparing(TaiSan::getSTT));
    }
}

