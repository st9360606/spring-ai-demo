package com.share.device.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.share.device.domain.Cabinet;

import java.util.List;

public interface ICabinetService extends IService<Cabinet>
{

    public List<Cabinet> selectCabinetList(Cabinet cabinet);

}