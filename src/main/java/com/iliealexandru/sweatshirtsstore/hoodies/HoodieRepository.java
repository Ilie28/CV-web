package com.iliealexandru.sweatshirtsstore.hoodies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoodieRepository extends JpaRepository<Hoodie, Long> {

}

