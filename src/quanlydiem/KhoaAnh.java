package quanlydiem;

public class KhoaAnh extends NamHoc2023 {
    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void TinhDiem() {
        System.out.println("Cách tính điểm Khoa Anh ");
    }
}
