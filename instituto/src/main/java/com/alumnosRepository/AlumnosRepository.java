package com.alumnosRepository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.alumnos.Alumnos;

@Repository
public interface AlumnosRepository extends JpaRepository<Alumnos, Long>{
	
	List<Alumnos> findByNombres(@Param("nombres") String nombres);
}
	