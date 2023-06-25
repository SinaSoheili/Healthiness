package net.sinasoheili.healthiness.user;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Data
public class UserRepository {

    @PersistenceContext
    private final EntityManager entityManager;

    public void registerUser (UserEntity userEntity) {
        entityManager.persist(userEntity);
    }
}
