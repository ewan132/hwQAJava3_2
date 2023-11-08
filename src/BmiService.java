public class BmiService {
    public double calculate(double massaKg, double heightMetr) {

        double index = massaKg / (heightMetr * heightMetr);

        return index;
    }
}
