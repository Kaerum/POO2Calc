public class CalculadoraDeSalarioLiquidoBase implements CalculadoraDeSalarioLiquido {

    private static final double salarioMinimo = 1032;
    @Override
    public double calcular(double salarioBruto, double descontos, double bonus) throws CalculadoraDeSalarioLiquidoException {
        if (salarioBruto < salarioMinimo) {
            throw new CalculadoraDeSalarioLiquidoException();
        }
        if (descontos > salarioBruto) {
            throw new CalculadoraDeSalarioLiquidoException();
        }
        if (bonus > 1000) {
            throw new CalculadoraDeSalarioLiquidoException();
        }
        return salarioBruto + bonus - descontos;
    }
}
