package com.kodilla.stream.lambda;

public class ExpressionExecutotr {

    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a,b);
    }

}
