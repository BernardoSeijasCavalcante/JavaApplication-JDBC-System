<<<<<<< HEAD
package application;

import java.sql.Connection;

import db.DB;

public class Program {
	
	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
	
}
=======
package application;

import java.sql.Connection;

import db.DB;

public class Program {
	
	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
	
}
>>>>>>> ec0cabced6871492545261074d0ad51bd4a0d8a8
