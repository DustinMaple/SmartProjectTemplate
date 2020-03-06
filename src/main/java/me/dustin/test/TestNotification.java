package me.dustin.test;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import me.dustin.test.MyNotification;
import org.jetbrains.annotations.NotNull;

public class TestNotification extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        MyNotification notification = new MyNotification();
        notification.notify("Notify Error 1", 1);
        notification.notify("Notify Error 2", 2);
        notification.notify("Notify Error 3", 3);
    }
}
