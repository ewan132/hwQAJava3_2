public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();

        double index = calculate.calculate(60, 1.66);
        System.out.println((int) index);
    }
}