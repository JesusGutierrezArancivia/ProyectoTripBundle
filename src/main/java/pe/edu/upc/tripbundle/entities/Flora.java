package pe.edu.upc.tripbundle.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Flora")
public class Flora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlora;

    @Column(name = "nameFlora",nullable = false,length = 70)
    private String nameFlora;

    @Column(name = "spicieFlora",nullable = false,length = 70)
    private String spicieFlora;

    @Column(name = "famimlyFlora",nullable = false,length = 70)
    private String famimlyFlora;

    @Column(name = "latitudeFlora",nullable = false,length = 200)
    private double latitudeFlora;

    @Column(name = "lengthFauna",nullable = false,length = 200)
    private double lenghtFlora;

    @Column(name = "stateFlora",nullable = false,length = 70)
    private String stateFlora;

    public Flora() {
    }

    public Flora(int idFlora, String nameFlora, String spicieFlora, String famimlyFlora, double latitudeFlora, double lenghtFlora, String stateFlora) {
        this.idFlora = idFlora;
        this.nameFlora = nameFlora;
        this.spicieFlora = spicieFlora;
        this.famimlyFlora = famimlyFlora;
        this.latitudeFlora = latitudeFlora;
        this.lenghtFlora = lenghtFlora;
        this.stateFlora = stateFlora;
    }

    public int getIdFlora() {
        return idFlora;
    }

    public void setIdFlora(int idFlora) {
        this.idFlora = idFlora;
    }

    public String getNameFlora() {
        return nameFlora;
    }

    public void setNameFlora(String nameFlora) {
        this.nameFlora = nameFlora;
    }

    public String getSpicieFlora() {
        return spicieFlora;
    }

    public void setSpicieFlora(String spicieFlora) {
        this.spicieFlora = spicieFlora;
    }

    public String getFamimlyFlora() {
        return famimlyFlora;
    }

    public void setFamimlyFlora(String famimlyFlora) {
        this.famimlyFlora = famimlyFlora;
    }

    public double getLatitudeFlora() {
        return latitudeFlora;
    }

    public void setLatitudeFlora(double latitudeFlora) {
        this.latitudeFlora = latitudeFlora;
    }

    public double getLenghtFlora() {
        return lenghtFlora;
    }

    public void setLenghtFlora(double lenghtFlora) {
        this.lenghtFlora = lenghtFlora;
    }

    public String getStateFlora() {
        return stateFlora;
    }

    public void setStateFlora(String stateFlora) {
        this.stateFlora = stateFlora;
    }
}
