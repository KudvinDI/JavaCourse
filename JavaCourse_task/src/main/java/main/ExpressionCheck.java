package main;

public class ExpressionCheck {
    private String expression;
    public ExpressionCheck(String expression) {
        this.expression = expression;
    }

    public boolean checkBrackets(){
        String bracketsStr = expression.replaceAll("[^()]+", ""); //replace everything that is not ( )
        int temp=0;
        for (int i=0; i<bracketsStr.length(); i++){
            if(bracketsStr.charAt(i) == '(')
                temp++;
            if(bracketsStr.charAt(i) == ')')
                temp--;
            if(temp<0)
                return false;
        }
        return temp==0;
    }

}
