package br.edu.up.daos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;

public class GerenciadorDeArquivosDAO {

    private String header = "";
    private String nomeDoArquivo = "C:\\zGuiws\\DevM\\ExArquivos\\src\\clientes.csv";

    public List<Cliente> getClientes(){

        List<Cliente> listaDeClientes = new ArrayList<>();

        try {
            //LER DADOS DE UM ARQUIVO DE TEXTO
            File arquivoLeitura = new File(nomeDoArquivo);
        
            //Scanner leitor = new Scanner(System.in);//teclado
            Scanner leitor = new Scanner(arquivoLeitura); //arquivo

            //ARMAZENAR O HEADER
            header = leitor.nextLine();


            //PERCORRER TODAS AS LINHAS DO ARQUIVO
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();

                String[] dados = linha.split(";");

                String nome = dados[0];
                String telefone = dados[1];
                String email = dados[2];
                String credito = dados[3];
                String emprestado = dados[4];

                Cliente cliente = null;

                String cpf = dados[5];
                if(cpf != null && !cpf.equals("")){
                    double peso = Double.parseDouble(dados[6]);
                    double altura = Double.parseDouble(dados[7]);
                    cliente = new ClientePessoa(nome, telefone, email, cpf, peso, altura);
                    listaDeClientes.add(cliente);
                }else{
                    String cnpj = dados[8];
                    String iestadual = dados[9];
                    int ano = Integer.parseInt(dados[10]);
                    cliente = new ClienteEmpresa(nome, telefone, email, cnpj, iestadual, ano);
                    //cnpj;iestadual;ano
                }
                

    

                //Cliente cliente = new Cliente(nome, telefone, email);
                //listaDeClientes.add(cliente);

                //System.out.println("Nome: " + nome);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }

        return listaDeClientes;
    }

    public void gravarArquivo(){

        String header = "";
        String nomeDoArquivo = "C:\\zGuiws\\DevM\\ExArquivos\\src\\clientes.csv";
        List<Cliente> listaDeClientes = new ArrayList<>();

        try {
            //GRAVAR DADOS EM UM ARQUIVO DE TEXTO
            FileWriter arquivoGravar = new FileWriter(nomeDoArquivo);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println(header);

            for (Cliente cliente : listaDeClientes) {
                gravador.println(cliente.toCSV());
            }

            gravador.close();
        } catch (IOException e) {
            System.out.println("Não foi possível gravar o arquivo");
        }
    }

    
}

