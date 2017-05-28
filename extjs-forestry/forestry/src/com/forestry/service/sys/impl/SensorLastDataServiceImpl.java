package com.forestry.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.forestry.dao.sys.SensorLastDataDao;
import com.forestry.model.sys.SensorLastData;
import com.forestry.service.sys.SensorLastDataService;

import core.service.BaseService;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
@Service
public class SensorLastDataServiceImpl extends BaseService<SensorLastData> implements SensorLastDataService {

	private SensorLastDataDao sensorLastDataDao;

	@Resource
	public void setSensorLastDataDao(SensorLastDataDao sensorLastDataDao) {
		this.sensorLastDataDao = sensorLastDataDao;
		this.dao = sensorLastDataDao;
	}

}
