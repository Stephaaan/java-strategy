package me.rothmajer.strategy;

public class BinaryConverter implements Strategy {
    @Override
    public String convert(int number) {
        return Integer.toBinaryString(number);
    }
}
