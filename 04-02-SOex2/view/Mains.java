package view;

import javax.swing.JOptionPane;

import controller.Mate;

public class Mains {

	public static void main(String[] args) {
		
		int opc_menu = 0;
        do{
            opc_menu = Integer.parseInt(JOptionPane.showInputDialog("                   MENU PRINCIPAL\n\n 1- pid\n 0- Sair\n\n"));
            switch (opc_menu){
                case 1: pid(); break;
                case 0: JOptionPane.showMessageDialog(null, "Sistema Finalizado!","Finalizado",JOptionPane.INFORMATION_MESSAGE); break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida para o Menu Principal.", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }while (opc_menu != 0);
		
	}
	static void pid(){
		Mate mate = new Mate();
		String process = "TASKLIST /FO TABLE";
		mate.readProcess(process);
		int opc_menu = 0;
        do{
            opc_menu = Integer.parseInt(JOptionPane.showInputDialog("                   MENU PRINCIPAL\n\n 1- kill\n 0- Sair\n\n"));
            switch (opc_menu){
                case 1: kill(); break;
                case 0: JOptionPane.showMessageDialog(null, "Sistema Finalizado!","Finalizado",JOptionPane.INFORMATION_MESSAGE); break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida para o Menu Principal.", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }while (opc_menu != 0);
    }
	static void kill(){
		Mate mate = new Mate();
		String kill;
	    StringBuilder mensagem = new StringBuilder();

	    kill = JOptionPane.showInputDialog("Digite seu nome:");
	    JOptionPane.showMessageDialog(null, mensagem);
		String param = kill; //mata um processo
		mate.killProcess(param);
		mensagem.append("A aplicação ").append(kill).append(" foi morta");
	    JOptionPane.showMessageDialog(null, mensagem);
    }
	
}
