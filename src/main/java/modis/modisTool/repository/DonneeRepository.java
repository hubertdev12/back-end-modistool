package modis.modisTool.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import modis.modisTool.model.Donnee;
import modis.modisTool.model.StatutAnnule;
import modis.modisTool.model.StatutApprouve;
import modis.modisTool.model.StatutCloture;
import modis.modisTool.model.StatutCom1n;
import modis.modisTool.model.StatutEnCours;
import modis.modisTool.model.StatutFerme;
import modis.modisTool.model.StatutFini;
import modis.modisTool.model.StatutPrepa;
import modis.modisTool.model.StatutPret;

public interface DonneeRepository extends JpaRepository<Donnee, Integer>{
	List<Donnee> findByStatutPrepa(StatutPrepa statutPrepa);
	List<Donnee> findByStatutApprouve(StatutApprouve statutApprouve);
	List<Donnee> findByStatutPret(StatutPret statutPret);
	List<Donnee> findByStatutEnCours(StatutEnCours statutEnCours);
	List<Donnee> findByStatutFini(StatutFini statutFini);
	List<Donnee> findByStatutCom1n(StatutCom1n statutCom1n);
	List<Donnee> findByStatutCloture(StatutCloture statutCloture);
	List<Donnee> findByStatutAnnule(StatutAnnule statutAnnule);
	List<Donnee> findByStatutFerme(StatutFerme statutFerme);
}
