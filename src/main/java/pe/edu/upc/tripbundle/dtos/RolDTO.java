package pe.edu.upc.tripbundle.dtos;

import pe.edu.upc.tripbundle.entities.Users;

public class RolDTO {

    private int idRol;

    private String typeRol;

    private Users us;

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
