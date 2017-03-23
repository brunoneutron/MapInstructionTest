package com.example.neutron.mapinstructiontest.OSRMROUTEAPI;

/**
 * Created by neutron on 17. 1. 7.
 */

public class Routes {
    private String distance;

    private String duration;

    private Legs[] legs;

    private Geometry geometry;

    public String getDistance ()
    {
        return distance;
    }

    public void setDistance (String distance)
    {
        this.distance = distance;
    }

    public String getDuration ()
    {
        return duration;
    }

    public void setDuration (String duration)
    {
        this.duration = duration;
    }

    public Legs[] getLegs ()
    {
        return legs;
    }

    public void setLegs (Legs[] legs)
    {
        this.legs = legs;
    }

    public Geometry getGeometry ()
    {
        return geometry;
    }

    public void setGeometry (Geometry geometry)
    {
        this.geometry = geometry;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [distance = "+distance+", duration = "+duration+", legs = "+legs+", geometry = "+geometry+"]";
    }
}
