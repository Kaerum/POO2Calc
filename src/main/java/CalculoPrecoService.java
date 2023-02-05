public class CalculoPrecoService {

    private CalculadoraPreco calculadoraPreco;
    private CalculadoraFrete calculadoraFrete;
    public CalculoPrecoService(CalculadoraFrete calculadoraFrete, CalculadoraPreco calculadoraPreco) {
        this.calculadoraFrete = calculadoraFrete;
        this.calculadoraPreco = calculadoraPreco;
    }
    public double calcular(Produto produto, double distancia) {
        return this.calculadoraPreco.calcular(produto) + this.calculadoraFrete.calcular(produto, distancia);
    }
}
