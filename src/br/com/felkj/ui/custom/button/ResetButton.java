package br.com.felkj.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    public ResetButton(ActionListener actionListener) {
        this.setText("Resetar");
        this.addActionListener(actionListener);
    }
}
