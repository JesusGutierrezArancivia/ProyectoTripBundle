package pe.edu.upc.tripbundle.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Reserve")
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idReserve;

    @Column(name = "descriptionReserve",nullable = false,length = 70)
    private String descriptionReserve;

    @ManyToOne
    @JoinColumn(name="idActivity")
    private Activity ac;

    @ManyToOne
    @JoinColumn(name="idCity")
    private City ci;

    public Reserve() {
    }

    public Reserve(int idReserve, String descriptionReserve, Activity ac, City ci) {
        this.idReserve = idReserve;
        this.descriptionReserve = descriptionReserve;
        this.ac=ac;
        this.ci=ci;
    }

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

    public void setAc(City ci) {
        this.ci = ci;
    }
}
