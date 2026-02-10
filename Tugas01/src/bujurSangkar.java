public class bujurSangkar extends Bidang2D{
    private double sisi;
    public bujurSangkar(String nama, double sisi){
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return Math.pow(sisi, 2);
    }
}
