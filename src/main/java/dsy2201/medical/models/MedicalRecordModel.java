package dsy2201.medical.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.List;

//CREATED AND MANTAINED by: IGNACIO EDUARDO RIQUELME ERAZO
@Entity
@Table(name = "medical_record")  
public class MedicalRecordModel implements Serializable  {

    //Encapsulating atributtes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    
    @Column(name = "fullNames", length = 128)
    private String dateRecord;


    //apply cardinality one to one from record to patient
    @OneToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private PatientModel patient;

    //apply cardinality many to many from record to  attentions
    @ManyToMany
    @JoinTable(
        name = "record_patient", 
        joinColumns = @JoinColumn(name = "id_record"),
        inverseJoinColumns = @JoinColumn(name = "id_atention")
    )
    private List<AtentionRecordModel> attentions;

    public MedicalRecordModel() {
    }

    public MedicalRecordModel(int id, String dateRecord, PatientModel patient, List<AtentionRecordModel> attentions) {
        this.id = id;
        this.dateRecord = dateRecord;
        this.patient = patient;
        this.attentions = attentions;
    }

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
