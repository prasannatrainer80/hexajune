package com.java.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.rest.model.Employ;
import com.java.rest.util.ConnectionHelper;

public class EmployDaoImpl implements EmployDao {

	private static Connection connection;
	private PreparedStatement psmt;
	
	static {
		try {
			connection = ConnectionHelper.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Employ> showEmployDao() throws SQLException {
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		String cmd = "select * from Employ";
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) throws SQLException {
		Employ employ = null;
		String cmd = "select * from Employ where empno = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, empno);
		ResultSet rs = psmt.executeQuery();
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;
	}

	@Override
	public String addEmployDao(Employ employ) throws SQLException {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, employ.getEmpno());
		psmt.setString(2, employ.getName());
		psmt.setString(3, employ.getGender());
		psmt.setString(4, employ.getDept());
		psmt.setString(5, employ.getDesig());
		psmt.setDouble(6, employ.getBasic());
		psmt.executeUpdate();
		return "Employ Record Inserted...";
	}

}
