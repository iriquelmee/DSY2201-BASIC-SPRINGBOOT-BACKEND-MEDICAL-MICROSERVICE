package dsy2201.medical.models;
import java.util.ArrayList;
import java.util.List;

//CREATED AND MANTAINED by: IGNACIO EDUARDO RIQUELME ERAZO 
public class MedicalRecordModel {

    //Encapsulating atributtes
    private int id;
    private String dateRecord;
    private PatientModel patient;
    private List<AtentionRecordModel> attentions;

    //Empty constructor
    public MedicalRecordModel() {
        this.id = 0;
        this.dateRecord = "";
        this.patient =  new PatientModel();
        this.attentions = new ArrayList<>();
    }

    //Constructor 
    public MedicalRecordModel(int id, String dateRecord, PatientModel patient, List<AtentionRecordModel> attentions) {
        this.id = id;
        this.dateRecord = dateRecord;
        this.patient = patient;
        this.attentions = attentions;
    }
    
    //Getters and setter methods
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDateRecord() {
        return dateRecord;
    }
    public void setDateRecord(String dateRecord) {
        this.dateRecord = dateRecord;
    }
    public PatientModel getPatient() {
        return patient;
    }
    public void setPatient(PatientModel patient) {
        this.patient = patient;
    }
    public List<AtentionRecordModel> getAttentions() {
        return attentions;
    }
    public void setAttentions(List<AtentionRecordModel> attentions) {
        this.attentions = attentions;
    }
}
