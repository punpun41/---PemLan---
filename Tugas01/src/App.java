public class App {
    public static void main(String[] args) {
        bujurSangkar bs1 = new bujurSangkar("Bujur Sangkar 1", 7.7);
        lingkaran l1 = new lingkaran("Lingkaran 1", 10);

        bs1.info();
        System.out.printf("Luas Bidang: %.2f%n", bs1.luas());

        System.out.println();

        l1.info();
        System.out.printf("Luas Bidang: %.2f%n", l1.luas());
        }
    }
