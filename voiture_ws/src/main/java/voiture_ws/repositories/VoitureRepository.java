package voiture_ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import voiture_ws.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
