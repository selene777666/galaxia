package repositorio;



import javax.swing.JOptionPane;
public class Repositorio {


    public static void main(String[] args) {
       String nome;
        int Idade;
        Idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));

nome=JOptionPane.showInputDialog("Digite o nome do aluno:");

JOptionPane.showMessageDialog(null, "Nome:" +nome);
JOptionPane.showMessageDialog(null, "Idade:" +  Idade);
    }
    
}
