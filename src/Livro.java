public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String codigo;
    private Autor autor;
    

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

    // getters and setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
