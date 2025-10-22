public class CarrinhoDeCompras {
    
    private double total;

    // Recebe qualquer tipo de livro, fisico ou ebook, por receber o tipo da classe pai
    // Isso evita reescrever os métodos para cada filho
    // Esse conceito se chama Polimorfismo.
    public void adciona(Livro livro){
        System.out.println("Livro adcionado: " + livro);
        livro.aplicarDescontoDe(0.05);
        this.total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
