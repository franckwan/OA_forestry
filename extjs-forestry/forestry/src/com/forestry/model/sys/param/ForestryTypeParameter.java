package com.forestry.model.sys.param;

import core.extjs.ExtJSBaseParameter;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
public class ForestryTypeParameter extends ExtJSBaseParameter {

	private static final long serialVersionUID = -6335587468796360403L;
	private String property;
	private String direction;
	private String descriptionNoHtml;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getDescriptionNoHtml() {
		return descriptionNoHtml;
	}

	public void setDescriptionNoHtml(String descriptionNoHtml) {
		this.descriptionNoHtml = descriptionNoHtml;
	}

}
