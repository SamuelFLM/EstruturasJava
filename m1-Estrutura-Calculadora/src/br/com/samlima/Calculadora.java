package br.com.samlima;

public class Calculadora {
    private Sum sum;
    private Subtraction subtraction;
    private Division division;
    private Multiplication multiplication;


    public Calculadora(Sum sum, Subtraction subtraction, Division division, Multiplication multiplication) {
        this.sum = sum;
        this.subtraction = subtraction;
        this.division = division;
        this.multiplication = multiplication;
    }

    public Sum getSum() {
        return sum;
    }

    public void setSum(Sum sum) {
        this.sum = sum;
    }

    public Subtraction getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(Subtraction subtraction) {
        this.subtraction = subtraction;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Multiplication getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(Multiplication multiplication) {
        this.multiplication = multiplication;
    }

    public void sumValues(){
        System.out.println("**************************");
        System.out.println("number 1: " + (getSum().getNumberX()));
        System.out.println("number 2: " + (getSum().getNumberY()));
        System.out.println("Soma: " + (getSum().getNumberX() + getSum().getNumberY()));
    }
    public void substractionValues(){
        System.out.println("**************************");
        System.out.println("number 1: " + (getSubtraction().getNumberX()));
        System.out.println("number 2: " + (getSubtraction().getNumberY()));
        System.out.println("Substraction: " + (getSubtraction().getNumberX() - getSubtraction().getNumberY()));
    }

    public void divisionValues(){
        System.out.println("**************************");
        System.out.println("number 1: " + (getDivision().getNumberX()));
        System.out.println("number 2: " + (getDivision().getNumberY()));
        System.out.println("Division: " + (getDivision().getNumberX() / getSubtraction().getNumberY()));
    }
    public void multiplicationValues(){
        System.out.println("**************************");
        System.out.println("number 1: " + (getMultiplication().getNumberX()));
        System.out.println("number 2: " + (getMultiplication().getNumberY()));
        System.out.println("Division: " + (getMultiplication().getNumberX() * getMultiplication().getNumberY()));
    }
}
