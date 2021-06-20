package DAO;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
	Optional<T> get(long t)throws Exception;
	List<?> getAll()throws Exception;
	void save(T t) throws Exception;
	void update(T t)throws Exception;
	void delete(T t)throws Exception;
	boolean isExist(T t)throws Exception;
	
	

}
