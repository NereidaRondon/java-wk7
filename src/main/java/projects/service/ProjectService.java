package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {

	//Instance variable to access the DAO from the service
	private ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
	

}
