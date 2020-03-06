package me.dustin.test;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;

public class SampleDialogWrapper extends DialogWrapper {

    public SampleDialogWrapper() {
        super(true); // use current window as parent
        init();
        setTitle("Test DialogWrapper");
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("testing");
        label.setPreferredSize(new Dimension(100, 100));
        dialogPanel.add(label, BorderLayout.CENTER);

        return dialogPanel;
    }

    @Override
    protected void doOKAction() {
        Messages.showMessageDialog("Hello World !", "Information", Messages.getInformationIcon());
        this.close(1);
    }
}
