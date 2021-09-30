package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import th.co.ktb.fraud.monitas.models.CaseFile;
import th.co.ktb.fraud.monitas.models.CaseFileId;

public interface CaseFileRepository  extends JpaRepository<CaseFile, CaseFileId>{

}
