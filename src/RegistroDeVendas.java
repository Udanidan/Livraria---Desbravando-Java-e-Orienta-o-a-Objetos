// Executa os conceitos de Herança e Polimorfismo na pratica.
public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Machado de Assis");
        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Memorias postumas de Bras Cubas");
        ebook.setValor(29.90);

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Memorias postumas de Bras Cubas");
        fisico.setValor(59.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adciona(fisico);
        carrinho.adciona(ebook);
        
        System.out.println("Total: " + carrinho.getTotal());
    }
}
