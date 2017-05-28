package com.forestry.service.sys;

import java.util.List;

import com.forestry.model.sys.Forestry;

import core.service.Service;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
public interface ForestryService extends Service<Forestry> {

	List<Forestry> getForestryList(List<Forestry> resultList);

	List<Object[]> queryExportedForestry(Long[] ids);

}
