package org.energyos.espi.thirdparty.service.impl;

import org.energyos.espi.thirdparty.domain.DataCustodian;
import org.energyos.espi.thirdparty.repository.DataCustodianRepository;
import org.energyos.espi.thirdparty.service.DataCustodianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DataCustodianServiceImpl implements DataCustodianService {

    @Autowired
    private DataCustodianRepository repository;

    @Override
    public DataCustodian findById(Long dataCustodianId) {
        return repository.findById(dataCustodianId);
    }

    @Override
    public List<DataCustodian> findAll() {
        return repository.findAll();
    }

    public void setRepository(DataCustodianRepository repository) {
        this.repository = repository;
    }

    public void persist(DataCustodian dataCustodian) {
        repository.persist(dataCustodian);
    }
}