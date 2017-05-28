package com.forestry.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import com.forestry.dao.sys.SysUserDao;
import com.forestry.model.sys.SysUser;
import com.forestry.service.sys.SysUserService;

/**
 * 
 * 
 * @框架唯一的升级和技术支持地址：https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.8.wNJFq2&id=551763724593&abbucket=20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class SSHTest {

	@Resource
	private SysUserDao sysUserDao;

	@Resource
	private SysUserService sysUserService;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public final void testSave() {
		// System.out.println("sysUserService:::" + sysUserService);
		SysUser sysUser = sysUserService.getByProerties("userName", "admin");
	}

}
