package me.rothmajer.strategy;

public class Main {
    public static void main(String[] args) {
        Context ctx = new Context(new HexaConverter());
        System.out.println(ctx.convert(1));
    }
}
