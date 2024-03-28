package uab.ready2go.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import uab.ready2go.model.Tag;

public interface TagRepository extends JpaRepository<Tag, String>, JpaSpecificationExecutor<Tag> {

}