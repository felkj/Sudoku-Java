package br.com.felkj.ui.custom.panel;

import br.com.felkj.ui.custom.input.NumberText;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.List;

import static java.awt.Color.black;

public class SudokuSector extends JPanel {


    public SudokuSector(final List<NumberText> textField) {
        var dimension = new Dimension(170, 170);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setBorder(new LineBorder(black, 2, true));
        this.setVisible(true);
        textField.forEach(this::add);
    }
}
