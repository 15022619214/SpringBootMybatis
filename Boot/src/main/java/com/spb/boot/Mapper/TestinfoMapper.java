package com.spb.boot.Mapper;

import com.spb.boot.Model.Testinfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestinfoMapper {
    List<Testinfo> findTestinfoAll();
}
