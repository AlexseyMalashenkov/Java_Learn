package oop.calc.dto;

public class CalcWithCounter2 {

    private final CalcWithOperator calc1;
    private final CalcWithCopy calc2;
    private long counter = 0;

    public CalcWithCounter2(CalcWithOperator calc) {
        calc1 = calc;
        calc2 = null;
    }

    public CalcWithCounter2(CalcWithCopy calc) {
        calc1 = null;
        calc2 = calc;
    }

    public CalcWithCounter2(CalcWithExtends calc) {
        calc1 = calc;
        calc2 = null;
    }

    public double plus(double a, double b) {
        this.counter++;
        if (this.calc1 != null) {
            return calc1.plus(a, b);
        } else {
            return this.calc2.plus(a, b);
        }
    }

    public double minus(double a, double b) {
        this.counter++;
        if (this.calc1 != null) {
            return calc1.minus(a, b);
        } else {
            return this.calc2.minus(a, b);
        }
    }

    public double div(double a, double b) {
        this.counter++;
        if (this.calc1 != null) {
            return calc1.div(a, b);
        } else {
            return this.calc2.div(a, b);
        }
    }

    public double multi(double a, double b) {
        this.counter++;
        if (this.calc1 != null) {
            return calc1.multi(a, b);
        } else {
            return this.calc2.multi(a, b);
        }
    }

    public double abs(double a) {
        this.counter++;
        if (this.calc1 != null) {
            return calc1.abs(a);
        } else {
            return this.calc2.abs(a);
        }
    }

    public double power(double a, int b) {
        this.counter++;
        if (this.calc1 != null) {
            return calc1.power(a, b);
        } else {
            return this.calc2.power(a, b);
        }
    }

    public double sqrt(double a) {
        this.counter++;
        if (this.calc1 != null) {
            return this.calc1.sqrt(a);
        } else {
            return this.calc2.sqrt(a);
        }
    }
}