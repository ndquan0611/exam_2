package exam_2.service;

import exam_2.repository.TaiKhoanRepository;
import exam_2.repository.TaiKhoanRepositoryImpl;

public class TaiKhoanServiceImpl implements TaiKhoanService{
    private static TaiKhoanRepository repository = new TaiKhoanRepositoryImpl();

    @Override
    public void add(String type) {
        repository.add(type);
    }

    @Override
    public void delete(String type) {
        repository.delete(type);
    }

    @Override
    public void display(String type) {
        repository.display(type);
    }

    @Override
    public void search(String search, String type) {
        repository.search(search, type);
    }
}
