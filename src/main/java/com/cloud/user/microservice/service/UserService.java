package com.cloud.user.microservice.service;

import com.cloud.user.microservice.dto.BaseRespDTO;
import com.cloud.user.microservice.dto.UserDetailRespDTO;
import com.cloud.user.microservice.dto.UserSearchRespDTO;

public interface UserService {
    /**
     * 用户登录
     * @param userName
     * @param password
     * @return
     * @throws Exception
     */
    BaseRespDTO userLogin(String userName,String password) throws Exception;

    /**
     * 获取公钥信息
     * @return
     * @throws Exception
     */
    BaseRespDTO getPublicKey() throws Exception;

    /**
     * 用户列表查询
     * @param request
     * @return
     */
    BaseRespDTO getUserList(UserSearchRespDTO request);

    /**
     * 根据userId查询用户信息
     * @param userId
     * @return
     */
    UserDetailRespDTO getUserInfo(String userId);
}