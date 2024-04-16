package dsy2201.medical.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//CREATED AND MANTAINED by: IGNACIO EDUARDO RIQUELME ERAZO
@Entity
@Table(name = "patient") 
public class PatientModel implements Serializable {

    //Encapsulating atributes for this model
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    
    @Column(name = "fullNames", length = 128)
    private String fullNames;

    @Column(name = "lastNames", length = 128)
    private String lastNames;

    @Column(name = "rut", length = 10)
    private String rut;

    @Column(name = "bornDate", length = 128)
    private String bornDate;

    @Column(name = "gender", length = 128)
    private String gender;

    @Column(name = "mail", length = 128)
    private String mail;

    @Column(name = "address", length = 128)
    private String address;

    @Column(name = "phoneContact", length = 15)
    private String phoneContact;

    //apply cardinality one to one from record to patient
    @OneToOne(mappedBy = "patient")
    private MedicalRecordModel record;

    public PatientModel(int id, String fullNames, String lastNames, String rut, String bornDate, String gender, String mail, String address, String phoneContact, MedicalRecordModel record) {
        this.id = id;
        this.fullNames = fullNames;
        this.lastNames = lastNames;
        this.rut = rut;
        this.bornDate = bornDate;
        this.gender = gender;
        this.mail = mail;
        this.address = address;
        this.phoneContact = phoneContact;
        this.record = record;
    }

    //Empty constructor for patient model
    public PatientModel() {
    }

    //Constructor

    //Getters and setters for patient modle
    public MedicalRecordModel getRecord() {
        return record;
    }

    public void setRecord(MedicalRecordModel record) {
        this.record = record;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullNames() {
        return fullNames;
    }
    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }
    public String getLastNames() {
        return lastNames;
    }
    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getBornDate() {
        return bornDate;
    }
    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneContact() {
        return phoneContact;
    }
    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }
}
