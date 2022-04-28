public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 70; //вес, кг
        double height = 1.85; //рост, м
        double bmi = service.calculate(weight, height); // индекс массы тела
        System.out.println(bmi + " кг/м2");
    }
}