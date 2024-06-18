package Files.OOP.bai2;

public class SanPham {
    public int MaSanPham;
    public String TenSanPham;
    public String LoaiSanPham;
    public boolean LaSanPhamMoi;

    public SanPham(int maSanPham, String tenSanPham, String loaiSanPham, boolean laSanPhamMoi) {
        this.MaSanPham = maSanPham;
        this.TenSanPham = tenSanPham;
        this.LoaiSanPham = loaiSanPham;
        this.LaSanPhamMoi = laSanPhamMoi;
    }

    public void setMaSanPham(int maSanPham) {
        MaSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        LoaiSanPham = loaiSanPham;
    }

    public void setLaSanPhamMoi(boolean laSanPhamMoi) {
        LaSanPhamMoi = laSanPhamMoi;
    }

    public int getMaSanPham() {
        return MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public String getLoaiSanPham() {
        return LoaiSanPham;
    }

    public boolean getLaSanPhamMoi() {
        return LaSanPhamMoi;
    }

    public void InThongTin() {
        System.out.printf("San pham %s co ma la %d, thuoc loai %s, %s la san pham moi.\n",
                TenSanPham, MaSanPham, LoaiSanPham, LaSanPhamMoi ? "va" : "khong");
    }
}
