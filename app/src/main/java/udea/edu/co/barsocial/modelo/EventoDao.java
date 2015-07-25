package udea.edu.co.barsocial.modelo;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by JD on 23/07/2015.
 */
@ParseClassName("EventoDao")
public class EventoDao extends ParseObject {

    String ID,name,description, IDlugar;
    ParseGeoPoint location;
    Date date;

    public Date getDate() {
        this.date=(Date)get("Date");
        return date;
    }

    public void setDate(Date date) {
        this.date=date;
        put("Date", date);
    }

    public String getDescription() {
        this.description=getString("Description");
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
        put("Description", description);
    }

    public String getID() {
        ID=getString("ID");
        return ID;
    }

    public void setID(String ID) {
        this.ID=ID;
        put("ID",ID);
    }

    public ParseGeoPoint getLocation() {
        location=(ParseGeoPoint)get("Location");
        return location;
    }

    public void setLocation(ParseGeoPoint location) {
        this.location=location;
        put("Location", location);
    }

    public String getIDlugar() {
        IDlugar =getString("LugarDao");
        return IDlugar;
    }

    public void setIDlugar(String IDlugar) {
        this.IDlugar = IDlugar;
        put("LugarDao", IDlugar);
    }

    public String getName() {
        name=getString("Name");
        return name;
    }

    public void setName(String name) {
        this.name=name;
        put("Name", name);
    }

}
