package me.dustin.ui.create;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import me.dustin.ui.commonUI.NamedTextFieldPanel;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;

public class NewTemplatePanel extends DialogWrapper {
    public NewTemplatePanel() {
        super(true); // use current window as parent
        init();
        setTitle("NewTemplate");
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());
        NamedTextFieldPanel name = new NamedTextFieldPanel("name");
        dialogPanel.add(name, BorderLayout.NORTH);
        dialogPanel.add(new NamedTextFieldPanel("name2"), BorderLayout.NORTH);
        dialogPanel.add(new NamedTextFieldPanel("name3"), BorderLayout.CENTER);

        return dialogPanel;
    }

    @Override
    protected void doOKAction() {
        Messages.showMessageDialog("Hello World !", "Information", Messages.getInformationIcon());
        this.close(1);
    }
}
