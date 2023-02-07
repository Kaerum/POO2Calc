public class CalculadoraDeSalarioLiquidoMaisFerias extends CalculadoraDeSalarioLiquidoBase {
    @Override
    public double calcular(double salarioBruto, double descontos, double bonus) throws CalculadoraDeSalarioLiquidoException {
        double base = super.calcular(salarioBruto, descontos, bonus);
        return base + salarioBruto * 0.5;
    }
}
