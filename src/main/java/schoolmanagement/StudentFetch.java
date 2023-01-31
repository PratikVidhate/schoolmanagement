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
import javax.servlet.http.HttpSession;
@WebServlet("/Fetch")
public class StudentFetch extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		int id1 = Integer.parseInt(id);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = em.find(Student.class, id1);
		System.out.println(s);
		HttpSession hs = req.getSession();
		hs.setAttribute("Hello1", s);
		
		RequestDispatcher rd = req.getRequestDispatcher("FetchStudent.jsp");
		rd.forward(req,resp);
		
		
	}

}
