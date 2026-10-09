
import javax.swing.*;
import java.awt.*;

public class front {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Sistema de Exames");

        janela.setSize(500, 350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        // Seja bem-vindo
        JLabel bemvsyindo = new JLabel("Seja bem-vindo");
       // bemvsyindo.setFont(new Font("Arial", Font.BOLD, 24));
        bemvsyindo.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Título
        JLabel titulo = new JLabel("SISTEMA DE EXAMES");
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Nome
        JLabel nomeLabel = new JLabel("Digite seu nome:");
        nomeLabel.setFont(new Font("Arial", Font.BOLD, 28));
        nomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Campo para digitar
        JTextField campoNome = new JTextField();
        campoNome.setMaximumSize(new Dimension(250, 40));

        // Botão
        JButton botao = new JButton("ENTRAR");
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);

        botao.addActionListener(e -> {

            String nome = campoNome.getText();

            String mensagem = Main.processarUsuario(nome);

            JOptionPane.showMessageDialog(
                    janela,
                    mensagem
            );
        });

        // Adicionando os componentes ao painel
        painel.add(Box.createVerticalStrut(30));

        painel.add(bemvsyindo);

        painel.add(Box.createVerticalStrut(20));

        painel.add(titulo);

        painel.add(Box.createVerticalStrut(30));

        painel.add(nomeLabel);

        painel.add(Box.createVerticalStrut(10));

        painel.add(campoNome);

        painel.add(Box.createVerticalStrut(30));

        painel.add(botao);

        // Coloca o painel na janela
        janela.add(painel);

        janela.setVisible(true);
    }
}