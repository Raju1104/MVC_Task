package p.com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import p.com.Entity.StudentEntity;

@Repository
public class StudentDao {
	@Autowired
	JdbcTemplate template;

	public boolean register(StudentEntity se) {

		try {

			Object[] args = { se.getFname(), se.getLname(), se.getAge(), se.getEmail(), se.getMobile(), se.getAddress(),
					se.getAdmission() };
			int a = template.update(
					"insert into student_data(`First Name`,`Last Name`,`Age`,`Email`,`Mobile Number`,`Address`,`Date of Admission`) values(?,?,?,?,?,?,?)",
					args);

			if (a == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {

		}
		return false;
	}

	public boolean update(StudentEntity se) {
	    try {
	        Object[] args = { se.getFname(), se.getLname(), se.getAge(), se.getEmail(), se.getMobile(), se.getAddress(), se.getAdmission(), se.getId() };
	        int a = template.update(
	            "UPDATE student_data SET `First Name` = ?, `Last Name` = ?, `Age` = ?, `Email` = ?, `Mobile Number` = ?, `Address` = ?, `Date of Admission` = ? WHERE id = ?",
	            args
	        );

			if (a == 1) {
				return true;
			} else {
				return false;
			}
	    } catch (Exception e2) {
	        return false;
	    }
	}

	public StudentEntity delete(int id){
		try {

			Object[] args = { id };

			int a = template.update("delete from student_data where id = ?", args);

			System.out.println(a);

		} catch (Exception e2) {
		}
		return null;

	}

	public StudentEntity SelectSingle(int id) {
		StudentEntity se = null;
		try {

			Object[] args = { id };
			 se = template.queryForObject("select * from student_data where id = ?",args, new RowMapper<StudentEntity>() {

				public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new StudentEntity(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				}

				
			});

		} catch (Exception e2) {

		}
		return se;

	}

	public List<StudentEntity> selectAll() {
		List<StudentEntity> list =null;
		try {
			
			list = template.query("select * from student_data", new RowMapper<StudentEntity>(){

				public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
					
					return new StudentEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				}
				
			});			
			
		} catch (Exception e2) {
			
		}
		
		return list;
};



	
	
}
