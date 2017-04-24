package wang.alish.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wang.alish.model.BottomDevinfoEntity;

/**
 * Created by Allen on 2017/3/6.
 */
@Repository
public interface BottomDevRepository extends JpaRepository<BottomDevinfoEntity,Integer> {
}
