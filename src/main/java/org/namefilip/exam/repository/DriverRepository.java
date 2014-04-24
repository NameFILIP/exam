package org.namefilip.exam.repository;



import org.namefilip.exam.entity.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface DriverRepository extends CrudRepository<Driver, Integer> {
 
}
