package me.lhz.dao;

import me.lhz.bo.TTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TTestDao   extends JpaRepository<TTest,String>{
}
