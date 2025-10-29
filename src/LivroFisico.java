// Representa um livro fisico, que é um tipo de livro
// Essa subclasse também é importante por precisar de regras que só fazem sentido para
// livros fisicos, como a taxa de impressão.

public class LivroFisico extends Livro {
    public LivroFisico(Autor autor){
        super(autor); // Chama o construtor da Super Classe livro e passa o parametro autor
    }

    public void taxaImpressao(){
        this.setValor(this.getValor()*0.05);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if(porcentagem > 0.3){
            return false;
        }
        setValor(this.getValor() - this.getValor() * porcentagem);
        return true;
    }
}
