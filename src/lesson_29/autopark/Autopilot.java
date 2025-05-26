package lesson_29.autopark;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.05.2025
 */

public class Autopilot {

    private String softwareVersion;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        return String.format("Autopilot: {SV: %s}", softwareVersion) ;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
