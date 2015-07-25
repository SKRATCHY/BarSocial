package udea.edu.co.barsocial.modelo;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by JD on 23/07/2015.
 */
@ParseClassName("InfoDao")
public class InfoDao extends ParseObject{

    String ID,address, description, horario,IDlugar;
    Boolean tarjetaCredito, reserva, outdoor;

    public String getIDlugar() {
        this.IDlugar=getString("IDlugar");
        return IDlugar;
    }

    public void setIDlugar(String IDlugar) {
        this.IDlugar = IDlugar;
        put("IDlugar",IDlugar);
    }

    public String getAddress() {
        this.address=getString("Address");
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
        put("Address", address);
    }

    public String getDescription() {
        this.description=getString("Description");
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
        put("Description", description);
    }

    public String getHorario() {
        horario=getString("Horario");
        return horario;
    }

    public void setHorario(String horario) {
        this.horario=horario;
        put("Horario", horario);
    }

    public String getID() {
        ID=getString("ID");
        return ID;
    }

    public void setID(String ID) {
        this.ID=ID;
        put("ID", ID);
    }

    public Boolean getOutdoor() {
        outdoor=(Boolean)get("Outdoor");
        return outdoor;
    }

    public void setOutdoor(Boolean outdoor) {
        this.outdoor=outdoor;
        put("Outdoor", outdoor);
    }

    public Boolean getReserva() {
        reserva=(Boolean)get("Reserva");
        return reserva;
    }

    public void setReserva(Boolean reserva) {
        this.reserva=reserva;
        put("Reserva", reserva);
    }

    public Boolean getTarjetaCredito() {
        tarjetaCredito=(Boolean)get("TarjetaCredito");
        return tarjetaCredito;
    }

    public void setTarjetaCredito(Boolean tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
        put("TarjetaCredito", tarjetaCredito);
    }
}
