package br.edu.up.telas;

import java.util.List;

import br.edu.up.controles.ControleDeClientes;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.util.Prompt;

public class TelaPrincipal {

    ControleDeClientes controleDeClientes = new ControleDeClientes();

    public void mostrarMenu(){

        Prompt.separador();
        Prompt.imprimir("MENU PRINCIPAL");
        Prompt.separador();

        Prompt.imprimir("1. Incluir cliente pessoa");
        Prompt.imprimir("2. Incluir cliente empresa");
        Prompt.imprimir("3. Mostrar dados cliente pessoa");
        int op = Prompt.lerInteiro();

        Prompt.imprimir("4. Mostrar dados cliente empresa");
        Prompt.imprimir("5. Emprestar para cliente pessoa");
        Prompt.imprimir("6. Emprestar para cliente empresa");
        Prompt.imprimir("7. Devolução de cliente pessoa");
        Prompt.imprimir("8. Devolução de cliente empresa");
        Prompt.imprimir("9. Sair");

        if(op == 3){
            List<ClientePessoa> clientesPessoa = controleDeClientes.getClientesPessoa();
            for (ClientePessoa clientePessoa : clientesPessoa) {
                System.out.println(clientePessoa);
            }
        }
    }

}
