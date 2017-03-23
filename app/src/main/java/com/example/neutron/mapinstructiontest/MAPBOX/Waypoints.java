package com.example.neutron.mapinstructiontest.MAPBOX;

/**
 * Created by neutron on 17. 1. 9.
 */

public class Waypoints {
    private String[] location;

    private String name;

    public String[] getLocation ()
    {
        return location;
    }

    public void setLocation (String[] location)
    {
        this.location = location;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [location = "+location+", name = "+name+"]";
    }
}
