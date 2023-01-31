package schoolmanagement;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteStudent")
public class DeleteStudentDriver extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String id = req.getParameter("id");
		
		int id1 = Integer.parseInt(id);
		
		Student s = em.find(Student.class, id1);
		
		et.begin();
		em.remove(s);
		et.commit();
		
     System.out.println(".....Student Deleted Successfully.....");
		
		RequestDispatcher rd = req.getRequestDispatcher("Students.html");
		rd.forward(req, resp);
	}

}
