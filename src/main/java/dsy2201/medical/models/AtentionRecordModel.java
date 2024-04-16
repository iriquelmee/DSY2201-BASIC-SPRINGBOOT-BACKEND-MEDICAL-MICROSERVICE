package dsy2201.medical.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

//CREATED AND MANTAINED by: IGNACIO EDUARDO RIQUELME ERAZO 
@Entity
@Table(name = "atention")  
public class AtentionRecordModel implements Serializable  {
    //Encapsulatig data

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "dateAtention", length = 128)
    private String dateAtention;

    @Column(name = "reasonConsult", length = 128)
    private String reasonConsult;

    @Column(name = "diagnostic", length = 128)
    private String diagnostic;

    @Column(name = "phisichalExamination", length = 128)
    private String phisichalExamination;

    @Column(name = "treatment", length = 128)
    private String treatment;

    @Column(name = "severalInstructions", length = 128)
    private String severalInstructions;

    @Column(name = "monitoring", precision=1)
    private int monitoring;

    @Column(name = "AdditionalInfo", length = 128)
    private String AdditionalInfo;

    //apply cardinality many to one from atention to patient
    @ManyToMany(mappedBy = "attentions", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<MedicalRecordModel> record;


    //Empty cosntructor
    public AtentionRecordModel(){
    }
    
    //constructor
    public AtentionRecordModel(int id, String dateAtention, String reasonConsult, String diagnostic,String phisichalExamination, String treatment, String severalInstructions, int monitoring,String additionalInfo){
        this.id = id;
        this.dateAtention = dateAtention;
        this.reasonConsult = reasonConsult;
        this.diagnostic = diagnostic;
        this.phisichalExamination = phisichalExamination;
        this.treatment = treatment;
        this.severalInstructions = severalInstructions;
        this.monitoring = monitoring;
        this.AdditionalInfo = additionalInfo;
    }

    //Getters and setters for model
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDateAtention() {
        return dateAtention;
    }
    public void setDateAtention(String dateAtention) {
        this.dateAtention = dateAtention;
    }
    public String getReasonConsult() {
        return reasonConsult;
    }
    public void setReasonConsult(String reasonConsult) {
        this.reasonConsult = reasonConsult;
    }
    public String getDiagnostic() {
        return diagnostic;
    }
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
    public String getPhisichalExamination() {
        return phisichalExamination;
    }
    public void setPhisichalExamination(String phisichalExamination) {
        this.phisichalExamination = phisichalExamination;
    }
    public String getTreatment() {
        return treatment;
    }
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    public String getSeveralInstructions() {
        return severalInstructions;
    }
    public void setSeveralInstructions(String severalInstructions) {
        this.severalInstructions = severalInstructions;
    }
    public int getMonitoring() {
        return monitoring;
    }
    public void setMonitoring(int monitoring) {
        this.monitoring = monitoring;
    }
    public String getAdditionalInfo() {
        return AdditionalInfo;
    }
    public void setAdditionalInfo(String additionalInfo) {
        AdditionalInfo = additionalInfo;
    } 

}
