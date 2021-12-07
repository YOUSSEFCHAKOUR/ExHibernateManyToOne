

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateUtils.hibernateUtils;
import com.models.Eleve;
import com.models.Moniteur;
import com.models.Voiture;
import com.models.lecon;

public class Main {

	public static void main(String[] args) {
		
		Session s=hibernateUtils.getSessionFactory().getCurrentSession();
		
		Transaction t=s.beginTransaction();
		
		List<lecon> lst=s.createQuery("from lecon").list();
		
		for(lecon l:lst)
			System.out.println(l.getId_lecon()+"_"+l.getEleve());
		t.commit();
		s.close();

	}

}
