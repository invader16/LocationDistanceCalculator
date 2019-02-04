
[![](https://jitpack.io/v/noumanjamil16/LocationDistanceCalculator.svg)](https://jitpack.io/#noumanjamil16/LocationDistanceCalculator)


# LocationDistanceCalculator
This sample calculates distance between two locations in kilometers.

Use this dependency in your build.gradle file (app module)


	        implementation 'com.github.noumanjamil16:LocationDistanceCalculator:Tag'



// create an object of coordinates of starting location

PlaceCoordinates starting  = new PlaceCoordinates((float) -34.6037389, (float) -58.3815704);

// create an object of coordinates of destination location

PlaceCoordinates destination = new PlaceCoordinates((float) 40.6892494, (float) -74.0445004);

// distance between these two locations calculated using this method

float distance = DistanceCalculator.calculateDist(starting,destaination);
