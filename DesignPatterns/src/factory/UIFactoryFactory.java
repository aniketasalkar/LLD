package factory;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(OperatingPlatform operatingPlatform) {
        try {
            if (operatingPlatform == OperatingPlatform.ANDROID) {
                return new AndroidUI();
            } else if (operatingPlatform == OperatingPlatform.IOS) {
                return new IosUI();
            }
        }
        catch (Exception e) {
            System.out.println("Error creating UIFactory.");
            System.out.println("Unsupported: " + operatingPlatform);
            System.exit(1);
        }
        return null;
    }
}
