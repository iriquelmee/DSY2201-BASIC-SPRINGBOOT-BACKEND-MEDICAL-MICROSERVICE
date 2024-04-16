package dsy2201.medical.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsy2201.medical.models.AtentionRecordModel;
import dsy2201.medical.models.MedicalRecordModel;
import dsy2201.medical.repository.AtentionRepository;
import dsy2201.medical.repository.MedicalRecordRepository;
import jakarta.transaction.Transactional;

@Service
public class MedicalRecordService implements IMedicalRecordService {

    @Autowired
    private MedicalRecordRepository recordRepository;

    @Autowired
    private AtentionRepository atentionRepository;

    @Override
    public List<MedicalRecordModel> getAllRecords() {
        return recordRepository.findAll();
    }

    @Override
    public Optional<MedicalRecordModel> getRecordById(int id) {
        return recordRepository.findById(id);
    }

    @Transactional
    public MedicalRecordModel postRecord(MedicalRecordModel record) {
        try 
        {
            MedicalRecordModel savedRecord = recordRepository.save(record);
            return savedRecord;
        } 
        catch (Exception e) 
        {
            System.out.println("Error saving record: " + e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public MedicalRecordModel putRecord(int id, MedicalRecordModel record) {
        Optional<MedicalRecordModel> optionalRecord = recordRepository.findById(id);
        
        if (optionalRecord.isPresent()) {
            MedicalRecordModel existingRecord = optionalRecord.get();
            existingRecord = record;
            // Save the updated 
            MedicalRecordModel updateRecord = recordRepository.save(existingRecord);


            
            return updateRecord;
        } else {
            return null;
        }
    }
    
    @Override
    @Transactional
    public void deleteRecord(int id) {
        Optional<MedicalRecordModel> optionalRecord = recordRepository.findById(id);
        
        if (optionalRecord.isPresent()) {
            MedicalRecordModel record = optionalRecord.get();
            
            // Delete addresses associated with the user
            if (record.getAttentions() != null) {
                for (AtentionRecordModel atention : record.getAttentions()) {
                    atentionRepository.deleteById(atention.getId());
                }
            }
            
            // Delete the user
            recordRepository.deleteById(id);
        }
    } 
    

    
    
}
