package dsy2201.medical.models;

//CREATED AND MANTAINED by: IGNACIO EDUARDO RIQUELME ERAZO 
public class AtentionRecordModel {

    //Encapsulatig data
    private int id;
    private String dateAtention;
    private String reasonConsult;
    private String diagnostic;
    private String phisichalExamination;
    private String treatment;
    private String severalInstructions;
    private int monitoring;
    private String AdditionalInfo;

    //Empty cosntructor
    public AtentionRecordModel(){
        this.id = 0;
        this.dateAtention = "";
        this.reasonConsult = "";
        this.diagnostic = "";
        this.phisichalExamination = "";
        this.treatment = "";
        this.severalInstructions = "";
        this.monitoring = 0;
        this.AdditionalInfo = "";
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
