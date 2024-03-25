package dsy2201.medical.controllers;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dsy2201.medical.models.*;

@RestController
public class MedicalRecordController {

    //initializing constructor by: IGNACIO EDUARDO RIQUELME ERAZO 
    public MedicalRecordController()
    {
        this.setDataController();
    }
    //Setting preliminar info by: IGNACIO EDUARDO RIQUELME ERAZO 
    public void setDataController()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        // handling exeption just in case, ide suggested.... : IGNACIO EDUARDO RIQUELME ERAZO 
        try 
        {
            /* Record 1 by: IGNACIO EDUARDO RIQUELME ERAZO */
            
            //setting new data for record Model
            MedicalRecordModel record1  = new MedicalRecordModel();
            record1.setId(1);
            record1.setDateRecord(dateFormat.parse("25-03-2024 11:59:00").toString());
            
            //setting data for record.patient
            record1.getPatient().setId(1);
            record1.getPatient().setFullNames("Ignacio Eduardo");
            record1.getPatient().setLastNames("Riquelme Erazo");
            record1.getPatient().setRut("19743805-3");
            record1.getPatient().setBornDate(dateFormat.parse("11-09-1997 00:00:00").toString());
            record1.getPatient().setGender("Masculino");
            record1.getPatient().setMail("i.riquelme@duocuc.cl");
            record1.getPatient().setAddress("calle falsa 123");
            record1.getPatient().setPhoneContact("930535935");

            //setting data for record.atentions
            AtentionRecordModel atention1 = new AtentionRecordModel();
            AtentionRecordModel atention2 = new AtentionRecordModel();

            //attention 1
            atention1.setId(1);
            atention1.setDateAtention("26-03-2024 00:09:00");
            atention1.setReasonConsult("dolor de cabeza, caida de pelo");
            atention1.setDiagnostic("Estres Laboral");
            atention1.setPhisichalExamination("caida del pelo, posiblemente alopesia, caspa");
            atention1.setTreatment("1 Paracetamol cada 24 hrs 500, lavarse con medicasp 3 veces por semana");
            atention1.setSeveralInstructions("aplicar abundante agua para enjuagar shampoo, secarse bien el pelo no usar jockey o gorras esto evita sanar heridas del cuero capilar");
            atention1.setMonitoring(1);
            atention1.setAdditionalInfo("Revisar, seguir tratamiento y venir dentro de tres semanas, agendar hora.");

            //attention 2
            atention2.setId(2);
            atention2.setDateAtention("24-04-2024 00:09:00");
            atention2.setReasonConsult("control seguimiento ");
            atention2.setDiagnostic("Estres Laboral");
            atention2.setPhisichalExamination("caida del pelo, posiblemente alopesia, caspa");
            atention2.setTreatment("");
            atention2.setSeveralInstructions("");
            atention2.setMonitoring(0);
            atention2.setAdditionalInfo("");

            //adding attentions
            record1.getAttentions().add(atention1);
            record1.getAttentions().add(atention2);

            /* Record 2 by: IGNACIO EDUARDO RIQUELME ERAZO */
            
            //setting new data for record Model
            MedicalRecordModel record2  = new MedicalRecordModel();
            record2.setId(2);
            record2.setDateRecord(dateFormat.parse("25-03-2024 11:59:00").toString());
            
            //setting data for record.patient
            record2.getPatient().setId(2);
            record2.getPatient().setFullNames("Juantito");
            record2.getPatient().setLastNames("Lopez Rodriguez");
            record2.getPatient().setRut("12345678-9");
            record2.getPatient().setBornDate(dateFormat.parse("10-10-2004 00:00:00").toString());
            record2.getPatient().setGender("Masculino");
            record2.getPatient().setMail("juanito.lopez@gmail.com");
            record2.getPatient().setAddress("calle perpendicular, 314");
            record2.getPatient().setPhoneContact("987654321");

            //setting data for record.atentions
            AtentionRecordModel atention3 = new AtentionRecordModel();

            //attention 3
            atention3.setId(3);
            atention3.setDateAtention("25-03-2024 09:30:00");
            atention3.setReasonConsult("vomitos, diarrea, mareos persistentes,deshidratacion");
            atention3.setDiagnostic("cuadro gastroenteritis");
            atention3.setPhisichalExamination("suministrar suero durante 30 minutos");
            atention3.setTreatment("viadil 30 gotas cada 8 hrs , donperidona cada 12 hrs");
            atention3.setSeveralInstructions("dieta blanda, tomar agua purificada no de la llave, suplementar hidratacion en caso de ser necesario");
            atention3.setMonitoring(0);
            atention3.setAdditionalInfo("Realizar reposo durante 2 dias");

            //adding attentions
            record2.getAttentions().add(atention3);

            //finally add record to list
            this.recordList.add(record1);
            this.recordList.add(record2);


        } catch (Exception ex) {

            ex.getMessage();
            System.out.println("MedicalRecordController Error: "+ex.getMessage());

        }

    }

    //Setting arraylist for data record by: IGNACIO EDUARDO RIQUELME ERAZO 
    private List<MedicalRecordModel> recordList = new ArrayList<>();
    
    //Method that returs the record data arraylist by: IGNACIO EDUARDO RIQUELME ERAZO 
    @GetMapping("/getRecords")
    public List<MedicalRecordModel> getRecords(){
        return this.recordList;
    }

    //Method that gets a record object by given rut by: IGNACIO EDUARDO RIQUELME ERAZO 
    @GetMapping("/getRecords/{rut}")
    public MedicalRecordModel GetRecordsByRut(@PathVariable String rut) {        
        
        for (MedicalRecordModel record: recordList){
            //validating patient rut from the list asociated with given rut by: IGNACIO EDUARDO RIQUELME ERAZO 
            if(record.getPatient().getRut().equals(rut))
            {
                return record;               
            }
            
        }
        return null;
    }

}
