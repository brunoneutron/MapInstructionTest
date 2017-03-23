package com.example.neutron.mapinstructiontest.MAPBOX;

/**
 * Created by neutron on 17. 1. 9.
 */

public class MAPBOXAPI {
    private Routes[] routes;

    private String code;

    private Waypoints[] waypoints;

    public Routes[] getRoutes ()
    {
        return routes;
    }

    public void setRoutes (Routes[] routes)
    {
        this.routes = routes;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public Waypoints[] getWaypoints ()
    {
        return waypoints;
    }

    public void setWaypoints (Waypoints[] waypoints)
    {
        this.waypoints = waypoints;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [routes = "+routes+", code = "+code+", waypoints = "+waypoints+"]";
    }
}
