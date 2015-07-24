package modelo;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by JD on 23/07/2015.
 */
@ParseClassName("Info")
public class Info extends ParseObject{

    String ID,address, description, horario;
    Producto[] productos;
    Boolean tarjetaCredito, reserva, outdoor;

    public String getAddress() {
        return getString("Address");
    }

    public void setAddress(String address) {
        put("Address", address);
    }

    public String getDescription() {
        return getString("Description");
    }

    public void setDescription(String description) {
        put("Description", description);
    }

    public String getHorario() {
        return getString("Horario");
    }

    public void setHorario(String horario) {
        put("Horario", horario);
    }

    public String getID() {
        return getString("ID");
    }

    public void setID(String ID) {
        put("ID", ID);
    }

    public Boolean getOutdoor() {
        return (Boolean)get("Outdoor");
    }

    public void setOutdoor(Boolean outdoor) {
        put("Outdoor", outdoor);
    }

    public Producto[] getProductos() {
        return (Producto[])get("Producto");
    }

    public void setProducto(Producto producto) {
        put("Producto", producto);
    }

    public Boolean getReserva() {
        return (Boolean)get("Reserva");
    }

    public void setReserva(Boolean reserva) {
        put("Reserva", reserva);
    }

    public Boolean getTarjetaCredito() {
        return (Boolean)get("TarjetaCredito");
    }

    public void setTarjetaCredito(Boolean tarjetaCredito) {
        put("TarjetaCredito", tarjetaCredito);
    }
}
