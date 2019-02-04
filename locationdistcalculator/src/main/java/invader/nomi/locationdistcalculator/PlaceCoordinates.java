package invader.nomi.locationdistcalculator;

public class PlaceCoordinates {

    // latitude point of location
    private float myLatitude;
    // longitude points of location
    private float myLongitude;



    // create an object of place that can be destination
    public PlaceCoordinates(float myLatitude, float myLongitude){
        this.myLatitude = myLatitude;
        this.myLongitude = myLongitude;
    }

    public float getMuyLongitude() {
        return myLongitude;
    }

    public void setMyLongitude(float myLongitude) {
        this.myLongitude = myLongitude;
    }

    public float getMyLatitude() {
        return myLatitude;
    }

    public void setMyLatitude(float myLatitude) {
        this.myLatitude = myLatitude;
    }
}
