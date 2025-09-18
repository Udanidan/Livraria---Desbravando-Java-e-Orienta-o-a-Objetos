public class Livro {
    String nome;
    String descricao;
    double valor;
    String codigo;
    Autor autor;
    

    public Livro(){
        System.out.println("Novo livro criado");
    }

    void infos() {
        System.out.println("As informações do livro são:");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("valor: " + valor);
        System.out.println("codigo: " + codigo);
        System.out.println();
        if(temAutor()){
            autor.infos();
        }
        System.out.println("-----------------------------");
    }

    public boolean aplicarDescontoDe (double porcentagem) {
        // limitar o desconto é importante em casos de regra de negocio 
        if(porcentagem > 0.3){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    boolean temAutor() {
        return this.autor != null;
    }
}
