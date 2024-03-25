package dsy2201.medical.models;

//CREATED AND MANTAINED by: IGNACIO EDUARDO RIQUELME ERAZO 
public class PatientModel {

    //Encapsulating atributes for this model
    private int id;
    private String fullNames;
    private String lastNames;
    private String rut;
    private String bornDate;
    private String gender;
    private String mail;
    private String address;
    private String phoneContact;
    
    //Empty constructor for patient model
    public PatientModel() {
        this.id = 0;
        this.fullNames = "";
        this.lastNames = "";
        this.rut = "";
        this.bornDate = "";
        this.gender = "";
        this.mail = "";
        this.address = "";
        this.phoneContact = "";
    }

    //Constructor
    public PatientModel(int id, String fullNames, String lastNames, String rut, String bornDate, String gender, String mail, String address, String phoneContact) {
        this.id = id;
        this.fullNames = fullNames;
        this.lastNames = lastNames;
        this.rut = rut;
        this.bornDate = bornDate;
        this.gender = gender;
        this.mail = mail;
        this.address = address;
        this.phoneContact = phoneContact;
    }
    
    //Getters and setters for patient modle
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
