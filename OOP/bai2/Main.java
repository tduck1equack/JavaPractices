package Files.OOP.bai2;

public class Main {
    public static void main(String[] args) {
        SanPham aba = new SanPham(1, "Bot giat ABA", "San pham ve sinh", true);
        aba.InThongTin();
        aba.setTenSanPham("Bot giat Vi Dan");
        aba.setMaSanPham(2);
        aba.setLoaiSanPham("San pham bao cap");
        aba.setLaSanPhamMoi(false);
        System.out.println(aba.getMaSanPham());
        System.out.println(aba.getTenSanPham());
        System.out.println(aba.getLoaiSanPham());
        System.out.println(aba.getLaSanPhamMoi());
        aba.InThongTin();
    }
}
