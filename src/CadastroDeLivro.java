// Aplica os conceitos de classe, objeto,
// encapsulamento e getters/setters
public class CadastroDeLivro {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Antoine de Saint-Exupéry");
        autor.setEmail("Antoine@gmail.com");
        autor.setCpf("123.456.789.10");
        
        // Embora seja do tipo livro, é um livro fisico
        // Afinal um livro fisico É um livro, então pode ser chamado como tal
        Livro livro = new LivroFisico(autor);
        livro.setNome("pequeno principe");
        livro.setDescricao("Livro incrivel");
        livro.setValor(59.90);;
        livro.setCodigo("123-banana");

        livro.setAutor(autor);

        livro.infos();
        if(!livro.aplicarDescontoDe(0.1)){
            System.out.println("Não é possivel aplicar descontos maiores que 30%");
        } else{
            System.out.println("Desconto aplicado com sucesso");
            livro.infos();
        }

        System.out.println();

        Autor outroautor = new Autor();
        outroautor.setNome("Tomohito Oda");
        outroautor.setEmail("Tooda@gmail.com");
        outroautor.setCpf("123.456.789.10");

        // Ebooks também podem ser referenciados como Livros
        Livro outrolivro = new Ebook(outroautor);
        outrolivro.setNome("komi-san can't comunicate");
        outrolivro.setDescricao("Deveras fofinho");
        outrolivro.setValor(29.90);
        outrolivro.setCodigo("321-nanaba");
        
        outrolivro.setAutor(outroautor);

        outrolivro.infos();
    }
}
