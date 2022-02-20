package principal;

import entities.Funcionario;
import repositories.FuncionarioRepository;

import javax.swing.*;

public class Program {
    public static void main (String [] args) {

    try {
        Funcionario funcionario = new Funcionario();

        System.out.println("----------------------------Registro de Funcionários----------------------------");

        Integer idFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Funcionário: "));
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        String CPF = JOptionPane.showInputDialog("Informe o CPF do Funcionário: ");
        String matricula = JOptionPane.showInputDialog("Informe a matricula do Funcionário");
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário funcionário: "));

        funcionario.setIdFuncionario(idFuncionario);
        funcionario.setNome(nome);
        funcionario.setCPF(CPF);
        funcionario.setMatricula(matricula);
        funcionario.setSalario(salario);

        System.out.println("ID do Funcionário:  " + funcionario.getIdFuncionario());
        System.out.println("Nome do Funcionário: " + funcionario.getNome());
        System.out.println("CPF do Funcionário: " + funcionario.getCPF());
        System.out.println("Matrícula do Funcionário: " + funcionario.getMatricula());
        System.out.println("Salário do Funcionário: " + funcionario.getSalario());


        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        funcionarioRepository.gravarDados(funcionario);

        System.out.println("Arquivo gravado com sucesso!");
    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro!", "Atenção",
                JOptionPane.WARNING_MESSAGE);
    }

    }
}