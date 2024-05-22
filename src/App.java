import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        //LER DADOS DE UM ARQUIVO DE TEXTO
        File arquivoLeitura = new File("C:\\zGuiws\\DevM\\ExArquivos\\src\\arquivo.txt");
        
        //Scanner leitor = new Scanner(System.in);//teclado
        Scanner leitor = new Scanner(arquivoLeitura); //arquivo

        //PERCORRER TODAS AS LINHAS DO ARQUIVO
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            System.out.println(linha);
        }

        leitor.close();

        //GRAVAR DADOS EM UM ARQUIVO DE TEXTO

    }
}
