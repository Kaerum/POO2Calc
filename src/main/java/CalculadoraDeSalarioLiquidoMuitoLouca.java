import java.io.IOException;

public class CalculadoraDeSalarioLiquidoMuitoLouca extends CalculadoraDeSalarioLiquidoBase {

    @Override
    public double calcular(double salarioBruto, double descontos, double bonus) {
        try {
            double multiplicador = System.in.read();
            throw new IOException("Deu ruim");
//            return super.calcular(salarioBruto, descontos, bonus) * multiplicador;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
