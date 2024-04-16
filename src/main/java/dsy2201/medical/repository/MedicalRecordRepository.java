package dsy2201.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dsy2201.medical.models.MedicalRecordModel;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecordModel,Integer> {
    
}
