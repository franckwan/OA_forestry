package com.forestry.model.sys.param;

import core.extjs.ExtJSBaseParameter;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
public class ConfigParameter extends ExtJSBaseParameter {

	private static final long serialVersionUID = -2197040433315922797L;
	private String configTypeName;

	public String getConfigTypeName() {
		return configTypeName;
	}

	public void setConfigTypeName(String configTypeName) {
		this.configTypeName = configTypeName;
	}

}
