package exam_2.repository;

import exam_2.model.TaiKhoanThanhToan;
import exam_2.model.TaiKhoanTietKiem;
import exam_2.util.FileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanRepositoryImpl implements TaiKhoanRepository {
    static final Scanner sc = new Scanner(System.in);
    private static List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
    private static List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();

    @Override
    public void add(String type) {
        if (type.equals("Tiet kiem")) {
            taiKhoanTietKiemList = FileUtil.readTietKiem();
            int id = taiKhoanTietKiemList.size() + 1;
            System.out.print("Nhap ma tai khoan: ");
            String code = sc.nextLine();
            System.out.print("Nhap ten tai khoan: ");
            String name = sc.nextLine();
            System.out.print("Nhap ngay tao tai khoan: ");
            String date = sc.nextLine();
            System.out.print("Nhap so tien gui tiet kiem: ");
            long soTienGuiTietKiem = Long.parseLong(sc.nextLine());
            System.out.print("Nhap ngay gui tiet kiem: ");
            String ngayGuiTietKiem = sc.nextLine();
            System.out.print("Nhap lai suat: ");
            double laiSuat = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap ky han: ");
            String kiHan = sc.nextLine();

            TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(id, code, name, date, soTienGuiTietKiem, ngayGuiTietKiem, laiSuat, kiHan);
            taiKhoanTietKiemList.add(taiKhoanTietKiem);
            FileUtil.writeTietKiem(taiKhoanTietKiemList);
        } else {
            taiKhoanThanhToanList = FileUtil.readThanhToan();
            int id = taiKhoanThanhToanList.size() + 1;
            System.out.print("Nhap ma tai khoan: ");
            String code = sc.nextLine();
            System.out.print("Nhap ten tai khoan: ");
            String name = sc.nextLine();
            System.out.print("Nhap ngay tao tai khoan: ");
            String date = sc.nextLine();
            System.out.print("Nhap so the: ");
            int soThe = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap so tien trong tai khoan: ");
            long soTienTrongTaiKhoan = Long.parseLong(sc.nextLine());

            TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(id, code, name, date, soThe, soTienTrongTaiKhoan);
            taiKhoanThanhToanList.add(taiKhoanThanhToan);
            FileUtil.writeThanhToan(taiKhoanThanhToanList);
        }
    }

    @Override
    public void delete(String type) {
        boolean isCheck = false;
        if (type.equals("Tiet kiem")) {
            taiKhoanTietKiemList = FileUtil.readTietKiem();
            System.out.print("Nhap ma can xoa: ");
            String code = sc.nextLine();
            for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                if (taiKhoanTietKiem.getCode().equals(code)) {
                    System.out.println("Ban co muon xoa ma: " + code + " nay khong?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.print("Nhap so: ");
                    int select = Integer.parseInt(sc.nextLine());
                    switch (select) {
                        case 1:
                            taiKhoanTietKiemList.remove(taiKhoanTietKiem);
                            FileUtil.writeTietKiem(taiKhoanTietKiemList);
                            System.out.println("Ban da xoa thanh cong!");
                            break;
                        case 2:
                            System.out.println("Ban da khong xoa!");
                            break;
                    }
                    isCheck = true;
                    break;
                }
            }
            if (isCheck) {
                display(type);
            } else {
                System.out.println("Khong ton tai ma " + code + " nay trong tai khoan!");
            }
        } else {
            taiKhoanThanhToanList = FileUtil.readThanhToan();
            System.out.print("Nhap ma can xoa: ");
            String code = sc.nextLine();
            for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
                if (taiKhoanThanhToan.getCode().equals(code)) {
                    System.out.println("Ban co muon xoa ma: " + code + " nay khong?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.print("Nhap so: ");
                    int select = Integer.parseInt(sc.nextLine());
                    switch (select) {
                        case 1:
                            taiKhoanThanhToanList.remove(taiKhoanThanhToan);
                            FileUtil.writeThanhToan(taiKhoanThanhToanList);
                            System.out.println("Ban da xoa thanh cong!");
                            break;
                        case 2:
                            System.out.println("Ban da khong xoa!");
                            break;
                    }
                    isCheck = true;
                    break;
                }
            }
            if (isCheck) {
                display(type);
            } else {
                System.out.println("Khong ton tai ma " + code + " nay trong tai khoan!");
            }
        }
    }

    @Override
    public void display(String type) {
        if (type.equals("Tiet kiem")) {
            taiKhoanTietKiemList = FileUtil.readTietKiem();
            for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                System.out.println(taiKhoanTietKiem);
            }
        } else {
            taiKhoanThanhToanList = FileUtil.readThanhToan();
            for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
                System.out.println(taiKhoanThanhToan);
            }
        }
    }

    @Override
    public void search(String search, String type) {
        boolean isCheck = false;
        if (search.equals("code")) {
            if (type.equals("Tiet kiem")) {
                taiKhoanTietKiemList = FileUtil.readTietKiem();
                System.out.print("Nhap ma can tim: ");
                String code = sc.nextLine();
                for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                    if (taiKhoanTietKiem.getCode().equals(code)) {
                        System.out.println(taiKhoanTietKiem);
                        isCheck = true;
                    }
                }
                if (!isCheck) {
                    System.out.println("Khong tim thay ma " + code + " nay");
                }
            } else {
                taiKhoanThanhToanList = FileUtil.readThanhToan();
                System.out.print("Nhap ma can tim: ");
                String code = sc.nextLine();
                for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
                    if (taiKhoanThanhToan.getCode().equals(code)) {
                        System.out.println(taiKhoanThanhToan);
                        isCheck = true;
                    }
                }
                if (!isCheck) {
                    System.out.println("Khong tim thay ma " + code + " nay");
                }
            }
        } else {
            if (type.equals("Tiet kiem")) {
                taiKhoanTietKiemList = FileUtil.readTietKiem();
                System.out.print("Nhap ten tai khoan: ");
                String name = sc.nextLine();
                for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                    if (taiKhoanTietKiem.getName().equals(name)) {
                        System.out.println(taiKhoanTietKiem);
                        isCheck = true;
                    }
                }
                if (!isCheck) {
                    System.out.println("Khong tim thay ten tai khoan " + name + " nay");
                }
            } else {
                taiKhoanThanhToanList = FileUtil.readThanhToan();
                System.out.print("Nhap ten tai khoan: ");
                String name = sc.nextLine();
                for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
                    if (taiKhoanThanhToan.getName().equals(name)) {
                        System.out.println(taiKhoanThanhToan);
                        isCheck = true;
                    }
                }
                if (!isCheck) {
                    System.out.println("Khong tim thay ten tai khoan " + name + " nay");
                }
            }
        }
    }
}
