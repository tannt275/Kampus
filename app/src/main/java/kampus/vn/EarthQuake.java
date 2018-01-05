package kampus.vn;


public class EarthQuake {

    /**
     * Magnitude of the earthquake
     */
    private String mMagnitude;
    /**
     * Location of the earthquake
     */
    private String mLocation;
    /**
     * Date of the earthquake
     */
    private String mDate;

    /**
     * Constructs a new {@link EarthQuake} object
     *
     * @param magnitude is magnitude of the earthquake
     * @param location  is the city location of the earthquake
     * @param date      is the date the earthquake  happened
     */

    public EarthQuake(String magnitude, String location, String date) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }
}
