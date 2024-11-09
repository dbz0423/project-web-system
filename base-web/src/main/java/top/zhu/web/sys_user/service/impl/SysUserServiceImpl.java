package top.zhu.web.sys_user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.zhu.web.sys_user.entity.SysUser;
import top.zhu.web.sys_user.mapper.SysUserMapper;
import top.zhu.web.sys_user.service.SysUserService;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}