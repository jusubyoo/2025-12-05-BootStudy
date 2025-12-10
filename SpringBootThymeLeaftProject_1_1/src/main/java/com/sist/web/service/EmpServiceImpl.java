package com.sist.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.sist.web.mapper.*;
import com.sist.web.vo.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {
	// 스프링으로부터 구현된 클래스 객체 요청
	@Autowired
	private EmpMapper eMapper;
	
	@Override
	public List<EmpVO> empListData() {
		// TODO Auto-generated method stub
		return eMapper.empListData();
	}
	
}
