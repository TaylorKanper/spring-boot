package com.tydic.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "t_user")
public class UserBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "u_name")
    private String userName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "u_birthday")
    private Date birthday;
    @Column(name = "u_class_name")
    private String className;
    @Column(name = "u_descript")
    private String description;
    @Column(name = "u_status")
    private Integer status;
}
