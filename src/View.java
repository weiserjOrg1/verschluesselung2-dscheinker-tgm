import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JTextField input, secret, shift;
    private JRadioButton secretRadioButton, shiftRadioButton;
    private JLabel output;
    private JCheckBox decryptCheckBox;
    private JButton encryptButton;


    public View(Controller c) {
    	
    
      //Ersttelung des später angezeigten Fensters
    	
        this.setTitle("Verschluesselung");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        
    	Container middle = new Container();
        middle.setLayout(new GridLayout(4, 2, 5, 5));
        middle.add(decryptCheckBox);
        middle.add(secretRadioButton);
        middle.add(shiftRadioButton);
        middle.add(output);
        middle.add(input);
        middle.add(shift);
        middle.add(secret);
        
        
        this.decryptCheckBox = new JCheckBox("Decrypt");
        ButtonGroup b = new ButtonGroup();
        b.add(secretRadioButton);
        b.add(shiftRadioButton);
        
        this.secretRadioButton = new JRadioButton("Secret");
        this.shiftRadioButton = new JRadioButton("Shift");
        this.encryptButton = new JButton("Encrypt");
        
        this.input = new JTextField("Input");
        this.secret = new JTextField("Input");
        this.shift = new JTextField("Input");
        
        this.output = new JLabel("Output");
 

        this.setLayout(new BorderLayout());
        this.add(encryptButton, BorderLayout.SOUTH);
        this.add(middle, BorderLayout.CENTER);

        
        secretRadioButton.addActionListener(c);
        encryptButton.addActionListener(c);
        shiftRadioButton.addActionListener(c);
       

        this.setVisible(true);
    }
    
    
    // Einfache set-get Methoden
    
    
    public void setOutput(JLabel output) {
        this.output = output;
    }
    public JLabel getOutput() {
        return output;
    }

   
    
    
    
    
    public void setInput(JTextField input) {
        this.input = input;
    }
    public JTextField getInput() {
        return input;
    }

    
    
    
    
    
  
   

    public void setSecret(JTextField secret) {
        this.secret = secret;
    }
    public JTextField getSecret() {
        return secret;
    }

    
    
    
    
    
    public void setShift(JTextField shift) {
        this.shift = shift;
    }
    public JTextField getShift() {
        return shift;
    }

    

    
    
    
    
    public void setSecretRadioButton(JRadioButton secretRadioButton) {
        this.secretRadioButton = secretRadioButton;
    }
    public JRadioButton getSecretRadioButton() {
        return secretRadioButton;
    }

    
    
    
    
    
    
    public void setShiftRadioButton(JRadioButton shiftRadioButton) {
        this.shiftRadioButton = shiftRadioButton;
    }
    public JRadioButton getShiftRadioButton() {
        return shiftRadioButton;
    }

    
    
    
    
    
    public void setDecryptCheckBox(JCheckBox decryptCheckBox) {
        this.decryptCheckBox = decryptCheckBox;
    }
    public JCheckBox getDecryptCheckBox() {
        return decryptCheckBox;
    }

   
    
    
    
    
    
    public void setEncryptButton(JButton bencrypt) {
        this.encryptButton = bencrypt;
    }
    public JButton getEncryptButton() {
        return encryptButton;
    }

    
}