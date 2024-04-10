import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;

public class Practical11_q1 extends JFrame {
    private JTextArea textArea;
    private JTextField inputField;
    private LinkedList<Integer> numberList;

    public Practical11_q1() {
        setTitle("Number List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        numberList = new LinkedList<>();

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        inputField = new JTextField();

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumberToList();
            }
        });

        JButton sortButton = new JButton("Sort");
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(numberList);
                updateTextArea();
            }
        });

        JButton shuffleButton = new JButton("Shuffle");
        shuffleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.shuffle(numberList);
                updateTextArea();
            }
        });

        JButton reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.reverse(numberList);
                updateTextArea();
            }
        });

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        buttonPanel.add(addButton);
        buttonPanel.add(sortButton);
        buttonPanel.add(shuffleButton);
        buttonPanel.add(reverseButton);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(buttonPanel, BorderLayout.SOUTH);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }

    private void addNumberToList() {
        try {
            int number = Integer.parseInt(inputField.getText());
            if (!numberList.contains(number)) {
                numberList.add(number);
                updateTextArea();
            } else {
                JOptionPane.showMessageDialog(this, "Number already exists in the list", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        inputField.setText("");
    }

    private void updateTextArea() {
        textArea.setText("");
        for (int num : numberList) {
            textArea.append(num + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Practical11_q1().setVisible(true);
            }
        });
    }
}
