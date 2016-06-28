package uba.api.service;

import play.Logger;
import play.mvc.Controller;
import uba.api.models.SysUser;
import uba.utils.Message;
import com.avaje.ebean.*;
import java.util.List;

/**
 * Created by azmake on 16/5/20.
 */
public class SysUserSercice extends Controller{
    /**
     * 登录接口业务逻辑判断
     * @param fMobile 登录手机号
     * @param fPassword 登录密码
     */

    public Message login(String fMobile, String fPassword){
        Message message = new Message();
        SysUser sysUser = new SysUser();
        try {
            String queryString = "SELECT fMobile FROM T_SysUser";
            RawSql rawSql = RawSqlBuilder.parse(queryString).columnMapping("fMobile","fMobile").create();
            Query<SysUser> query = Ebean.find(SysUser.class);
            query.setRawSql(rawSql);
            query.findUnique();
            List<SysUser> sysUsers = query.findList();
            //List<SysUser> sysUsers = EbeanServerFactory.initialiseContainer();
            //List<SysUser> sysUsers = new Model.Finder(String.class,SysUser.class).all();
            message = Message.wrap(200,"success",sysUsers);
        }catch (Exception e){
            Logger.info(e.toString());
            message = Message.exceptionWrap("系统繁忙，请稍后尝试");
        }
        return message;
    }
}
