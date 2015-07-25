package udea.edu.co.barsocial.modelo;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

import java.util.Vector;

/**
 * Created by JD on 23/07/2015.
 */
@ParseClassName("LugarDao")
public class LugarDao extends ParseObject {
    String ID;
    String name;
    String categoria;
    ProductoDao[] productos;
    EventoDao[] eventos;
    ParseGeoPoint location;
    InfoDao info;

    public InfoDao getInfo() {
        info=(InfoDao)get("InfoDao");
        return info;
    }

    public void setInfo(InfoDao info) {
        this.info = info;
        put("InfoDao",info);
    }

    public ParseGeoPoint getLocation() {
        location=(ParseGeoPoint)get("Location");
        return location;
    }

    public void setLocation(ParseGeoPoint location) {
        this.location=location;
        put("Location", location);
    }

    public EventoDao[] getEventos() {
        return eventos;
    }

    public void setEventos(EventoDao[] eventos) {
        this.eventos = eventos;
    }

    public ProductoDao[] getProductos() {
        return productos;
    }

    public void setProductos(ProductoDao[] productos) {
        this.productos = productos;
    }

    public String getCategoria() {
        categoria=getString("Categoria");
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        put("Categoria",categoria);
    }

    public String getID() {
        ID=getString("ID");
        return ID;
    }

    public void setID(String ID) {
        this.ID=ID;
        put("ID",ID);
    }


    public String getName() {
        name=getString("Name");
        return name;
    }

    public void setName(String name) {
        this.name=name;
        put("Name",name);
    }

}
