package com.example.locationhelpermodule;

import android.location.Location;

public class LocationHelperModuleClass {

    public static float getDistanceInKM(double startLatitude, double startLongitude, double endLatitude, double endLongitude)
    {
        float [] result = new float[0];
        Location.distanceBetween(startLatitude,startLongitude, endLatitude, endLongitude, result);
        return result[0]/1000;
    }

}
