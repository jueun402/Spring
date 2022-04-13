package com.enc.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	// Mysql DB 
	public static Connection getConnection() {
		try {
			String jdbcDriver = "com.mysql.cj.jdbc.Driver";
			String jdbcUrl = "jdbc:mysql://localhost:3306/uboard?serverTimezone=UTC";
			String dbUser  = "root";
			String dbPwd   = "1234";
			
			Class.forName(jdbcDriver);
			return DriverManager.getConnection(jdbcUrl, dbUser, dbPwd); // spring container에 싣기 ==> spring jdbc module에 있음 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Query (insert, update, delete)
	public static void close(PreparedStatement stmt, Connection conn) {
		if (stmt != null) {
			try {
				if (!stmt.isClosed())
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}
		if (conn != null) {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}

	// Query (select)
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs != null) {
			try {
				if (!rs.isClosed())
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
		if (stmt != null) {
			try {
				if (!stmt.isClosed())
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}
		if (conn != null) {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}
}