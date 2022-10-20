public class Calculadora {
    //construtores
    public Calculadora(){
    }
    //metodos
    public double sum(double num1,double num2){

        return num1 + num2;
    }
    public double sum(double num1,double num2,double num3){

        return num1 + num2 + num3;
    }
    public double minus(double num1, double num2){

        return num1 - num2;
    }
    public double minus(double num1,double num2,double num3){

        return num1 - num2 - num3;
    }
    public double multiply(double num1, double num2){

        return num1 * num2;
    }
    public double multiply(double num1,double num2,double num3){

        return num1 * num2 * num3;
    }
    public double divide(double num1, double num2){
        return num1 / num2; }
    public double divide(double num1,double num2,double num3){

        return num1 / num2 / num3;
    }
}
