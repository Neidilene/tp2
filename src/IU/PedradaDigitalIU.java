package IU;

import javax.swing.*;
import java.awt.*;
public class PedradaDigitalIU extends JFrame {

        public static void main (String args[]){
            JFrame janela = new JFrame("POO 23/24 - Trabalho prático 2");
            janela.setVisible(true);
            janela.setSize(500, 500);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setLayout(new java.awt.BorderLayout());

            JLabel titulo = new JLabel("Rede Social- PedradaDigital", JLabel.CENTER);
            titulo.setOpaque(true);
            titulo.setBackground(Color.LIGHT_GRAY);
            JLabel mensagem = new JLabel("Mensagem",JLabel.CENTER);


            JPanel contentorText = new JPanel();
            JTextArea jt = new JTextArea(45,150);
            jt.setLineWrap(true);
            jt.setWrapStyleWord(true);
            contentorText.add(jt);


            JPanel barrastatus = new JPanel();
            barrastatus.add(new JLabel("Pedradadigital > "));
            barrastatus.add(new JTextField(130));
            barrastatus.setBackground(Color.GRAY);
            contentorText.add(barrastatus);

            janela.add(titulo, BorderLayout.NORTH);
            janela.add(mensagem,BorderLayout.SOUTH);
            janela.add(contentorText,BorderLayout.CENTER);
            janela.setVisible(true);


            JPanel contentorBtn = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(2, 10, 2, 10);

            JButton loginBtn = new JButton("Login");
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 0.0;

            contentorBtn.add( loginBtn, gbc);

            JButton executarBtn = new JButton("Executar");
            gbc.gridx = 0;
            gbc.gridy = 1;
            contentorBtn.add( executarBtn, gbc);

            JButton logoutBtn = new JButton("Logout");
            gbc.gridx = 0;
            gbc.gridy = 2;
            contentorBtn.add(logoutBtn, gbc);
            janela.add(contentorBtn, BorderLayout.EAST);
            janela.setVisible(true);


        }

    }


