package me.rothmajer.strategy;

public class HexaConverter implements Strategy {
    @Override
    public String convert(int number) {
        return Integer.toHexString(number);
    }
}
