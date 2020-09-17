package oop.calc;

import oop.calc.dto.*;

public class CalcMain1 {
    public static void main(String[] args) {
        CalcWithOperator calc1 = new CalcWithOperator();
        CalcWithCopy calc2 = new CalcWithCopy();
        CalcWithExtends calc3 = new CalcWithExtends();
        ICalc calc4 = calc1;

        Fizik fizik1 = new Fizik(calc1);
        double calcResult = fizik1.calc(123, 77);


        System.out.println(calcResult);

        //CalcWithCounter3 calc5 = new CalcWithCounter3(null); //BAD
        ICalcWithCounter calc5 = new CalcWithCounter3(calc4);
        CalcWithCounter3 calc6 = new CalcWithCounter3(calc1);
        CalcWithCounter3 calc7 = new CalcWithCounter3(calc1);


        Fizik fizik2 = new Fizik(calc5);
        double calcResult2 = fizik2.calc(123,77);

        System.out.println(calcResult2);
        System.out.println(calc5.getCounter());

        Fizik fizik3 = new Fizik(new CalcWithCounter3(calc1));
        double calcResult3 = fizik3.calc(123,77);
        ICalcWithCounter savedCalc = (ICalcWithCounter) fizik3.getCalc();

        System.out.println(calcResult3);
        System.out.println(savedCalc.getCounter());


        Fizik<ICalcWithCounter> fizik4 = new Fizik(new CalcWithCounter3(calc1));
        double calcResult4 = fizik4.calc(123,77);
       // ICalcWithCounter savedCalc4 = (ICalcWithCounter) fizik4.getCalc(); //ошибка приведения типов

        System.out.println(calcResult4);
        //System.out.println(savedCalc4.getCounter());
        //System.out.println(((ICalcWithCounter) fizik4.getCalc()).getCounter()); // -//-
        ICalc savedCalc4 = fizik4.getCalc();

        System.out.println((fizik4.getCalc()).getCounter());

    }
}