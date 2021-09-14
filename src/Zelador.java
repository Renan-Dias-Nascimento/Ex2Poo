public class Zelador extends Funcionario{

    private String gerenciamentoMateriais;

    public void gerenciarEstoque(){};

    double calcularSalario(double horasTrabalhadas, double valorCobrado){
        return horasTrabalhadas*valorCobrado;
    };
}
