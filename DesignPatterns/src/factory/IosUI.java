package factory;

import factory.Menus.IOSMenu;
import factory.Menus.Menu;
import factory.buttons.Button;
import factory.buttons.IOSButton;
import factory.panels.IOSPanel;
import factory.panels.Panel;

public class IosUI implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Panel createPanel() {
        return new IOSPanel();
    }
}
