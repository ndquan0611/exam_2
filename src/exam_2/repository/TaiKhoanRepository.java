package exam_2.repository;

public interface TaiKhoanRepository {
    void add(String type);
    void delete(String type);
    void display(String type);
    void search(String search, String type);
}
