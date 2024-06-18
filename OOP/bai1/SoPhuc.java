package Files.OOP.bai1;

public class SoPhuc {
    public double PhanThuc;
    public double PhanAo;

    public void setPhanThuc(double phanThuc) {
        PhanThuc = phanThuc;
    }

    public void setPhanAo(double phanAo) {
        PhanAo = phanAo;
    }

    public double getPhanThuc() {
        return PhanThuc;
    }

    public double getPhanAo() {
        return PhanAo;
    }

    public void InThongTin() {
        System.out.printf("Thong tin so phuc: <<%.2f + %.2fi>>", PhanThuc, PhanAo);
    }
}
