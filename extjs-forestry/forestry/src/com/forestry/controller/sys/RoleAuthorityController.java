package com.forestry.controller.sys;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forestry.core.ForestryBaseController;
import com.forestry.model.sys.RoleAuthority;
import com.forestry.service.sys.RoleAuthorityService;

/**
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
@Controller
@RequestMapping("/sys/roleauthority")
public class RoleAuthorityController extends ForestryBaseController<RoleAuthority> {

	@Resource
	private RoleAuthorityService roleAuthorityService;

	@RequestMapping(value = "/saveRoleAuthority")
	public void saveRoleAuthority(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Short role = Short.valueOf(request.getParameter("role"));
		String ids = request.getParameter("ids");
		roleAuthorityService.deleteByProperties("role", role);
		String[] idsValue = ids.split(",");
		for (int i = 0; i < idsValue.length; i++) {
			RoleAuthority roleAuthority = new RoleAuthority();
			roleAuthority.setRole(role);
			roleAuthority.setAuthorityId(idsValue[i]);
			roleAuthorityService.persist(roleAuthority);
		}
		writeJSON(response, "{success:true}");
	}

}
