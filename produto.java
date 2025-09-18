public class Produto {
    private String nome;
    private double valor;
    private int quantidadeEmEstoque;

    public Produto(String nome, double valor, int quantidadeEmEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void escreverDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public double calcularValorTotal() {
        return valor * quantidadeEmEstoque;
    }

    public void alterarQuantidade(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }
}