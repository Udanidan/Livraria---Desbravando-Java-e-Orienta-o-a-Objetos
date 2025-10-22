public class Autor {
    // Atributos
    private String nome;
    private String email;
    private String cpf;

    // Exibe as informações do objeto
    void infos() {
        System.out.println("informações do autor:");
        System.out.println("nome: " + nome);
        System.out.println("email: " + email);
        System.out.println("cpf: " + cpf);
        System.out.println();
    }

    //getters e setters alteram os atributos fora da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
