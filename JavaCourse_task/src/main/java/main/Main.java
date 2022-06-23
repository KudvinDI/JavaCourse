package main;


import org.mariuszgromada.math.mxparser.Expression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        Expression expression = new Expression(inputExpression());
        ExpressionCheck expressionCheck = new ExpressionCheck(expression.getExpressionString());
        System.out.println("Are brackets valid ? " +expressionCheck.checkBrackets());
        System.out.println("Are arithmetic operations are valid ? " + expression.checkSyntax());
        System.out.println(expression.getExpressionString() + " = " + expression.calculate());
        System.out.println("Numbers in expression = " + amountOfNumberInExp(expression.getExpressionString()));
    }
    public int amountOfNumberInExp(String expression){
        return expression.split("[^0-9.]+").length; //split for everything that is not a number and dot
    }
    public String inputExpression(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
