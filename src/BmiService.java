public class BmiService {
    public double calculate(int weight, double height) {
        double index;
        index = (weight / (height * height));
        return index;
    }
}
