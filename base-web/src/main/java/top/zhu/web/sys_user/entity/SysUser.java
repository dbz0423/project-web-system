package top.zhu.web.sys_user.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("sys_user")
public class SysUser {
    @TableId(type = IdType.AUTO)
    private Long userId;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String gender;
    // 帐户是否过期(1 未过期，0已过期)
    private String isAdmin;
    // 帐户是否被锁定(1 未锁定，0已锁定)
    private boolean isAccountNonExpired = true;
    // 密码是否过期(1 未过期，0已过期)
    private boolean isAccountNonLocked = true;
    // 帐户是否可用(1 可用，0 不可用)
    private boolean isCredentialsNonExpired = true;
    private boolean isEnabled = true;
    private String nickName;
    @TableLogic
    private Integer deleted;
    @TableField(fill=FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill=FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
