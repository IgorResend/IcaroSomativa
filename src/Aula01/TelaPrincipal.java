package Aula01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        // Configurações da janela
        setTitle("Seleção de Filmes e Séries");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Lista de filmes e séries
        String[] items = {"Opções", "Filmes", "Séries"};

        // Caixa de opções (JComboBox)
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Label para exibir a seleção
        JLabel selectedLabel = new JLabel("Selecione um filme ou série");

        // Botão de confirmação
        JButton selectButton = new JButton("Selecionar");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quando o botão é clicado, cria e exibe a TelaFilme
                TelaFilme telaFilme = new TelaFilme();
                telaFilme.setVisible(true);
                // Fecha a TelaPrincipal (opcional)
                dispose();
            }
        });

        // Painel para organizar os componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(comboBox);
        panel.add(selectButton);
        panel.add(selectedLabel);

        // Adiciona o painel à janela e deixa ele visível
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal());
    }
}



