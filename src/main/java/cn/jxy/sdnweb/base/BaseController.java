package cn.jxy.sdnweb.base;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import cn.jxy.sdnweb.service.INodeService;


public class BaseController {
	
	protected Logger logger = null;
	
	public BaseController(){
		super();
		this.logger = Logger.getLogger(this.getClass());
		this.logger.info(this.getClass()+" is instance");
	}
	
	@Resource
	protected INodeService nodeService;
	
	
}
