package defaultPackage;

public class Diagnostico {
  public static void main(String[] args) {
    Calculadora MinhaAvaliacao = new Calculadora();
    double meuIMC = MinhaAvaliacao.CalculaIMC(48, 1.63);
    MinhaAvaliacao.ClassificacaoIMC(meuIMC);
  }
}
