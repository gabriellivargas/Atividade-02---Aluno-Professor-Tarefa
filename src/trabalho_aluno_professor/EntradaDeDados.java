/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_aluno_professor;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GABRIELLI
 */
   public class EntradaDeDados {
    Aluno objAluno = new Aluno();               // objeto Aluno
    Professor objProfessor = new Professor();   // objeto Professor

    public void salvarAluno() {

        objAluno.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
        objAluno.setRa(JOptionPane.showInputDialog("Insira o RA do aluno: "));
        objAluno.setIdade(JOptionPane.showInputDialog("Insira a Idade do aluno: "));
        objAluno.setCpf(JOptionPane.showInputDialog("Insira o CPF : "));
        objAluno.setSexo(JOptionPane.showInputDialog("Insira o Sexo: "));
        
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
	listaAluno.add(objAluno);	
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
        listaAluno.add(objAluno);
        }


    public void exibirAluno() {

        String ra;         

        ra= JOptionPane.showInputDialog("Insira a ra do aluno a ser pesquisado: ");

        if (objAluno.getRa().equals(ra)) {

            JOptionPane.showMessageDialog(null, "Aluno consta no sistema!\nNome: " + objAluno.getNome()
                    + "\nIdade: " + objAluno.getIdade() + "\nCpf: " + objAluno.getCpf() + "\nRa:" + objAluno.getRa() 
                    + "\nSexo: " + objAluno.getSexo());
        } // if
        else {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    } 
    
      public void salvarProfessor() {

        objProfessor.setNome(JOptionPane.showInputDialog("Insira o nome do Professor: "));
        objProfessor.setSiape(JOptionPane.showInputDialog("Insira o Siape: "));
        objProfessor.setIdade(JOptionPane.showInputDialog("Insira a Idade: "));
        objProfessor.setCpf(JOptionPane.showInputDialog("Insira o CPF : "));
        objProfessor.setSexo(JOptionPane.showInputDialog("Insira o Sexo: "));
        
        ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
	listaProfessor.add(objProfessor);	

    }


       public void exibirProfessor() {

        String siape;           // matrícula do aluno a ser pesquisado

        siape= JOptionPane.showInputDialog("Insira o siape do professor a ser pesquisado: ");

        if (objProfessor.getSiape().equals(siape)) {

            JOptionPane.showMessageDialog(null, "Professor consta no sistema!\nNome: " + objProfessor.getNome()
                    + "\nIdade: " + objProfessor.getIdade() + "\nCpf: " + objProfessor.getCpf() + "\nSiape:" + objProfessor.getSiape()
                    + "\nSexo: " + objProfessor.getSexo());
        } // if
        else {
            JOptionPane.showMessageDialog(null, "Professor não encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
     
    }
       
    public void removerAluno() {
         ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
         JOptionPane.showInputDialog(null, "Informe o RA do Aluno a ser excluido:");
            for (int i = 0; i < listaAluno.size(); i++) {
                listaAluno.remove(i);
            }
            JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!!!");
  }
    
     public void removerProfessor() {
         ArrayList<Professor> listaProfessor= new ArrayList<Professor>();
         JOptionPane.showInputDialog(null, "Informe o SIAPE do Professor a ser excluido:");
            for (int i = 0; i < listaProfessor.size(); i++) {
                listaProfessor.remove(i);
            }
            JOptionPane.showMessageDialog(null, "Professor removido com sucesso!!!");
  }
}
       
