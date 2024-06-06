package factory;

import factory.Menus.AndroidMenu;
import factory.Menus.Menu;
import factory.buttons.AndriodButton;
import factory.buttons.Button;
import factory.panels.AndroidPanel;
import factory.panels.Panel;

public class AndroidUI implements UIFactory{
    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Panel createPanel() {
        return new AndroidPanel();
    }
}
