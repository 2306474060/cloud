package provider.lin.controller;


import mapper.generater.system.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.lin.service.IUserInfoService;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ltx
 * @since 2022-05-30
 */
@RestController
@RequestMapping("/system/userInfo")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @GetMapping("/getAll")
    public List<UserInfo> getUserList() {
        return userInfoService.getUserList();
    }
}

