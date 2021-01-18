package com.example.foodexpiration;

public class FoodList
{
    String name, location;
    int month, day, year;
    boolean expiring;

    public FoodList()
    {
        name = "";
        location = "";
        month = 0;
        day = 0;
        year = 0;
        expiring = false;
    }

    public FoodList( String nameInput, String locationInput, int monthInput, int dayInput, int yearInput, boolean expiringInput )
    {
        name = nameInput;;
        location = locationInput;
        month = monthInput;
        day = dayInput;
        year = yearInput;
        expiring = expiringInput;
    }

    public void setName( String newName )
    {
        name = newName;
    }

    public void setLocation( String newLocation )
    {
        location = newLocation;
    }

    public void setMonth( int newMonth )
    {
        month = newMonth;
    }

    public void setDay( int newDay )
    {
        day = newDay;
    }

    public void setYear( int newYear )
    {
        year = newYear;
    }

    public void setExpiring( boolean newExpiring ) { expiring = newExpiring; }

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    public boolean getExpiring() { return expiring; }
}
