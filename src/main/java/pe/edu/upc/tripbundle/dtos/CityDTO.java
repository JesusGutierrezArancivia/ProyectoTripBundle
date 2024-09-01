package pe.edu.upc.tripbundle.dtos;

import jakarta.persistence.Column;

public class CityDTO {
    private int idCity;

    private String nameCity;

    private float latitudeCity;

    private float lengthCity;

    private String provinceCity;

    private String departmentCity;

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public float getLatitudeCity() {
        return latitudeCity;
    }

    public void setLatitudeCity(float latitudeCity) {
        this.latitudeCity = latitudeCity;
    }

    public float getLengthCity() {
        return lengthCity;
    }

    public void setLengthCity(float lengthCity) {
        this.lengthCity = lengthCity;
    }

    public String getProvinceCity() {
        return provinceCity;
    }

    public void setProvinceCity(String provinceCity) {
        this.provinceCity = provinceCity;
    }

    public String getDepartmentCity() {
        return departmentCity;
    }

    public void setDepartmentCity(String departmentCity) {
        this.departmentCity = departmentCity;
    }
}
