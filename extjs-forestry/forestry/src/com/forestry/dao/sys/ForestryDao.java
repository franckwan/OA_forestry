package com.forestry.dao.sys;

import java.util.List;

import com.forestry.model.sys.Forestry;

import core.dao.Dao;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
public interface ForestryDao extends Dao<Forestry> {

	List<Object[]> queryExportedForestry(Long[] ids);

}
