package factory;

public class Flutter {
    private OperatingPlatform operatingPlatform;

    public Flutter(OperatingPlatform operatingPlatform) {
        this.operatingPlatform = operatingPlatform;
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.createUIFactory(this.operatingPlatform);
    }
}
