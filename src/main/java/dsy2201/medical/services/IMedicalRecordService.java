package dsy2201.medical.services;

import java.util.List;
import java.util.Optional;

import dsy2201.medical.models.MedicalRecordModel;

public interface IMedicalRecordService {

    List<MedicalRecordModel>getAllRecords();
    Optional<MedicalRecordModel>getRecordById(int id);
    MedicalRecordModel postRecord(MedicalRecordModel record);
    MedicalRecordModel putRecord(int id, MedicalRecordModel record);
    void deleteRecord(int id);     
}
