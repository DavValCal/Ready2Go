package uab.ready2go.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import uab.ready2go.model.Travel;

public interface TravelRepository extends JpaRepository<Travel, Integer>, JpaSpecificationExecutor<Travel> {

}