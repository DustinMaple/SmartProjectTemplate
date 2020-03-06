package me.dustin.test;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;

public class MyNotification {
    // 右下角显示错误
    private final NotificationGroup GROUP_RD = new NotificationGroup("error", NotificationDisplayType.BALLOON, true);
    private final NotificationGroup GROUP_SB = new NotificationGroup("error", NotificationDisplayType.STICKY_BALLOON, true);
    private final NotificationGroup GROUP_TW = new NotificationGroup("error", NotificationDisplayType.TOOL_WINDOW, true);


    public Notification notify(String content, int type) {
        return this.notify(null, content, type);
    }

    private Notification notify(Project project, String content, int type) {
        final Notification notification;
        switch (type) {
            case 2:
                notification = GROUP_SB.createNotification(content, NotificationType.ERROR);
                break;
            case 3:
                notification = GROUP_TW.createNotification(content, NotificationType.ERROR);
                break;
            default:
                notification = GROUP_RD.createNotification(content, NotificationType.ERROR);
        }

        notification.notify(project);
        return notification;
    }
}
