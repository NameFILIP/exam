package org.namefilip.exam.repository;



import org.namefilip.exam.entity.Transportation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface TransportationRepository extends CrudRepository<Transportation, Integer> {
 
}
