package modelo;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by JD on 23/07/2015.
 */
@ParseClassName("Evento")
public class Evento extends ParseObject {

    String ID,name,description,lugar;
    ParseGeoPoint location;
    Date date;

    public Date getDate() {
        return (Date)get("Date");
    }

    public void setDate(Date date) {
        put("Date", date);
    }

    public String getDescription() {
        return getString("Description");
    }

    public void setDescription(String description) {
        put("Description", description);
    }

    public String getID() {
        return getString("ID");
    }

    public void setID(String ID) {
        put("ID",ID);
    }

    public ParseGeoPoint getLocation() {
        return (ParseGeoPoint)get("Location");
    }

    public void setLocation(ParseGeoPoint location) {
        put("Location", location);
    }

    public String getLugar() {
        return getString("Lugar");
    }

    public void setLugar(String lugar) {
        put("Lugar", lugar);
    }

    public String getName() {
        return getString("Name");
    }

    public void setName(String name) {
        put("Name", name);
    }

}
