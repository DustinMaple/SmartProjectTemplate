package me.dustin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKey;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.newvfs.impl.VirtualDirectoryImpl;
import com.intellij.psi.DummyHolderViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.SingleRootFileViewProvider;
import com.intellij.psi.impl.source.PsiPlainTextFileImpl;
import me.dustin.test.SampleDialogWrapper;
import me.dustin.ui.create.NewTemplatePanel;
import org.jetbrains.annotations.NotNull;

public class NewTemplateAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        VirtualDirectoryImpl virtualFile = (VirtualDirectoryImpl) e.getDataContext().getData("virtualFile");
        System.out.println(virtualFile == null);
        if (virtualFile != null) {
            System.out.println(virtualFile.isDirectory());

            if (virtualFile.isDirectory()) {
//                PsiFile file = new PsiPlainTextFileImpl(new SingleRootFileViewProvider());
//                virtualFile.add()
            }
        }
        new NewTemplatePanel().showAndGet();
    }
}
