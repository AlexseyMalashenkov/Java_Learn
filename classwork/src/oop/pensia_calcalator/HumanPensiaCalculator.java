package oop.pensia_calcalator;

import oop.ETypeMan;
import oop.Man;

public class HumanPensiaCalculator implements IPensiaCalculator{
    @Override
    public double calc(Man man) {

        if (!man.getType().equals(ETypeMan.HUMAN)) {
            return 0;
        }

        return 1000 * man.getHairLength() * man.getYearOld();
    }
}
