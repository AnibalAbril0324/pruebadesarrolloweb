package eva62Abril.Datos;

import java.io.Serializable;
import java.util.List;

import eva62Abril.Modelo.Computadora;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;


@Stateless
public class ComputadoraDAO implements Serializable{

private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Computadora computadora) {
		em.persist(computadora);
	}
	
	public void update(Computadora computadora) {
		em.merge(computadora);
	}
	
	public Computadora read (String codigo) {
		Computadora c= em.find(Computadora.class, codigo);
		return c;
	}
	
	public void delete (String codigo) {
		Computadora p=em.find(Computadora.class, codigo);
		em.remove(p);	
	}
	
	public List<Computadora>getAll(){
		String jpql="SELECT p FROM Computadora p";
		Query q=em.createQuery(jpql);
		return q.getResultList();
	}

}
