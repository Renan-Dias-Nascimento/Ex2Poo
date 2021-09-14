public class Professor extends Funcionario{

    private String materiaEnsinada;

    public void ensinar(){};

    double calcularSalario(double horasTrabalhadas, double valorCobrado){
        return horasTrabalhadas*valorCobrado;
    };
}
