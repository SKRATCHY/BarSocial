package modelo;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by JD on 23/07/2015.
 */

@ParseClassName("Producto")
public class Producto extends ParseObject {
    String ID;
    String name;
    String tipo;
    Double precio;
    String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setID(String ID) {
        put("ID",ID);
    }
    public String getID() {
        return getString("ID");
    }

    public String getName() {
        return getString("Name");
    }

    public void setName(String name) {
        put("Name",name);
    }

    public Double getPrecio() {
        return getDouble("Price");
    }

    public void setPrecio(Double precio) {
        put("Price",precio);
    }

    public String getTipo() {
        return getString("Tipo");
    }

    public void setTipo(String tipo) {
        put("Tipo",tipo);
    }


}
