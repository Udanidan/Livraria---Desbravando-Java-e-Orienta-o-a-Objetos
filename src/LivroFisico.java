public class LivroFisico extends Livro {
    public LivroFisico(Autor autor){
        super(autor);
    }

    public void taxaImpressao(){
        this.setValor(this.getValor()*0.05);
    }
}
