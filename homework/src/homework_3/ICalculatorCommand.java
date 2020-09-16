package homework_3;

public interface ICalculatorCommand {
    double addNum(double a, double b);
    double subNum(double a, double b);
    double multiNum(double a, double b);
    double divNum(double a, double b);
    double expNum(double a, int b);
    double absNum(double a);
    double sqrtNum(double a);
}
