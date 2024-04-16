package dsy2201.medical.controllers;

import dsy2201.medical.models.*;
import dsy2201.medical.services.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medical")
public class MedicalRecordController {

    //record service Created and mantained by: IGNACIO EDUARDO RIQUELME ERAZO.
    @Autowired
    private MedicalRecordService recordService;

    //get individual record Created and mantained by: IGNACIO EDUARDO RIQUELME ERAZO.
    @GetMapping("/{id}")
    public Optional<MedicalRecordModel> getUserById(@PathVariable int id) {
        return recordService.getRecordById(id);
    }

    //get all records Created and mantained by: IGNACIO EDUARDO RIQUELME ERAZO.
    @GetMapping
    public List<MedicalRecordModel>getUsers() {
        return recordService.getAllRecords();
    }

    //post individual user Created and mantained by: IGNACIO EDUARDO RIQUELME ERAZO.
    @PostMapping
    public ResponseEntity<MedicalRecordModel> postRecord(@RequestBody MedicalRecordModel record) {
        try 
        {
            MedicalRecordModel newRecord = recordService.postRecord(record);
            return ResponseEntity.status(HttpStatus.CREATED).body(newRecord);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicalRecordModel> putRecord(@PathVariable int id, @RequestBody MedicalRecordModel record) {
        try 
        {
            MedicalRecordModel updateRecord = recordService.putRecord(id, record);
            
            if (updateRecord != null) 
            {
                return new ResponseEntity<>(updateRecord, HttpStatus.OK);
            } 
            else 
            {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) 
        {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //delete individual user and data asociated Created and mantained by: IGNACIO EDUARDO RIQUELME ERAZO.
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        try 
        {
            recordService.deleteRecord(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
