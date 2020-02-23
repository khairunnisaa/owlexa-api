package com.owlexa.provider.controller;


import com.owlexa.exception.ResourceNotFoundException;
import com.owlexa.provider.model.DetailProvider;
import com.owlexa.provider.repository.DetailProviderRepository;
import com.owlexa.provider.service.ProviderService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/provider/detail")
public class DetailProviderController {
    @Autowired
    private DetailProviderRepository detailProviderRepository;

    @Autowired
    private ProviderService providerService;

    @GetMapping("/")
    public List<DetailProvider> getAllDetailProvider() {
        return detailProviderRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailProvider> getDetailProviderById(@PathVariable(value = "id") Long providerId)
        throws ResourceNotFoundException {
        DetailProvider provider = detailProviderRepository.findById(providerId)
            .orElseThrow(() -> new ResourceNotFoundException("Provider not found for this id "
                + ":: " + providerId));
        return ResponseEntity.ok().body(provider);
    }

    @PostMapping("/")
    public DetailProvider createDetailProvider(@Valid @RequestBody DetailProvider provider) {
        return providerService.saveNewProvider(provider);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailProvider> updateDetailProvider(@PathVariable(value = "id") Long providerId,
        @Valid @RequestBody DetailProvider providerDetails) throws ResourceNotFoundException {
        DetailProvider provider = detailProviderRepository.findById(providerId)
            .orElseThrow(() -> new ResourceNotFoundException("Provider not found for this id "
                + ":: " + providerId));

        provider.setWebsite(providerDetails.getWebsite());
        provider.setBankAccount(providerDetails.getBankAccount());
        provider.setAddress(providerDetails.getAddress());
        final DetailProvider updatedProvider = detailProviderRepository.save(provider);
        return ResponseEntity.ok(updatedProvider);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteProvider(@PathVariable(value = "id") Long providerId)
        throws ResourceNotFoundException {
        DetailProvider provider = detailProviderRepository.findById(providerId)
            .orElseThrow(() -> new ResourceNotFoundException("Provider not found for this id "
                + ":: " + providerId));

        detailProviderRepository.delete(provider);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
