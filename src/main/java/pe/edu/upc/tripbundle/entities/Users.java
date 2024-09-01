package pe.edu.upc.tripbundle.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsers;

    @Column(name = "nameUsers", nullable = false, length=50)
    private String nameUsers;

    @Column(name = "lastnameUsers", nullable = false, length=50)
    private String lastnameUsers;

    @Column(name = "addressUsers", nullable = false, length=50)
    private String addressUsers;

    @Column(name = "emailUsers", nullable = false, length=50)
    private String emailUsers;

    @Column(name = "phoneUsers", nullable = false, length=50)
    private String phoneUsers;

    @Column(name = "passwordUsers", nullable = false, length=50)
    private String passwordUsers;

    @Column(name = "birthdateUsers", nullable = false, length=50)
    private Date birthdateUsers;

    @Column(name = "nicknameUsers", nullable = false, length=50)
    private String nicknameUsers;

    @Column(name = "dniUsers", nullable = false, length=50)
    private String dniUsers;

    public Users() {
    }

    public Users(int idUsers, String nameUsers, String lastnameUsers, String addressUsers, String emailUsers, String phoneUsers, String passwordUsers, Date birthdateUsers, String nicknameUsers, String dniUsers) {
        this.idUsers = idUsers;
        this.nameUsers = nameUsers;
        this.lastnameUsers = lastnameUsers;
        this.addressUsers = addressUsers;
        this.emailUsers = emailUsers;
        this.phoneUsers = phoneUsers;
        this.passwordUsers = passwordUsers;
        this.birthdateUsers = birthdateUsers;
        this.nicknameUsers = nicknameUsers;
        this.dniUsers = dniUsers;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public String getNameUsers() {
        return nameUsers;
    }

    public void setNameUsers(String nameUsers) {
        this.nameUsers = nameUsers;
    }

    public String getLastnameUsers() {
        return lastnameUsers;
    }

    public void setLastnameUsers(String lastnameUsers) {
        this.lastnameUsers = lastnameUsers;
    }

    public String getAddressUsers() {
        return addressUsers;
    }

    public void setAddressUsers(String addressUsers) {
        this.addressUsers = addressUsers;
    }

    public String getEmailUsers() {
        return emailUsers;
    }

    public void setEmailUsers(String emailUsers) {
        this.emailUsers = emailUsers;
    }

    public String getPhoneUsers() {
        return phoneUsers;
    }

    public void setPhoneUsers(String phoneUsers) {
        this.phoneUsers = phoneUsers;
    }

    public String getPasswordUsers() {
        return passwordUsers;
    }

    public void setPasswordUsers(String passwordUsers) {
        this.passwordUsers = passwordUsers;
    }

    public Date getBirthdateUsers() {
        return birthdateUsers;
    }

    public void setBirthdateUsers(Date birthdateUsers) {
        this.birthdateUsers = birthdateUsers;
    }

    public String getNicknameUsers() {
        return nicknameUsers;
    }

    public void setNicknameUsers(String nicknameUsers) {
        this.nicknameUsers = nicknameUsers;
    }

    public String getDniUsers() {
        return dniUsers;
    }

    public void setDniUsers(String dniUsers) {
        this.dniUsers = dniUsers;
    }
}
