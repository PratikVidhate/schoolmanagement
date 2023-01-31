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
@WebServlet("/pink")
public class Driver extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name = req.getParameter("name");
		String gmail = req.getParameter("gmail");
		String mobile_no1 = req.getParameter("mobile_no");
		String age1 = req.getParameter("age");
		String password = req.getParameter("password");
		
		
		int age = Integer.parseInt(age1);
		long mobile_no =Long.parseLong(mobile_no1);
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Principal p = new Principal();
		p.setName(name);
		p.setMobile_no(mobile_no);
		p.setAge(age);
		p.setGmail(gmail);
		p.setPassword(password);
		
		et.begin();
		em.persist(p);
		et.commit();
		
		System.out.println("Saved Successfully");
		
		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		rd.forward(req, resp);
		
		
		
	}

}
