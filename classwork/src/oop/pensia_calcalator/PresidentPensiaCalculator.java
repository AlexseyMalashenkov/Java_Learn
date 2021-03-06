package oop.pensia_calcalator;

import oop.ETypeMan;
import oop.Man;

public class PresidentPensiaCalculator implements IPensiaCalculator {

    @Override
    public double calc(Man man) {
        if (!man.getType().equals(ETypeMan.PRESIDENT)) {
            return 0;
        }

        return 10;
    }
}
