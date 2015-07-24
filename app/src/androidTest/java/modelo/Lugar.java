package modelo;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.Vector;

/**
 * Created by JD on 23/07/2015.
 */
@ParseClassName("Lugar")
public class Lugar extends ParseObject {
    String ID;
    String name;
    Info info;
    Evento[] evs;

    public Evento[] getEvs() {
        return (Evento[])get("Evento");
    }

    public void setEvs(Vector evs) {
        put("Evento", evs);
    }

    public String getID() {
        return getString("ID");
    }

    public void setID(String ID) {
        put("ID",ID);
    }

    public Info getInfo() {
        return (Info)get("Info");
    }


    public void setInfo(Info info) {
        put("Info",info);
    }

    public String getName() {
        return getString("Name");
    }

    public void setName(String name) {
        put("Name",name);
    }
}
