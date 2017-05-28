package com.forestry.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.forestry.dao.sys.SensorLastDataDao;
import com.forestry.model.sys.SensorLastData;

import core.dao.BaseDao;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
@Repository
public class SensorLastDataDaoImpl extends BaseDao<SensorLastData> implements SensorLastDataDao {

	public SensorLastDataDaoImpl() {
		super(SensorLastData.class);
	}

}
