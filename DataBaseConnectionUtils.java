package com.studentmanagement.studentcrudapp.utils;

import java.sql.*;

import com.studentmanagement.studentcrudapp.config.DataBaseConfig;

public class DataBaseConnectionUtils {
	private static Connection connection = null;
	static {
		try {
			/*--- Register driver for mysql ----*/
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ---------------------------------------------------------------------------------
			/*---- Creating connection ----*/
			connection = DriverManager.getConnection(DataBaseConfig.DB_URL, DataBaseConfig.USER_NAME, DataBaseConfig.PASSWORD);
			/*---- callling method for table creation ------*/
			createTables();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	/*--------------------------------------------------------------------------------*/
	/*---- method to return connection ----*/
	public static Connection getConnection() {
		return connection;
	}

	/*----- Method to close the connection -----*/
	public static void closeConnection() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	/*-------- method to create table ------*/
	private static void createTables()
	{
		try
		{
			/*----- Creating statement ----*/
			Statement stmt = connection.createStatement();
			/*----- executing query to create a table ------*/
			stmt.execute("create table if not exists student(stdid varchar(30) primary key,stdname varchar(300) not null,standard varchar(40) not null,roll int not null,age int not null,address varchar(400) not null)");
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
}
