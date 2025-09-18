public class CadastroDeLivro {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Antoine de Saint-Exupéry";
        autor.email = "Antoine@gmail.com";
        autor.cpf = "123.456.789.10";
        
        Livro livro = new Livro();
        livro.nome = "pequeno principe";
        livro.descricao = "Livro incrivel";
        livro.valor = 59.90;
        livro.codigo = "123-banana";

        livro.autor = autor;

        livro.infos();
        if(!livro.aplicarDescontoDe(0.1)){
            System.out.println("Não é possivel aplicar descontos maiores que 30%");
        } else{
            System.out.println("Desconto aplicado com sucesso");
            livro.infos();
        }

        System.out.println();

        Autor outroautor = new Autor();
        outroautor.nome = "Tomohito Oda";
        outroautor.email = "Tooda@gmail.com";
        outroautor.cpf = "123.456.789.10";

        Livro outrolivro = new Livro();
        outrolivro.nome = "komi-san can't comunicate";
        outrolivro.descricao = "Deveras fofinho";
        outrolivro.valor = 29.90;
        outrolivro.codigo = "321-nanaba";
        
        outrolivro.autor = outroautor;

        outrolivro.infos();
    }
}
