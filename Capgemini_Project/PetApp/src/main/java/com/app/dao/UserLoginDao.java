package com.app.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.app.dto.UserDtologin;
import com.app.dto.UserProfile;

import com.app.model.User;


public class UserLoginDao {

	Connection con = null;
	PreparedStatement pstmt = null;

	public UserLoginDao() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petsdatabases", "root", "");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public UserProfile userlogin(UserDtologin user) throws Exception {
		pstmt = con.prepareStatement("select * from User where userName=? and password=?");
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		ResultSet rs = pstmt.executeQuery();
		UserProfile userProfile = new UserProfile();
		if (rs.next()) {
			userProfile.setName(rs.getString("userName"));
			userProfile.setEmail(rs.getString("email"));
			userProfile.setMobile(rs.getLong("mobile"));
			userProfile.setMsg("Welcome to your profile ." + rs.getString("userName") + " login Successfully.");
			userProfile.setFlag(true);
		} else {
			userProfile.setMsg("Sorry your not Register user need to register first");
			userProfile.setFlag(false);
		}
		return userProfile;
	}
}

