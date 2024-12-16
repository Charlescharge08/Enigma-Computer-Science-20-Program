package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public JFrame() {
        panel = new JPanel();
        label = new JLabel("Enter the text:");
        textField = new JTextField(20);
        button = new JButton("Encode/Decode");
        textArea = new JTextArea(10, 20);
        scrollPane = new JScrollPane(textArea);

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(scrollPane);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String encodedText = EnigmaCodeDecode.encodeDecode(text);
                textArea.setText(encodedText);
            }
        });

        add(panel);
        setTitle("Enigma Code Decode Program");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}