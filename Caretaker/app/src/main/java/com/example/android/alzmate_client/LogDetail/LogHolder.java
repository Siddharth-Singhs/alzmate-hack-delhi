package com.example.android.alzmate_client.LogDetail;


public class LogHolder {
    private String ImageLocation;
    private String date;
    private String time;
    private String longitude;
    private String latitude;
    public LogHolder(String ImageLocation,String date,String time)
    {
        this.ImageLocation=ImageLocation;
        this.date=date;
        this.time=time;
    }
    public LogHolder(String ImageLocation,String date,String time,String longitude,String latitude)
    {
        this.ImageLocation=ImageLocation;
        this.date=date;
        this.time=time;
        this.latitude=latitude;
        this.longitude=longitude;
    }
    public String  getImageLocation()
    {
        return ImageLocation;
    }
    public String getDate()
    {
        return date;
    }
    public String getTime()
    {
        return time;
    }
    public String getLongitude()
    {
        return longitude;
    }
    public String getLatitude()
    {
        return latitude;
    }
}
