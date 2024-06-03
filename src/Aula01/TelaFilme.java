package Aula01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFilme extends JFrame {
    private JTextField tituloField;
    private JTextField diretorField;
    private JTextField anoField;
    private JTextField duracaoField;
    private JComboBox<String> categoriaComboBox;
    private JButton adicionarButton;

    public TelaFilme() {
        setTitle("Adicionar Filme");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(6, 2));

        // Inicializando os componentes
        tituloField = new JTextField();
        diretorField = new JTextField();
        anoField = new JTextField();
        duracaoField = new JTextField();

        String[] categorias = {"Ação", "Comédia", "Drama", "Terror", "Romance", "Ficção Científica", "Animação", "Documentário"};
        categoriaComboBox = new JComboBox<>(categorias);

        adicionarButton = new JButton("Adicionar");

        // Adicionando os componentes ao frame
        add(new JLabel("Título:"));
        add(tituloField);
        add(new JLabel("Diretor:"));
        add(diretorField);
        add(new JLabel("Ano:"));
        add(anoField);
        add(new JLabel("Duração:"));
        add(duracaoField);
        add(new JLabel("Categoria:"));
        add(categoriaComboBox);
        add(new JLabel("")); // Placeholder
        add(adicionarButton);

        // Adicionando ação ao botão
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = tituloField.getText();
                String diretor = diretorField.getText();
                String ano = anoField.getText();
                String duracao = duracaoField.getText();
                String categoria = (String) categoriaComboBox.getSelectedItem();

                // Exibindo os dados coletados (em um sistema real, você armazenaria esses dados)
                JOptionPane.showMessageDialog(null, "Filme Adicionado:\n" +
                        "Título: " + titulo + "\n" +
                        "Diretor: " + diretor + "\n" +
                        "Ano: " + ano + "\n" +
                        "Duração: " + duracao + "\n" +
                        "Categoria: " + categoria);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaFilme().setVisible(true);
            }
        });
    }
}
