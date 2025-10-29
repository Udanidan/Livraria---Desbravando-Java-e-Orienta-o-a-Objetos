// Class filha da Super Classe Livro
// Essa classe herda tudo que existe na classe livro
// A criação dessa subclasse é necessaria devido a necessidade de atributos proprios
// E regras de negocio como o desconto maximo de 15%

public class Ebook extends Livro {
    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    // Reescreve o método original permitindo 15% de desconto como o maximo
    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }

        setValor(this.getValor() - this.getValor() * porcentagem);
        return true;
        // Não é mais possivel por se tornar abstrata
        // retorna a classe original para aplicar a lógica dela sem reescrever
        // return aplicarDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

}
