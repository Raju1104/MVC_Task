package p.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import p.com.Dao.StudentDao;
import p.com.Entity.StudentEntity;


@Service
public class StudentService {

@Autowired
StudentDao dao;

public boolean register(StudentEntity se) {
	
	return dao.register(se);
}

public boolean update(StudentEntity se) {
	return dao.update(se);
}



public StudentEntity delete(int id) {
    return dao.delete(id);
}


public StudentEntity SelectSingle(int id) {
	return dao.SelectSingle(id);
}

public List<StudentEntity> selectAll() {
	return dao.selectAll();
	
}


	
}
