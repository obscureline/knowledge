package com.obscureline.knowledge.service.impl;

import com.obscureline.knowledge.entity.Test;
import com.obscureline.knowledge.mapper.TestMapper;
import com.obscureline.knowledge.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试 服务实现类
 * </p>
 *
 * @author jiangke
 * @since 2023-06-04
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}
