package me.dustin.ui.commonUI;

import com.intellij.ui.EditorTextField;

import javax.swing.*;
import java.awt.*;

public class NamedTextFieldPanel extends JPanel {
    public NamedTextFieldPanel(String name) {
        this(name, name);
    }

    public NamedTextFieldPanel(String name, String valueName) {
        super(new BorderLayout());

        // label
        JLabel label = new JLabel(name);
        label.setPreferredSize(new Dimension(100, 100));

        // content
        EditorTextField textField = new EditorTextField();
        textField.setName(valueName);
        textField.setPreferredSize(new Dimension(100, 100));

        this.add(label, BorderLayout.WEST);
        this.add(textField, BorderLayout.EAST);
    }
}
