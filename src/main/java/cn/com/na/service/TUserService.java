package cn.com.na.service;

import cn.com.na.bean.TUser;
import cn.com.na.bean.User;

public interface TUserService {

	public User isLogin(TUser tuser);
	/**
	 * 判断当前用户是否存在
	 * @param tuser
	 * @return
	 */
	public TUser userisExistence(TUser tuser);
	
	/**
	 * 修改账户注册信息
	 * @param tuser
	 */
	public void updateUser(TUser tuser);
	
	/**
	 * 根据用户id获取用户注册信息
	 * @param userId 用户id
	 * @return
	 */
	public TUser getUserById(int userId);
	
	/**
	 * 根据用户名获取用户注册信息
	 * @param account 用户名
	 * @return
	 */
	public TUser getUserByAccount(String account);
	
	/**
	 * 添加用户
	 * @param tuser
	 * @return
	 */
	public TUser addUser(User user);
	
	/**
	 * 检测用户
	 * @param user
	 * @return
	 */
	public int getUser(User user);
	
	
	/**
	 * 获取用户id
	 * @param user
	 * @return
	 */
	public int getUserId(User user);
	
	
}
