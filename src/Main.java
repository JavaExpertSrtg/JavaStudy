import com.idea.manage.ProjectManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.idea.window.WelcomeWindow;

import javax.swing.*;
import java.io.IOException;

/**
 * 启动程序，整个程序的入口
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, UnsupportedLookAndFeelException {
        // 加载项目
        ProjectManager.loadProjects();
        // 加载皮肤
        UIManager.setLookAndFeel(new FlatDarkLaf());
        // 初始化窗口
        WelcomeWindow startWindow = new WelcomeWindow();
        startWindow.openWindow();
    }
}