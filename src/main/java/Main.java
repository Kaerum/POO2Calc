public class Main {
    public static void main(String[] args) {
        var calculadoraBase = new CalculadoraDeSalarioLiquidoBase();
        var calculadoraFerias = new CalculadoraDeSalarioLiquidoMaisFerias();
        var calculadoraLouca = new CalculadoraDeSalarioLiquidoMuitoLouca();
        double salarioBruto = 2000;
        double bonus = 500;
        double descontos = 2100;
        try {
            calculadoraBase.calcular(salarioBruto, descontos, bonus);
            calculadoraFerias.calcular(salarioBruto, descontos, bonus);
//            calculadoraLouca.calcular(salarioBruto, descontos, bonus);
        } catch (CalculadoraDeSalarioLiquidoException e) {
            System.out.println("Deu ruim!");
        }
        System.out.println("Chega aqui");
    }
}
