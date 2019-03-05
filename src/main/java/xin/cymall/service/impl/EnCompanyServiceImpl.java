package xin.cymall.service.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.cymall.common.enumresource.DefaultEnum;
import xin.cymall.common.exception.MyException;
import xin.cymall.common.utils.Constant;
import xin.cymall.dao.EnCompanyDao;
import xin.cymall.dao.SysUserDao;
import xin.cymall.entity.EnCompany;
import xin.cymall.entity.SysUser;
import xin.cymall.service.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 系统用户
 * 
 * @author wcy
 * @date 2016年9月18日 上午9:46:09
 */
@Service("enCompanyService")
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class EnCompanyServiceImpl implements EnCompanyService {
	@Autowired
	private EnCompanyDao enCompanyDao;

	@Override
	public EnCompany queryObject(Integer id) {
		return enCompanyDao.queryObject(id);
	}

	@Override
	public List<EnCompany> queryList(Map<String, Object> map){
		return enCompanyDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map) {
		return enCompanyDao.queryTotal(map);
	}

	@Override
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public void save(EnCompany enCompany) {
		enCompanyDao.save(enCompany);
	}

	@Override
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public void update(EnCompany enCompany) {
		enCompanyDao.update(enCompany);
	}

	@Override
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public void deleteBatch(Integer[] ids) {
		enCompanyDao.deleteBatch(ids);
	}

	@Override
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public void updateCompanyKey(EnCompany enCompany) {
		enCompanyDao.updateCompanyKey(enCompany);
	}
}