package com.owlexa.provider.service;

import com.owlexa.provider.model.DetailProvider;
import com.owlexa.provider.model.Provider;
import com.owlexa.provider.repository.DetailProviderRepository;
import com.owlexa.provider.repository.ProviderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ProviderServiceImpl implements ProviderService {
    @Autowired
    DetailProviderRepository detailProviderRepository;
    @Autowired
    ProviderRepository providerRepository;
    @Override
    public DetailProvider saveNewProvider(DetailProvider detailProvider) {

        Provider provider = new Provider();
        provider.setName(detailProvider.getProviderName());
        provider.setType(detailProvider.getProviderCategory());
        provider.setCity(detailProvider.getCity());
        provider.setAddress(detailProvider.getAddress());
        provider.setPhoneNumber(detailProvider.getTelelphone());
        providerRepository.save(provider);
        return detailProviderRepository.save(detailProvider);
    }
}
