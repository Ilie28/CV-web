package com.iliealexandru.sweatshirtstore.sweatshirt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SweatshirtsRepository extends JpaRepository<Sweatshirts, Long> {

}
