package com.share.device.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.share.device.domain.CabinetType;
import com.share.device.mapper.CabinetTypeMapper;
import com.share.device.service.ICabinetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class CabinetTypeServiceImpl extends ServiceImpl<CabinetTypeMapper, CabinetType> implements ICabinetTypeService
{
    @Autowired
    private  CabinetTypeMapper cabinetTypeMapper;

    @Override
    public List<CabinetType> selectCabinetTypeList(CabinetType cabinetType) {
        return cabinetTypeMapper.selectCabinetTypeList(cabinetType);
    }

}
