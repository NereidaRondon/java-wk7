package projects;

import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {
		DbConnection.getConnection();
	}

}


//Objectives
//In these exercises, you will:
//	Use MySQL Workbench to create a schema and user.
//	Use MySQL Workbench to assign schema privileges to a user.
//	Create a Maven project in Eclipse.
//	Add the MySQL driver as a dependency in pom.xml (Maven's Project Object Model – POM).
//	Separate project concerns by creating packages.
//	Write Java code to connect to a MySQL database and schema.
