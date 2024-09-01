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

    @Column(name = "dateReserve",nullable = false)
    private LocalDate dateReserve;

    public Reserve() {
    }

    public Reserve(int idReserve, String descriptionReserve, LocalDate dateReserve) {
        this.idReserve = idReserve;
        this.descriptionReserve = descriptionReserve;
        this.dateReserve = dateReserve;
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

    public LocalDate getDateReserve() {
        return dateReserve;
    }

    public void setDateReserve(LocalDate dateReserve) {
        this.dateReserve = dateReserve;
    }
}
