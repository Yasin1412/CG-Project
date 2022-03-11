package com.app.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.app.dto.AdminDtologin;
import com.app.dto.AdminProfile;
import com.app.dto.UserProfile;

import com.app.model.User;

public class AdminLoginDao {

	Connection con = null;
	PreparedStatement pstmt = null;

	public AdminLoginDao() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petsdatabases", "root", "");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public AdminProfile adminlogin(AdminDtologin admin) throws Exception {
		pstmt = con.prepareStatement("select * from Admin where userName=? and password=?");
		pstmt.setString(1,  admin.getUserName());
		pstmt.setString(2,  admin.getPassword());
		ResultSet rs = pstmt.executeQuery();
		AdminProfile adminProfile = new AdminProfile();
		if (rs.next()) {
			adminProfile.setName(rs.getString("userName"));
			adminProfile.setEmail(rs.getString("email"));
			adminProfile.setMobile(rs.getLong("mobile"));
			adminProfile.setMsg("Welcome to your profile ." + rs.getString("userName") + " login Successfully.");
			adminProfile.setFlag(true);
		} else {
			adminProfile.setMsg("Sorry your not Register user need to register first");
			adminProfile.setFlag(false);
		}
		return adminProfile;
	}
}

