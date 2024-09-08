package pe.edu.upc.tripbundle.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;

    @Column(name = "typeRol", nullable = false, length=50)
    private String typeRol;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users us;

    public Rol() {
    }

    public Rol(int idRol, String typeRol, Users us) {
        this.idRol = idRol;
        this.typeRol = typeRol;
        this.us = us;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getTypeRol() {
        return typeRol;
    }

    public void setTypeRol(String typeRol) {
        this.typeRol = typeRol;
    }

    public Users getUs() {
        return us;
    }

    public void setUs(Users us) {
        this.us = us;
    }
}
