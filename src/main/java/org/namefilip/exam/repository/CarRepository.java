package org.namefilip.exam.repository;



import org.namefilip.exam.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface CarRepository extends CrudRepository<Car, String> {
 
}
