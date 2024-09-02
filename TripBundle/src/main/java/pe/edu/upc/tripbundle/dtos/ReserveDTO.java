package pe.edu.upc.tripbundle.dtos;

import jakarta.persistence.Column;
import pe.edu.upc.tripbundle.entities.Activity;
import pe.edu.upc.tripbundle.entities.City;

import java.time.LocalDate;

public class ReserveDTO {

    private int idReserve;
    private String descriptionReserve;
    private LocalDate dateReserve;
    private Activity ac;
    private City ci;

    public int getIdReserve() {
        return idReserve;
    }

    public void setIdReserve(int idReserve) {
        this.idReserve = idReserve;
    }

    public String getDescriptionReserve() {
        return descriptionReserve;
    }

    public void setDescriptionReserve(String descriptionReserve) {
        this.descriptionReserve = descriptionReserve;
    }

    public Activity getAc() {
        return ac;
    }

    public void setAc(Activity ac) {
        this.ac = ac;
    }

    public City getCi() {
        return ci;
    }

    public void setCi(City ci) {
        this.ci = ci;
    }
}
