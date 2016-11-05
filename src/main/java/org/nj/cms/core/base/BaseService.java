package org.nj.cms.core.base;

import java.util.List;
 

public abstract class BaseService<Model> { 
	/**
	 * 定义成抽象方法,由子类实现,完成dao的注入
	 *
	 * @return GenericDao实现类
	 */
	public abstract BaseDao<Model> getMapper();

	/**
	 * 插入对象
	 *
	 * @param model
	 *            对象
	 */
	public int insert(Model model) {
		return getMapper().insertSelective(model);
	}

	/**
	 * 更新对象
	 *
	 * @param model
	 *            对象
	 */
	public int update(Model model) {
		return getMapper().updateByPrimaryKeySelective(model);
	}

	/**
	 * 通过主键, 删除对象
	 *
	 * @param id
	 *            主键
	 */
	public int delete(Object id) {
		return getMapper().deleteByPrimaryKey(id);
	}

	/**
	 * 通过主键, 查询对象
	 *
	 * @param id
	 *            主键
	 * @return
	 */
	public Model selectById(Object id) {
		return getMapper().selectByPrimaryKey(id);
	}

	/**
	 * 将查询条件查询所有满足条件的信息
	 *
	 * @param model
	 * @return
	 */
	public List<Model> selectList(Object model) {
		return getMapper().selectList(model);
	}

	/**
	 * 查询唯一的一个
	 *
	 * @param model
	 * @return
	 */
	public Model selectOne(Object model) {
		return getMapper().selectOne(model);
	}
}
