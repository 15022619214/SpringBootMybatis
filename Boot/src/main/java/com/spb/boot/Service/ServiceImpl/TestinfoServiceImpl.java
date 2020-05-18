package com.spb.boot.Service.ServiceImpl;

import com.spb.boot.Mapper.TestinfoMapper;
import com.spb.boot.Model.Testinfo;
import com.spb.boot.Repository.TestinfoRepository;
import com.spb.boot.Service.TestinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestinfoServiceImpl implements TestinfoService {

    @Autowired
    TestinfoMapper testinfoMapper;

    @Override
    public List<Testinfo> findAll() {
        return testinfoMapper.findTestinfoAll();
    }
}
