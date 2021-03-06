package xin.cymall.service;

import xin.cymall.common.utils.TreeTableBean;
import xin.cymall.entity.EnCompany;
import xin.cymall.entity.EnMonitorUnit;

import java.util.List;
import java.util.Map;


/**
 * 监测单位 业务类 service
 * @author wcy
 * @date 2019年3月1日14:46:53
 */
public interface EnMonitorUnitService {
	

	/**
	 * 根据用户ID，查询监测单位
	 * @param id
	 * @return
	 */
	EnMonitorUnit queryObject(String id);

	/**
	 * 根据监测单位名称查询
	 * @param enMonitorUnit
	 * @return
	 */
	List<EnMonitorUnit> queryByName(EnMonitorUnit enMonitorUnit);
	
	/**
	 * 查询监测单位列表
	 * @param map
	 * @return
	 */
	List<EnMonitorUnit> queryList(Map<String, Object> map);

	/**
	 * 根据企业ID 查询监测单位
	 * @param companyId
	 * @return
	 */
	List<EnMonitorUnit> queryListByCompId(String companyId);

	/**
	 * 查询树形table数据
	 * @param param
	 * @return
	 */
	List<TreeTableBean> queryTreeTable(Map param);
	
	/**
	 * 查询总数
	 * @param map
	 * @return
	 */
	int queryTotal(Map<String, Object> map);
	
	/**
	 * 保存监测单位
	 * @param enMonitorUnit
	 * @return
	 */
	void save(EnMonitorUnit enMonitorUnit);
	
	/**
	 * 修改监测单位信息
	 * @param enMonitorUnit
	 * @return
	 */
	void update(EnMonitorUnit enMonitorUnit);
	
	/**
	 * 删除监测单位信息
	 * @param ids
	 * @return
	 */
	void deleteBatch(String[] ids);

}
