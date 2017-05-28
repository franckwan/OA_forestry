package com.forestry.controller.sys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forestry.core.ForestryBaseController;
import com.forestry.model.sys.Attachment;
import com.forestry.service.sys.AttachmentService;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
@Controller
@RequestMapping("/sys/attachment")
public class AttachmentController extends ForestryBaseController<Attachment> {

	@Resource
	private AttachmentService attachmentService;

	@RequestMapping("/getFlower")
	public String getFlower(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String epcId = request.getParameter("epcId");
		List<Object[]> flowerList = attachmentService.queryFlowerList(epcId);
		Attachment attachment = null;
		List<Attachment> attachmentList = new ArrayList<Attachment>();
		for (int i = 0; i < flowerList.size(); i++) {
			attachment = new Attachment();
			attachment.setFileName(String.valueOf(flowerList.get(i)[0]));
			attachment.setFilePath(String.valueOf(flowerList.get(i)[1]));
			attachment.setDescription(String.valueOf(flowerList.get(i)[2]));
			attachment.setEpcId(String.valueOf(flowerList.get(i)[3]));
			attachmentList.add(attachment);
		}
		writeJSON(response, attachmentList);
		return null;
	}

}
