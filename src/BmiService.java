public class BmiService {
    public double calculate(double weight, double height) {
        double height2 = height * height; //рост в квадрате
        double bmi = weight / height2;


        return bmi;
    }

}
