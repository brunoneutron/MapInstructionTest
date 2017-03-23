package com.example.neutron.mapinstructiontest.OSRMROUTEAPI;

/**
 * Created by neutron on 17. 1. 7.
 */

public class OSRMROUTE {
    private Routes[] routes;

    private Waypoints[] waypoints;

    private String code;

    public Routes[] getRoutes ()
    {
        return routes;
    }

    public void setRoutes (Routes[] routes)
    {
        this.routes = routes;
    }

    public Waypoints[] getWaypoints ()
    {
        return waypoints;
    }

    public void setWaypoints (Waypoints[] waypoints)
    {
        this.waypoints = waypoints;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [routes = "+routes+", waypoints = "+waypoints+", code = "+code+"]";
    }
}
