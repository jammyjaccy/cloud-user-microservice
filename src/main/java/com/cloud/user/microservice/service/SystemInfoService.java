package com.cloud.user.microservice.service;


import com.cloud.common.dto.BaseRespDTO;

/**
 * 业务系统服务
 *
 * @author Jon_China
 * @create 2017/12/23
 */
public interface SystemInfoService {

    /**
     * 业务系统分页查询
     * @param systemName 业务系统名称
     * @param pageIndex  页号
     * @param pageSize 页大小
     * @return
     */
    BaseRespDTO getSystemInfoByName(String systemName, int pageIndex, int pageSize);

    /**
     * 保存业务系统
     * @param systemName
     * @param systemChn
     * @param systemHost
     * @param systemContext
     * @return
     */
    BaseRespDTO saveSystemInfo(String systemName,String systemChn,String systemHost,String systemContext);

    /**
     * 根据id删除业务系统信息
     * @param id
     * @return
     */
    BaseRespDTO deleteSystemInfo(String id);

    /**
     * 根据id查询系统信息
     * @param id
     * @return
     */
    BaseRespDTO selectSystemInfo(String id);

    /**
     * 更新系统信息
     * @param systemName
     * @param systemChn
     * @param systemHost
     * @param systemContext
     * @param id
     * @return
     */
    BaseRespDTO updateSystemInfo(String systemName,String systemChn,String systemHost,String systemContext,String id);
}
