package Menu;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Cliente.Pessoa;

public class Menu {

    public void menuInicial(){
        Pessoa pessoa = new Pessoa();
        //Lista de nomes de usuários do sistema 
        List<String> nomesAss = new ArrayList<>();
        nomesAss.add("Carlos Augusto");
   

        

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        pessoa.setNome(nome);
     
        System.out.println(pessoa.getNome());
    }
}
