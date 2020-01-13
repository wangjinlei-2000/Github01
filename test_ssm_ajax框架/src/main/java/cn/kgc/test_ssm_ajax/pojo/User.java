package cn.kgc.test_ssm_ajax.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

public class User {
    private Integer id; //id
    private String userCode; //用户编码
    private String userName; //用户名称
    private String userPassword; //用户密码
    private Date birthday;  //出生日期
    private Integer gender;  //性别
    private String phone;   //电话
    private String address; //地址
    private Integer userRole;    //用户角色
    private Integer createdBy;   //创建者
    private Date creationDate; //创建时间
    private Integer modifyBy;     //更新者
    private Date modifyDate;   //更新时间
    private Integer age;//年龄
    private String userRoleName;    //用户角色名称
    private String idPicPath;	//证件照路径
    private String workPicPath; //工作证照片路径

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public String getIdPicPath() {
        return idPicPath;
    }

    public void setIdPicPath(String idPicPath) {
        this.idPicPath = idPicPath;
    }

    public String getWorkPicPath() {
        return workPicPath;
    }

    public void setWorkPicPath(String workPicPath) {
        this.workPicPath = workPicPath;
    }
}
