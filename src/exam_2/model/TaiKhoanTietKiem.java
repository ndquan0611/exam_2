package exam_2.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private long soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private double laiSuat;
    private String kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int id, String code, String name, String date) {
        super(id, code, name, date);
    }

    public TaiKhoanTietKiem(long soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, String kiHan) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int id, String code, String name, String date, long soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, String kiHan) {
        super(id, code, name, date);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public long getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(long soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String getInfo() {
        return getFile() + "," + soTienGuiTietKiem + "," + ngayGuiTietKiem + "," + laiSuat + "," + kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" + super.toString() +
                ", soTienGuiTietKiem=" + soTienGuiTietKiem +
                ", ngayGuiTietKiem='" + ngayGuiTietKiem + '\'' +
                ", laiSuat=" + laiSuat +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
}
