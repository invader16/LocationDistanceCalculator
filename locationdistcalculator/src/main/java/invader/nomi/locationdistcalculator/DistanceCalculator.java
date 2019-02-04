package invader.nomi.locationdistcalculator;


public class DistanceCalculator {

    // radius of earth in KMS
    private static final int EARTH_RADIUS_IN_KMS = 6371;


    // logic to calculate distance between two locations
    public static float calculateDist(PlaceCoordinates startingPoint,PlaceCoordinates destinationPoint){

        double dLat = Math.toRadians(destinationPoint.getMyLatitude()
                - startingPoint.getMyLatitude());

        double dLng = Math.toRadians(destinationPoint.getMuyLongitude()
                - startingPoint.getMuyLongitude());

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(startingPoint.getMyLatitude())) *
                        Math.cos(Math.toRadians(destinationPoint.getMyLatitude())) *
                        Math.sin(dLng / 2) * Math.sin(dLng / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return (float) (EARTH_RADIUS_IN_KMS * c);


    }
}
