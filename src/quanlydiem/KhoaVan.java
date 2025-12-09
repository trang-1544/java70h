package quanlydiem;

public class KhoaVan extends NamHoc2023 {
    public KhoaVan(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void TinhDiem() {
        System.out.println("Cách tính điểm khoa Văn");
    }
}
