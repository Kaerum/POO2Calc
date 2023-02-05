public class Main {
    public static void main(String[] args) {
        var calculadoraFreteCorreios = new CalculadoraFreteCorreios();
        var calculadoraPrecoNormal = new CalculadoraPrecoNormal();
        var calculoPrecoServico = new CalculoPrecoService(calculadoraFreteCorreios, calculadoraPrecoNormal);
        System.out.println(calculoPrecoServico.calcular(new Produto(1000, 50), 4000));
    }
}
