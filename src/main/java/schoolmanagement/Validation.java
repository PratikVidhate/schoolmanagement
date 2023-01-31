package schoolmanagement;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/shoes")
public class Validation extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String gmail = req.getParameter("gmail");
		String password=req.getParameter("password");
		
		Query q = em.createQuery("Select p from Principal p where p.gmail=?1 and p.password=?2");
		q.setParameter(1, gmail);
		q.setParameter(2, password);
		
		List<Principal> p = q.getResultList();
		
		if(p.size()>0) 
		{
			System.out.println("Done");
			RequestDispatcher rd = req.getRequestDispatcher("TeacherStudent.html");
			rd.forward(req, resp);
		
			
		}
		else {
			System.out.println("Invalid Credentials");
		}
	
	}
	
		
	

}
