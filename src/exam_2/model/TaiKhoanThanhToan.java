package exam_2.model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private int soThe;
    private long soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(int id, String code, String name, String date) {
        super(id, code, name, date);
    }

    public TaiKhoanThanhToan(int soThe, long soTienTrongTaiKhoan) {
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan(int id, String code, String name, String date, int soThe, long soTienTrongTaiKhoan) {
        super(id, code, name, date);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public long getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(long soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String getInfo() {
        return getFile() + "," + soThe + "," + soTienTrongTaiKhoan;
    }


    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" + super.toString() +
                ", soThe=" + soThe +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                '}';
    }
}
