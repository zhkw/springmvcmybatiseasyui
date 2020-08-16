package com.cisdi.enfi.pbs.service.impl;

import com.cisdi.enfi.pbs.domain.Monkeys;
import com.cisdi.enfi.pbs.mapper.MonkeysMapper;
import com.cisdi.enfi.pbs.service.MonkeysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("monkeysService")
public class MonkeysServiceImpl implements MonkeysService {
    @Autowired
    private MonkeysMapper monkeysMapper;

    @Override
    public Monkeys getMonkey(Integer id) {
        return monkeysMapper.findById(id);
    }
}
