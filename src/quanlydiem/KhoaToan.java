package quanlydiem;

public class KhoaToan extends NamHoc2023 {
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void TinhDiem() {
        System.out.println(" Đây la cách tính điểm của khoa toán ");
    }
}
