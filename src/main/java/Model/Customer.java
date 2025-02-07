package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String name;
    private String dni;
    private String adress;
    private String phone;
    private String mail;
    private String code;

    // *************************************************************************
    // *********************************************************** CONSTRUCTORS.
    // *************************************************************************
    public Customer() {
    }

    public Customer(int id, String name, String dni, String adress, String phone, String mail, String code) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.adress = adress;
        this.phone = phone;
        this.mail = mail;
        this.code = code;
    }

    // *************************************************************************
    // ****************************************************** GETTERS & SETTERS.
    // *************************************************************************
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
