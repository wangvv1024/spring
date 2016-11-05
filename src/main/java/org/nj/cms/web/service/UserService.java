package org.nj.cms.web.service;

import javax.annotation.Resource;

import org.nj.cms.core.base.BaseDao;
import org.nj.cms.core.base.BaseMessage;
import org.nj.cms.core.base.BaseService;
import org.nj.cms.core.utils.CodeMessageUtils;
import org.nj.cms.web.dao.UserDao;
import org.nj.cms.web.model.UserModel;
import org.springframework.stereotype.Service;
 
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service("userService")
public class UserService extends BaseService<UserModel> {
	@Resource
	private UserDao userDao;

	@Override
	public BaseDao<UserModel> getMapper() {
		return this.userDao;
	}

	public BaseMessage getList(int pageNo,int pageSize) {
		Page<UserModel> page = PageHelper.startPage(pageNo, pageSize, true);
		this.selectList(null);
		return new BaseMessage(CodeMessageUtils.SUCCESS_CODE, null, page.getResult());
	}

}
