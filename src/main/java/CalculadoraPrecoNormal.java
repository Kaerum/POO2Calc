public class CalculadoraPrecoNormal implements CalculadoraPreco {
    @Override
    public double calcular(Produto produto) {
        if (produto.preco > 1000) {
            return produto.preco * 0.85;
        } else if (produto.preco > 500) {
            return produto.preco * 0.92;
        } else {
            return produto.preco;
        }
    }
}
