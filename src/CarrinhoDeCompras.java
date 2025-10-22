public class CarrinhoDeCompras {
    
    private double total;

    public void adciona(Livro livro){
        System.out.println("Livro adcionado: " + livro);
        livro.aplicarDescontoDe(0.05);
        this.total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
