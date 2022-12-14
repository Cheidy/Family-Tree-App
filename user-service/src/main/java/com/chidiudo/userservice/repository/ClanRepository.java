package com.chidiudo.userservice.repository;

import com.chidiudo.userservice.entity.Clan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClanRepository extends JpaRepository<Clan, Long > {
}
