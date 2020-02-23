package com.owlexa.provider.repository;

import com.owlexa.provider.model.DetailProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailProviderRepository extends JpaRepository<DetailProvider, Long> {

}
