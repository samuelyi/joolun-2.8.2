/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.joolun.com
 * 注意：
 * 本软件为www.joolun.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.joolun.cloud.mall.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joolun.cloud.mall.common.entity.MaterialGroup;
import com.joolun.cloud.mall.admin.mapper.MaterialGroupMapper;
import com.joolun.cloud.mall.admin.service.MaterialGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 素材分组
 *
 * @author JL
 * @date 2019-10-26 19:29:07
 */
@Service
public class MaterialGroupServiceImpl extends ServiceImpl<MaterialGroupMapper, MaterialGroup> implements MaterialGroupService {

	@Autowired
	private MaterialGroupMapper materialGroupMapper;
	@Override
	public List<MaterialGroup> selectMaterialGroup(MaterialGroup materialGroup) {
		return materialGroupMapper.selectMaterialGroup(materialGroup);
	}

	@Override
	public List<MaterialGroup> getById(String id) {
		return materialGroupMapper.selectMaterialGroupById(id);
	}
}
