package factory;

import factory.Menus.Menu;
import factory.buttons.Button;
import factory.panels.Panel;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(OperatingPlatform.ANDROID);

        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
        button.generateButton();

        Menu menu = uiFactory.createMenu();
        menu.generateMenu();

        Panel panel = uiFactory.createPanel();
        panel.generatePanel();

    }
}