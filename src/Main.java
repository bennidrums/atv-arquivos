import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Path caminho = Path.of("pessoas.txt");

        List<String> linhas = Files.readAllLines(caminho);

        for (String linha : linhas) {
            String[] dados = linha.split(";");

            String nome = dados[0];
            int idade = Integer.parseInt(dados[1]);
            String email = dados[2];

            Pessoa pessoa = new Pessoa(nome, idade, email);

            System.out.println("\n---DADOS---");
            System.out.println(pessoa.toXml());
            System.out.println("---------------");

        }
    }
}