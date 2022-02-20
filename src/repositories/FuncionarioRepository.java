package repositories;

import entities.Funcionario;

import java.io.File;
import java.io.PrintWriter;

public class FuncionarioRepository {
    public void gravarDados (Funcionario funcionario) throws Exception {

        //CRIANDO ARQUIVO
        PrintWriter novoArquivo = new PrintWriter(new File("C:\\temp\\funcionario.txt"));

        //ESCREVENDO DADOS NO ARQUIVO
        novoArquivo.write("ID: " + funcionario.getIdFuncionario());
        novoArquivo.write("\nNome: "+ funcionario.getNome());
        novoArquivo.write("\nCPF: "+ funcionario.getCPF());
        novoArquivo.write("\nMatricula: "+funcionario.getMatricula());
        novoArquivo.write("\nSalário: R$ "+funcionario.getSalario());

        //fechando e salvando o arquivo
        novoArquivo.flush();
        novoArquivo.close();
    }
}

