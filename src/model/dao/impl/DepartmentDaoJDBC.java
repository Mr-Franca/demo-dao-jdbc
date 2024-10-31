package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{

	private Connection conn;

	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	
	@Override
	public void insert(Department obj) {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(
					"INSERT INTO department "
					+ "(Name) "
					+ "VALUES (?)");
			
			ps.setString(1, obj.getName());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			DB.closeStatement(ps);
			
		}
				
	}

	@Override
	public void update(Department obj) {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(
					"UPDATE department "
					+"SET Name = ? " 
					+"WHERE Id = ?");
			
			ps.setString(1, obj.getName());			
			ps.setInt(2, obj.getId());			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
			
		}
	}

	@Override
	public void deleteByID(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"DELETE FROM department where Id = ?");
			
			st.setInt(1, id);
			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
