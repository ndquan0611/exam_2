package exam_2.util;

import exam_2.model.TaiKhoanThanhToan;
import exam_2.model.TaiKhoanTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static final String FILE_TIETKIEM = "E:\\Workspace\\exam\\src\\exam_2\\data\\taikhoantietkiem.csv";
    public static final String FILE_THANHTOAN = "E:\\Workspace\\exam\\src\\exam_2\\data\\taikhoanthanhtoan.csv";

    public static void writeTietKiem(List<TaiKhoanTietKiem> taiKhoanTietKiemList) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_TIETKIEM);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                buff.write(taiKhoanTietKiem.getInfo() + "\n");
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<TaiKhoanTietKiem> readTietKiem() {
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_TIETKIEM);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            String[] temp;
            TaiKhoanTietKiem taiKhoanTietKiem;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                String date = temp[3];
                long soTienGuiTietKiem = Long.parseLong(temp[4]);
                String ngayGuiTietKiem = temp[5];
                double laiSuat = Double.parseDouble(temp[6]);
                String kiHan = temp[temp.length - 1];
                taiKhoanTietKiem = new TaiKhoanTietKiem(id, code, name, date, soTienGuiTietKiem, ngayGuiTietKiem, laiSuat, kiHan);
                taiKhoanTietKiemList.add(taiKhoanTietKiem);
            }
            return taiKhoanTietKiemList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeThanhToan(List<TaiKhoanThanhToan> taiKhoanThanhToanList) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_THANHTOAN);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
                buff.write(taiKhoanThanhToan.getInfo() + "\n");
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<TaiKhoanThanhToan> readThanhToan() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_THANHTOAN);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            String[] temp;
            TaiKhoanThanhToan taiKhoanThanhToan;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                String date = temp[3];
                int soThe = Integer.parseInt(temp[4]);
                long soTienTrongTaiKhoan = Long.parseLong(temp[temp.length - 1]);
                taiKhoanThanhToan = new TaiKhoanThanhToan(id, code, name, date, soThe, soTienTrongTaiKhoan);
                taiKhoanThanhToanList.add(taiKhoanThanhToan);
            }
            return taiKhoanThanhToanList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
