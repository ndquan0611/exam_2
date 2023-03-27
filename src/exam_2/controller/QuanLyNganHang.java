package exam_2.controller;

import exam_2.service.TaiKhoanService;
import exam_2.service.TaiKhoanServiceImpl;

import java.util.Scanner;

public class QuanLyNganHang {
    static final Scanner sc = new Scanner(System.in);

    private static TaiKhoanService service = new TaiKhoanServiceImpl();

    public static void displayMainMethod(int select) {
        do {
            System.out.println("-Chuong Trinh Quan Ly Tai Khoan Ngan Hang-");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach cac tai khoan ngan hang");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            System.out.print("Nhap so: ");
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Loi dinh dang!");
                continue;
            }
            switch (select) {
                case 1:
                    them(select);
                    break;
                case 2:
                    xoa(select);
                    break;
                case 3:
                    xemDanhSach(select);
                    break;
                case 4:
                    timKiem(select);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap tu 1 -> 5!");
            }
        } while (true);
    }

    public static void them(int select) {
        do {
            System.out.println("---Them moi---");
            System.out.println("1. Them moi tai khoan tiet kiem");
            System.out.println("2. Them moi tai khoan thanh toan");
            System.out.println("3. Tro lai menu chinh");
            System.out.print("Nhap so: ");
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Loi dinh dang!");
                continue;
            }
            switch (select) {
                case 1:
                    service.add("Tiet kiem");
                    break;
                case 2:
                    service.add("Thanh toan");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Vui long nhap tu 1 -> 3");
            }
        } while (select < 1 || select > 3);
    }

    public static void xoa(int select) {
        do {
            System.out.println("---Xoa---");
            System.out.println("1. Xoa tai khoan tiet kiem");
            System.out.println("2. Xoa tai khoan thanh toan");
            System.out.println("3. Tro lai menu chinh");
            System.out.print("Nhap so: ");
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Loi dinh dang!");
                continue;
            }
            switch (select) {
                case 1:
                    service.delete("Tiet kiem");
                    break;
                case 2:
                    service.delete("Thanh toan");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Vui long nhap tu 1 -> 3");
            }
        } while (select < 1 || select > 3);
    }

    public static void xemDanhSach(int select) {
        do {
            System.out.println("---Xem danh sach tai khoan---");
            System.out.println("1. Xem tai khoan tiet kiem");
            System.out.println("2. Xem tai khoan thanh toan");
            System.out.println("3. Tro lai menu chinh");
            System.out.print("Nhap so: ");
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Loi dinh dang!");
                continue;
            }
            switch (select) {
                case 1:
                    service.display("Tiet kiem");
                    break;
                case 2:
                    service.display("Thanh toan");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Vui long nhap tu 1 -> 3");
            }
        } while (select < 1 || select > 3);
    }

    public static void timKiem(int select) {
        do {
            System.out.println("---Tim kiem tai khoan---");
            System.out.println("1. Tim kiem tai khoan tiet kiem theo ma tai khoan");
            System.out.println("2. Tim kiem tai khoan thanh toan theo ma tai khoan");
            System.out.println("3. Tim kiem tai khoan tiet kiem theo ten tai khoan");
            System.out.println("4. Tim kiem tai khoan thanh toan theo ten tai khoan");
            System.out.println("5. Tro lai menu chinh");
            System.out.print("Nhap so: ");
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Loi dinh dang!");
                continue;
            }
            switch (select) {
                case 1:
                    service.search("code", "Tiet kiem");
                    break;
                case 2:
                    service.search("code", "Thanh toan");
                    break;
                case 3:
                    service.search("name", "Tiet kiem");
                    break;
                case 4:
                    service.search("name", "Thanh toan");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Vui long nhap tu 1 -> 5");
            }
        } while (select < 1 || select > 5);
    }

    public static void main(String[] args) {
        int select = 0;
        displayMainMethod(select);
    }
}
