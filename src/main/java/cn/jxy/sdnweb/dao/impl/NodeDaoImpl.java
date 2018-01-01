package cn.jxy.sdnweb.dao.impl;

import org.springframework.stereotype.Repository;

import cn.jxy.sdnweb.dao.INodeDao;
import cn.jxy.sdnweb.entity.NodeRelation;
import cn.jxy.sdnweb.util.PageCut;

@Repository
public class NodeDaoImpl implements INodeDao {

	@Override
	public boolean add(NodeRelation nodeRelation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(NodeRelation nodeRelation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NodeRelation findOne(String condition, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageCut<NodeRelation> finds(int curr, int size, String condition, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
