

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
		
		List<Eleve> lst=s.createQuery("from Eleve").list();
		
		for(Eleve l:lst)
			System.out.println(l.getNom()+"_"+l.getLstlecon().size());
		t.commit();
		s.close();

	}

}
