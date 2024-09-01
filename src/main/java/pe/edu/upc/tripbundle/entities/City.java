package pe.edu.upc.tripbundle.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCity;

    @Column(name = "nameCity",nullable = false,length = 70)
    private String nameCity;

    @Column(name = "latitudeCity",nullable = false,length = 200)
    private float latitudeCity;

    @Column(name = "lengthCity",nullable = false,length = 200)
    private float lengthCity;

    @Column(name = "provinceCity",nullable = false,length = 40)
    private String provinceCity;

    @Column(name = "departmentCity",nullable = false,length = 40)
    private String departmentCity;

    public City() {
    }

    public City(int idCity, String nameCity, float latitudeCity, float lengthCity, String provinceCity, String departmentCity) {
        this.idCity = idCity;
        this.nameCity = nameCity;
        this.latitudeCity = latitudeCity;
        this.lengthCity = lengthCity;
        this.provinceCity = provinceCity;
        this.departmentCity = departmentCity;
    }

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
