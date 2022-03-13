package defaultPackage;
import java.lang.Math;

public class Calculadora {
    public double CalculaIMC(double peso, double altura) {
        double resultado = peso / Math.pow(altura, 2);
        System.out.println("Meu IMC é" + resultado);
        return resultado;
    };

    public void ClassificacaoIMC(double IMC) {
        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC < 25) {
            System.out.println("Peso normal");
        } else if (IMC < 30) {
            System.out.println("Sobrepeso");
        } else if (IMC < 35) {
            System.out.println("Obesidade Grau I");
        } else {
            System.out.println("Obesidade Grau II");
        }
    };
};
