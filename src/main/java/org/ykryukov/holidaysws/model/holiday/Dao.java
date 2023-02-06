package org.ykryukov.holidaysws.model.holiday;

import java.sql.Date;
import java.util.List;

public interface Dao<T> {
	
//	List<T> getAll();
	
	T findByDate(Date dt);
//	
//	void update(T todo);
//	
//	Integer create(T todo);
//	
//	void deleteById(Integer id);
}