package factory;

import factory.Menus.Menu;
import factory.buttons.Button;
import factory.panels.Panel;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Panel createPanel();
}
