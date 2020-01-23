public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction() {
    }
    
    public Fraction(int num, int denom) {
        numerator=num;
        denominator=denom;
    }

    public void setNumenator(int num) {
        numerator=num;
    }
    
    public void setDenominator(int denom) {
        denominator=denom;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }

    public Fraction add(Fraction f, Fraction g){
        int resultNum=f.getNumerator()*g.getDenominator()+ f.getDenominator()*g.getNumerator();
        int resultDenom=f.getDenominator()*g.getDenominator();
        return new Fraction(resultNum, resultDenom);
    }
    
    public Fraction subst(Fraction f, Fraction g){
        int resultNum=f.getNumerator()*g.getDenominator()- f.getDenominator()*g.getNumerator();
        int resultDenom=f.getDenominator()*g.getDenominator();
        return new Fraction(resultNum, resultDenom);
    }
    
    public Fraction mult(Fraction f, Fraction g){
        int resultNum=f.getNumerator()*g.getNumerator();
        int resultDenom=f.getDenominator()*g.getDenominator();
        return new Fraction(resultNum, resultDenom);
    }
    
    public Fraction div(Fraction f, Fraction g){
        int resultNum=f.getNumerator()*g.getDenominator();
        int resultDenom=f.getDenominator()*g.getNumerator();
        return new Fraction(resultNum, resultDenom);
    }
    public static void main(String[] args) {
        Fraction f =new Fraction(2,3);
        Fraction g =new Fraction(5,6);
        Fraction result = new Fraction();
        result=result.add(f, g);
        System.out.println("Result fraction numerator is: " + result.getNumerator() + " Result fraction denominator is: " + result.getDenominator());
    }
}
