package br.com.samlima;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculadora calculadora = operation();
        calculadora.multiplicationValues();

    }

    public static Calculadora operation(){
        Sum sum = sum(8, 10);
        Subtraction subtraction = subtraction(8, 10);
        Division division = division(8, 10);
        Multiplication multiplication = multiplication(8,10);
        Calculadora calculadora = new Calculadora(sum, subtraction, division, multiplication);
        return  calculadora;
    }

    public static Sum sum(float valuesX, float valuesY){
        return new Sum(valuesX, valuesY);}
    public static Subtraction subtraction(float valuesX, float valuesY){
        return new Subtraction(valuesX, valuesY);
    }public static Division division(float valuesX, float valuesY){
        return new Division(valuesX, valuesY);
    }public static Multiplication multiplication(float valuesX, float valuesY){
        return new Multiplication(valuesX, valuesY);
    }
}