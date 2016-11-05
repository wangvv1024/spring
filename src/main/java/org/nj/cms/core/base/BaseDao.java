package org.nj.cms.core.base;

import java.util.List;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;

public interface BaseDao<Model> {
	/**
	 * 插入对象
	 *
	 * @param model
	 *            对象
	 */
	@TriggersRemove(cacheName = "baseCache", removeAll = true)
	int insertSelective(Model model);

	/**
	 * 更新对象
	 *
	 * @param model
	 *            对象
	 */
	@TriggersRemove(cacheName = "baseCache", removeAll = true)
	int updateByPrimaryKeySelective(Model model);

	/**
	 * 通过主键, 删除对象
	 *
	 * @param id
	 *            主键
	 */
	@TriggersRemove(cacheName = "baseCache", removeAll = true)
	int deleteByPrimaryKey(Object id);

	/**
	 * 将查询条件查询所有满足条件的信息
	 * 
	 * @param model
	 * @return
	 */
	@Cacheable(cacheName = "baseCache")
	public List<Model> selectList(Object model);

	/**
	 * 通过主键, 查询对象
	 *
	 * @param id
	 *            主键
	 * @return
	 */
	Model selectByPrimaryKey(Object id);

	/**
	 * 查询唯一的一个
	 * 
	 * @param model
	 * @return
	 */
	public Model selectOne(Object model);
}
