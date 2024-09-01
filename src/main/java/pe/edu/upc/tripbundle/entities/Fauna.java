package pe.edu.upc.tripbundle.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Fauna")
public class Fauna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idFauna;

    @Column(name = "nameFauna",nullable = false,length = 70)
    private String nameFauna;

    @Column(name = "familyFauna",nullable = false,length = 70)
    private String familyFauna;

    @Column(name = "latitudeCity",nullable = false,length = 200)
    private float latitudeFauna;

    @Column(name = "lengthFauna",nullable = false,length = 200)
    private float lengthFauna;

    @Column(name = "stateFauna",nullable = false,length = 70)
    private String stateFauna;

    public Fauna() {
    }

    public Fauna(int idFauna, String nameFauna, String familyFauna, float latitudeFauna, float lengthFauna, String stateFauna) {
        this.idFauna = idFauna;
        this.nameFauna = nameFauna;
        this.familyFauna = familyFauna;
        this.latitudeFauna = latitudeFauna;
        this.lengthFauna = lengthFauna;
        this.stateFauna = stateFauna;
    }

    public int getIdFauna() {
        return idFauna;
    }

    public void setIdFauna(int idFauna) {
        this.idFauna = idFauna;
    }

    public String getNameFauna() {
        return nameFauna;
    }

    public void setNameFauna(String nameFauna) {
        this.nameFauna = nameFauna;
    }

    public String getFamilyFauna() {
        return familyFauna;
    }

    public void setFamilyFauna(String familyFauna) {
        this.familyFauna = familyFauna;
    }

    public float getLatitudeFauna() {
        return latitudeFauna;
    }

    public void setLatitudeFauna(float latitudeFauna) {
        this.latitudeFauna = latitudeFauna;
    }

    public float getLengthFauna() {
        return lengthFauna;
    }

    public void setLengthFauna(float lengthFauna) {
        this.lengthFauna = lengthFauna;
    }

    public String getStateFauna() {
        return stateFauna;
    }

    public void setStateFauna(String stateFauna) {
        this.stateFauna = stateFauna;
    }
}
