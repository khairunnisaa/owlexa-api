package com.owlexa.provider.controller;

import com.owlexa.provider.model.Provider;
import com.owlexa.provider.repository.ProviderRepository;
import com.owlexa.exception.ResourceNotFoundException;
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
@RequestMapping(value = "/api/provider")
public class ProviderController {
	@Autowired
	private ProviderRepository providerRepository;

	@GetMapping("/")
	public List<Provider> getAllProvider() {
		return providerRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Provider> getProviderById(@PathVariable(value = "id") Long providerId)
			throws ResourceNotFoundException {
		Provider provider = providerRepository.findById(providerId)
				.orElseThrow(() -> new ResourceNotFoundException("Provider not found for this id "
					+ ":: " + providerId));
		return ResponseEntity.ok().body(provider);
	}

	@PostMapping("/")
	public Provider createProvider(@Valid @RequestBody Provider provider) {
		return providerRepository.save(provider);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Provider> updateProvider(@PathVariable(value = "id") Long providerId,
			@Valid @RequestBody Provider providerDetails) throws ResourceNotFoundException {
		Provider provider = providerRepository.findById(providerId)
				.orElseThrow(() -> new ResourceNotFoundException("Provider not found for this id "
					+ ":: " + providerId));

		provider.setType(providerDetails.getType());
		provider.setName(providerDetails.getName());
		provider.setAddress(providerDetails.getAddress());
		final Provider updatedProvider = providerRepository.save(provider);
		return ResponseEntity.ok(updatedProvider);
	}

	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteProvider(@PathVariable(value = "id") Long providerId)
			throws ResourceNotFoundException {
		Provider provider = providerRepository.findById(providerId)
				.orElseThrow(() -> new ResourceNotFoundException("Provider not found for this id "
					+ ":: " + providerId));

		providerRepository.delete(provider);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
