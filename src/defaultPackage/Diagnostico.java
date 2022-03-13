package defaultPackage;

public class Diagnostico implements DiagnosticoMedico{

  private String medico;

  Diagnostico(String medico) {
    this.medico = medico;
  }
  public static void main(String[] args) {
    Calculadora MinhaAvaliacao = new Calculadora();
    double meuIMC = MinhaAvaliacao.CalculaIMC(48, 1.63);
    MinhaAvaliacao.ClassificacaoIMC(meuIMC);
  }

    /**
     * @return String return the medico
     */
    public String getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(String medico) {
        this.medico = medico;
    }

    @Override
    public void startDiagnostic() {
    }

    @Override
    public void stopDiagnostic() {
      System.out.println("Acabou tudo");
    }
}
