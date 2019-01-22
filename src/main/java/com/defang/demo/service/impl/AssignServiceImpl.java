package com.defang.demo.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fescar.core.context.RootContext;
import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.defang.demo.service.AssignService;
import com.defang.demo.sys.domain.AssetAssign;
import com.defang.demo.sys.repository.AssignRepository;

@Service
public class AssignServiceImpl implements AssignService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AssignServiceImpl.class);

	@Autowired
	private AssignRepository assignRepository;

	@Override
	@Transactional
	@GlobalTransactional
	public AssetAssign findById(String id) {
		LOGGER.info("Assign Service Begin ... xid: " + RootContext.getXID() + "\n\n\n\n\n");
		AssetAssign assetAssign = assignRepository.findById(id).get();
		return assetAssign;
	}

}
