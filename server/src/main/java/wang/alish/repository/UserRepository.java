package wang.alish.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import wang.alish.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Allen on 2017/2/27.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>{

    @Modifying          //说明该方法是修改操作
    @Transactional      //说明该方法是事物性操作
    //定义查询
    //@Param注解用于提取参数
    @Query("update UserEntity us set us.nickname=:qNickname, us.firstName=:qFirstName, us.lastName=:qLastName, us.password=:qPassword where us.id=:qId")
    public void updateUser(@Param("qNickname") String nickname,
                           @Param("qFirstName") String firstName,
                           @Param("qLastName") String lastName,    //教程打错了？
                           @Param("qPassword") String password,
                           @Param("qId") Integer id
                           );
}
