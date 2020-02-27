package me.rothmajer.strategy;

public class OctaConverter implements Strategy{

    @Override
    public String convert(int number) {
        return Integer.toOctalString(number);
    }
}
