package provider.lin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mapper.generater.system.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import provider.lin.mapper.UserInfoMapper;
import provider.lin.service.IUserInfoService;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ltx
 * @since 2022-05-30
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserList() {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().isNotNull(UserInfo::getId);
        return  userInfoMapper.selectList(queryWrapper)     ;
    }
}
