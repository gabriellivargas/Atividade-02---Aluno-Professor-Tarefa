/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_aluno_professor;

import javax.swing.JOptionPane;

/**
 *
 * @author GABRIELLI
 */
public class Main {
   
   public static void main(String[] args) {

        int OpcaoMenu;      
        EntradaDeDados ed = new EntradaDeDados();

        do { // loop para menu de opções

            OpcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma Opção: \n\n"
                    + "Opção 1: Cadastrar Aluno \n"
                    + "Opção 2: Cadastrar Professor \n"
                    + "Opção 3: Pesquisar Aluno \n"
                    + "Opção 4: Pesquisar Professor \n"
                    + "Opção 5: Excluir Aluno \n"
                    + "Opção 6: Excluir Professor \n"
                    + "Opção 7: SAIR \n\n", "Menu de Opções", JOptionPane.PLAIN_MESSAGE));


            switch (OpcaoMenu) { // switch avalia opção do operador

                case 1: // cadastrar aluno
                   ed.salvarAluno();

                    break;
                case 2: // cadastrar professor
                    ed.salvarProfessor();
                    break;
                case 3:
                    ed.exibirAluno();
                    break;
                case 4:
                    ed.exibirProfessor();
                    break;
                case 5: 
                    ed.removerAluno();
                    break;
                case 6:
                    ed.removerProfessor();
                    
                    break;
                case 7: // sair do programa
                    break;
                default: // opção inválida
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "Aviso", JOptionPane.ERROR_MESSAGE);
                    break;
            }        
        } while (OpcaoMenu != 7);
    }
}

