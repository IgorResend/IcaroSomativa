package Aula01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formativa extends JFrame {
    private JButton cancelarButton;
    private JButton cadastrarButton1;
    private JPasswordField textoLogin;
    private JPasswordField textoUsuário;
    private JPasswordField textoSenha;
    private JPasswordField textoSenha2;
    private JFormattedTextField textoNome;
    private JPanel painelLogin;
    private JFrame frame;

    public Formativa() throws HeadlessException {
        frame = new JFrame("Illusion Streaming");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 350));
        frame.setResizable(false);
        frame.add(painelLogin);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        cadastrarButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textoLogin.getText().equals("Jorge") && textoSenha.getText().equals("Senai")) {
                    // Se as credenciais estiverem corretas, abra a TelaPrincipal
                    TelaPrincipal telaPrincipal = new TelaPrincipal();
                    telaPrincipal.setVisible(true);
                    // Fechar a tela atual (opcional)
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Criando uma instância de Formativa para exibir a tela de login
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Formativa();
            }
        });
    }
}



