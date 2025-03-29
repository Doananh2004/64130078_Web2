package vn.trandoananh.TongHopGK.model;

public class SinhVien {
	
	public String mssv;
	public String hoTen;
	public double diemTB;
	
	public SinhVien(String mssv, String hoTen, double diemTB) {
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	
	// Getter và Setter
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
}
