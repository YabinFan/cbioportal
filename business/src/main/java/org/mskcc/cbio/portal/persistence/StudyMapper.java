/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mskcc.cbio.portal.persistence;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.portal.model.DBStudy;
/**
 *
 * @author abeshoua
 */
public interface StudyMapper {
	List<DBStudy> getStudies(@Param("study_ids") List<String> study_ids);
	List<DBStudy> getAllStudies();
}
