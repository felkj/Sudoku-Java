package br.com.felkj.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FinishGameButton extends JButton {

    public FinishGameButton(ActionListener actionListener) {
        this.setText("Concluir");
        this.addActionListener(actionListener);
    }
}
