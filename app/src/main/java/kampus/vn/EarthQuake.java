package kampus.vn;

/**
 * Created by TanNT on 1/6/18.
 */

public class EarthQuake {
    private double magnatide;
    private String locationTop;
    private String locationBottom;
    private String timeTop;
    private String timeBottom;

    public EarthQuake(double magnatide, String locationTop, String locationBottom, String timeTop, String timeBottom) {
        this.magnatide = magnatide;
        this.locationTop = locationTop;
        this.locationBottom = locationBottom;
        this.timeTop = timeTop;
        this.timeBottom = timeBottom;
    }

    public double getMagnatide() {
        return magnatide;
    }

    public void setMagnatide(double magnatide) {
        this.magnatide = magnatide;
    }

    public String getLocationTop() {
        return locationTop;
    }

    public void setLocationTop(String locationTop) {
        this.locationTop = locationTop;
    }

    public String getLocationBottom() {
        return locationBottom;
    }

    public void setLocationBottom(String locationBottom) {
        this.locationBottom = locationBottom;
    }

    public String getTimeTop() {
        return timeTop;
    }

    public void setTimeTop(String timeTop) {
        this.timeTop = timeTop;
    }

    public String getTimeBottom() {
        return timeBottom;
    }

    public void setTimeBottom(String timeBottom) {
        this.timeBottom = timeBottom;
    }
}
