package org.nj.cms.web.controller.front;

import org.nj.cms.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping("/ajax")
@Api(value = "人员管理",tags = "人员管理")
public class UserController {
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "获取人员接口", notes = "获取人员 ", code = 200, produces = "application/json")
	public Object getUser(@ApiParam(name = "pageNo", required = false) @RequestParam(name = "pageNo", required = false, defaultValue = "1") int pageNo,
			@ApiParam(name = "pageSize", required = false) @RequestParam(name = "pageSize", required = false, defaultValue = "3") int pageSize) { 
		return userService.getList(pageNo,pageSize);
	}
}
