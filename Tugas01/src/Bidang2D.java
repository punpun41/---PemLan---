public class Bidang2D {
    protected String nama;

    public Bidang2D(String nama) {
        this.nama = nama;
    }
    public void info(){
        System.out.println("Nama Bidang: " + this.nama);
    }
    public double luas(){
        return 0;
    }
}