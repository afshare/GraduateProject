package wang.alish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wang.alish.model.UserEntity;
import wang.alish.repository.UserRepository;

import java.util.List;


/**
 * Created by Allen on 2017/2/17.
 */
@Controller
public class MainControler {

    //自动装备数据库接口，不需要再写原始的connection来操作数据库
    @Autowired
    UserRepository userRepository;


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/admin/users",method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap)
    {
        //查询user表中所有记录
        List<UserEntity> userEntityList = userRepository.findAll();

        //将所有记录传递给要返回的jsp页面，放在userEntityList当中
        modelMap.addAttribute("userEntityList",userEntityList);

        //返回pages目录下的admin/users.jsp页面
        return "admin/users";
    }

    // get请求，访问添加用户 页面
    @RequestMapping(value = "/admin/users/add",method = RequestMethod.GET)
    public String addUser()
    {
        //转到 admin/adduser.jsp页面
        return "admin/addUser";
    }

    //post请求，处理添加用户请求，并重定向到用户管理页面
    @RequestMapping(value = "/admin/users/addP",method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("user")UserEntity userEntity)
    {
        //注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        //通过@ModelAttribute()注解可以获取传递过来的“user”，并创建这个对象

        //数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        //数据库中添加一个用户，并立即刷新缓存
        userRepository.saveAndFlush(userEntity);
        return "redirect:/admin/users";
    }

    // 查看用户详情
    // @Pathvariable可以收集URl中的变量，需酦醅的变量用（）括起来
    //  例如：访问 localhost:8080/admin/users/show/1 , 将匹配 id = 1
     @RequestMapping(value = "/admin/users/show/{id}",method = RequestMethod.GET)
    public String showUser(@PathVariable("id")Integer userId, ModelMap modelMap)
     {
         //找到userId所表示的用户
         UserEntity userEntity = userRepository.findOne(userId);

         modelMap.addAttribute("user",userEntity);
         return "admin/userDetail";
     }

     // 更新用户信息 页面
    @RequestMapping(value = "/admin/users/update/{id}", method = RequestMethod.GET)
    public String updateUser(@PathVariable("id") Integer userId, ModelMap modelMap)
    {

        // 找到userId所表示的用户
        UserEntity userEntity = userRepository.findOne(userId);

        //传递给请求页面
        modelMap.addAttribute("user", userEntity);
        return "admin/updateUser";
    }
    // 更新用户信息 操作
    @RequestMapping(value = "/admin/users/updateP",  method = RequestMethod.POST)
    public String updateUserPost(@ModelAttribute("userP") UserEntity userEntity)
    {
        userRepository.updateUser(userEntity.getNickname(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getPassword(),
                userEntity.getId()
                );
        userRepository.flush(); //刷新缓冲区
        return "redirect:/admin/users";
    }

    //删除用户
    @RequestMapping(value = "/admin/users/delete/{id}", method = RequestMethod.GET)
    public String deletUser(@PathVariable("id") Integer userId)
    {
        userRepository.delete(userId);
        userRepository.flush();
        return "redirect:/admin/users";
    }
}
