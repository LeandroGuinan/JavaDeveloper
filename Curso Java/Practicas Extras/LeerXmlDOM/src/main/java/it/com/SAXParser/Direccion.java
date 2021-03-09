package it.com.SAXParser;

public class Direccion {
    
    /*
    se crea una clasica clase de entidad, pero sin nececidad de ser un bean
    */
    private String latitude;
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Direccion{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
    }
}
