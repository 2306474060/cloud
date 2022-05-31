package provider.lin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import mapper.generater.system.entity.UserInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ltx
 * @since 2022-05-30
 */
public interface IUserInfoService extends IService<UserInfo> {

    List<UserInfo> getUserList();

}
