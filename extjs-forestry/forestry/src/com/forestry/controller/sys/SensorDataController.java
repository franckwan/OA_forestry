package com.forestry.controller.sys;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forestry.core.ForestryBaseController;
import com.forestry.model.sys.SensorData;
import com.forestry.service.sys.SensorDataService;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
@Controller
@RequestMapping("/sys/sensordata")
public class SensorDataController extends ForestryBaseController<SensorData> {

	@Resource
	private SensorDataService sensorDataService;

	@RequestMapping(value = "/getSensorDataStatistics")
	public void getSensorDataStatistics(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Object[]> list = sensorDataService.doGetSensorDataStatistics(Short.valueOf(request.getParameter("sensorType")));
		List<Object[]> enhanceList = sensorDataService.doGetEnhanceSensorDataStatistics(list);
		writeJSON(response, enhanceList);
	}

}
