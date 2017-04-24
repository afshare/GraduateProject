package wang.alish.controller;

import org.springframework.web.bind.annotation.*;
import wang.alish.model.BottomDevinfoEntity;
import wang.alish.model.Shop;
import wang.alish.model.ewbottom;
import wang.alish.repository.BottomDevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Allen on 2017/3/6.
 */
@Controller

public class DevControler {
    //自动装配数据库接口，不需要再写原始的Connection来操作数据库
    @Autowired
    BottomDevRepository bottomDevRepository;

    @RequestMapping(value = "/bottomdev/bottomdevinfo",method =RequestMethod.GET)
    public String getButtomDev(ModelMap modelMap)
    {
        //查询buttomdevinfo表中所有记录
        List<BottomDevinfoEntity> bottomDevList = bottomDevRepository.findAll();

        //将所有记录传递给要返回的jsp页面，放在buttomDevList当中
        modelMap.addAttribute("bottomDevList",bottomDevList);

        //返回pages目录下的buttomdev/buttomdevinfo.jsp页面
        return "bottomdev/bottomdevinfo";

    }

    //get请求,访问添加设备 页面
    @RequestMapping(value = "/bottomdev/bottomdevinfo/add",method = RequestMethod.GET)
    public String adddButtomDev()
    {
        //转到 buttomdev/addDev.jsp页面
        return "bottomdev/addBottomDev";
    }

    //post请求，处理添加底层设备请求，并重定向到设备管理页面
    @RequestMapping(value = "/bottomdev/bottomdevinfo/addP",method = RequestMethod.POST)
    public String addButtomPost(@ModelAttribute("bottomdev") BottomDevinfoEntity bottomDevinfoEntity)
    {
        // 注意此处，post请求传递过来的是一个ButtomDevinfoEntity对象，里面包含了底层设备的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'buttomdev'，并创建这个对象


        //  一：通过下位机传上来的数据解析之后存储；

 //       System.out.println(templateTime.getInstallDate().toString());
        //System.out.println(templateTime.getInstallTime().toString());

//        System.out.println(bottomDevinfoEntity.getInstallTime());
        System.out.println("1231231231");
        //  二：通过网页自行添加

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //buttomDevRepository.save(bottomDevinfoEntity);

        // 数据库中添加一个用户，并立即刷新缓存
 //       bottomDevRepository.saveAndFlush(bottomDevinfoEntity);

        //重定向到用户管理界面，方法为redirect:url
        return "redirect:/bottomdev/bottomdevinfo";
    }

    @RequestMapping(value = "/bottomdev/bottomdevinfo/test",method = RequestMethod.GET)
    public @ResponseBody Shop getJSONString(@RequestParam("name") String name)
    {
        Shop shop = new Shop();
        shop.setName(name);
        shop.setSatfname(new String[]{"mkyong1","mkyong2"});

        return shop;
    }

    //尝试了传入name，返回json格式的Bean
    @RequestMapping(value = "/bottomdev/bottomdevinfo/test2",method = RequestMethod.GET)
    public void objectToJSON(@RequestParam("name") String name
                            , HttpServletRequest request
                            , HttpServletResponse response)
    {
        Shop shop = new Shop();
        shop.setName(name);
        shop.setSatfname(new String[]{"mkyong1","mkyong2"});
        System.out.println(JSONObject.fromObject(shop).toString());
        try {
            response.getWriter().print(JSONObject.fromObject(shop).toString());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
 //      return JSONObject.fromObject(shop).toString();
    }

    int checkNum = 0;
    //尝试了传入name，返回json格式的Bean
    @RequestMapping(value = "/bottomdev/bottomdevinfo/test3",method = RequestMethod.GET)
    public void ewobjectToJSON(@RequestParam("id") String ID
                                ,@RequestParam("temp") String temp
                                ,@RequestParam("humi") String humi
                                ,@RequestParam("co2") String co2
                                ,@RequestParam("light") String light
                                ,@RequestParam("pm") String pm
                                , HttpServletRequest request
                                , HttpServletResponse response)
    {
        ewbottom device = new ewbottom();
        device.setID(ID);
        device.setTemp(temp);
        device.setHumi(humi);
        device.setCo2(co2);
        device.setLight(light);
        device.setPm(pm);
        checkNum++;
        System.out.println(checkNum);
        System.out.println(JSONObject.fromObject(device).toString());
        try {
            response.getWriter().print(JSONObject.fromObject(device).toString());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        //      return JSONObject.fromObject(shop).toString();
    }





















}
