package udea.edu.co.barsocial.modelo;

import android.util.EventLogTags;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by JD on 23/07/2015.
 */

@ParseClassName("ProductoDao")
public class ProductoDao extends ParseObject {
    String ID;
    String name;
    String tipo;
    Double precio;
    String description,IDlugar;

    public String getIDlugar() {
        IDlugar=getString("IDlugar");
        return IDlugar;
    }

    public void setIDlugar(String IDlugar) {
        this.IDlugar = IDlugar;
        put("IDlugar",IDlugar);
    }

    public String getDescription() {
        description=getString("Description");
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        put("Descrption",description);
    }

    public void setID(String ID) {
        this.ID=ID;
        put("ID",ID);
    }
    public String getID() {
        ID=getString("ID");
        return ID;
    }

    public String getName() {
        name=getString("Name");
        return name;
    }

    public void setName(String name) {
        this.name=name;
        put("Name",name);
    }

    public Double getPrecio() {
        this.precio=getDouble("Price");
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio=precio;
        put("Price",precio);
    }

    public String getTipo() {
        tipo=getString("Tipo");
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo=tipo;
        put("Tipo",tipo);
    }


}
