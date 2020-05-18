package java.prototype;

public class Coordinate {

    private String hemisphere;
    private String longitude;
    private String latitude;

    public Coordinate(String hemisphere, String longitude, String latitude) {
        this.hemisphere = hemisphere;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getHemisphere() {
        return hemisphere;
    }

    public void setHemisphere(String hemisphere) {
        this.hemisphere = hemisphere;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "prototype.Coordinate{" +
                "hemisphere='" + hemisphere + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }
}
