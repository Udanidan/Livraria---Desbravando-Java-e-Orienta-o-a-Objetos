public class Autor {
    private String nome;
    private String email;
    private String cpf;

    void infos() {
        System.out.println("informações do autor:");
        System.out.println("nome: " + nome);
        System.out.println("email: " + email);
        System.out.println("cpf: " + cpf);
        System.out.println();
    }

    //getters e setters
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
