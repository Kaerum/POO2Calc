public class CalculadoraFreteCorreios implements CalculadoraFrete {
    @Override
    public double calcular(Produto produto, double distancia) {
        return (produto.peso * 0.015) + (distancia * 0.01);
    }
}
