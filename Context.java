package me.rothmajer.strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public String convert(int number) {
        return strategy.convert(number);
    }
}
