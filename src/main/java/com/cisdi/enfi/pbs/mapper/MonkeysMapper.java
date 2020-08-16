package com.cisdi.enfi.pbs.mapper;

import com.cisdi.enfi.pbs.domain.Monkeys;
import org.mybatis.spring.annotation.MapperScan;

public interface MonkeysMapper {
    public Monkeys findById(Integer id);
}
