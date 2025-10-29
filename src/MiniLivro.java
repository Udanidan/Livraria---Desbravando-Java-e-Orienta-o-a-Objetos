// Mini livro é uma classe filha da classe livro
// Essa classe não possui desconto, para resolver isso vamos
// Utilizar abstração na classe livro, para evitar que alguem
// Acabe esquecendo de escrever um método de acordo com as regras
public class MiniLivro extends Livro {
    public MiniLivro(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        // Caso o método não seja escrito o codigo não compila
        return false;
    }
}
