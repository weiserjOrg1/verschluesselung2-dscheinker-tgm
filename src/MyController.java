import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivateKey;

//Implementierung der Klasse MyView und MyModel

public class MyController implements ActionListener {
    private MyView v;
    private MyModel m;

    public MyController() {
        this.m = new MyModel();
        this.v = new MyView(this);

    }


    @Override
    
   // Klarstellung auf die Interaktion auf Aktionen/Events
    
    public void actionPerformed(ActionEvent e) {
        if (v.getShiftRadioButton() == e.getSource()) {
            v.getSecret().setEnabled(false);
            v.getShift().setEnabled(true);
        }
        if (v.getSecretRadioButton() == e.getSource()) {
            v.getShift().setEnabled(false);
            v.getSecret().setEnabled(true);
        }
        if (v.getEncryptButton() == e.getSource()) {
            if (this.v.getShiftRadioButton().isSelected()) {
                m.setAbc(new ShiftCipher(Integer.parseInt(v.getShift().getText())));
            } else {
                m.setAbc(new SubstitutionCipher(v.getSecret().getText()));
            }

            this.v.getOutput().setText(this.m.getAbc().encrypt(this.v.getInput().getText()));
           
        }
        if(v.getDecryptCheckBox().isSelected()) {
        	this.v.getOutput().setText(this.m.getAbc().decrypt(this.v.getInput().getText()));
        }
    }
    public static void main(String[] args) {
        MyController c = new MyController();
    }
   
}