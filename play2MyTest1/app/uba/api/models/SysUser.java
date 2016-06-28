package uba.api.models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import play.data.validation.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_SysUser")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SysUser extends Model {
//    @Id
//    @Column(name = "id")
//    public Long id;

    @Column(name = "fLoginName")
    public String fLoginName;

    @Column(name = "fUserName")
    public String fUserName;

    @Column(name = "fEmail")
    public String fEmail;

    @Constraints.Required
    @Column(name = "fMobile")
    public String fMobile;

    @Constraints.Required
    @Column(name = "fPassword")
    public String fPassword;

    @Column(name = "fPasswordSalt")
    public String fPasswordSalt;//userToken

    @Column(name = "fGender")
    public int fGender; //性别

    @Column(name = "fUserType")
    public int  fUserType;//用户类型  业务员

    @Column(name = "loginTime")
    public String loginTime;

    @Column(name = "creatTime")
    public String creatTime;

    //public Find<Long,SysUser> find = new Find<Long,SysUser>(Long.class,SysUser.class);
}
