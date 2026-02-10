public class lingkaran extends Bidang2D {
    private double jari2;

    public lingkaran (String nama, double jari2) {
        super(nama);
        this.jari2 = jari2;
    }

    @Override
    public double luas() {
        return Math.PI * Math.pow(jari2, 2);
    }

}
