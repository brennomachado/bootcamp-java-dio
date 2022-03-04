public class Calculadora {

    public static double soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println(numero1  + " + " + numero2 + " = " + resultado);
        return resultado;
    }

    public static double subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println(numero1  + " - " + numero2 + " = " + resultado);
        return resultado;
    }

    public static double multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println(numero1  + " * " + numero2 + " = " + resultado);
        return resultado;
    }

    public static double divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println(numero1  + " / " + numero2 + " = " + resultado);
        return resultado;
    }
}
