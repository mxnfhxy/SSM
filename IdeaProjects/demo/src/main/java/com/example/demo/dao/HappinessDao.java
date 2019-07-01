package com.example.demo.dao;

import com.example.demo.domain.Happiness;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface HappinessDao {
    @Select("SELECT * FROM happiness WHERE city = #{city}")
    //@Select("SELECT * FROM happiness WHERE city = 'chengdu'")
    //Happiness findHappinessByCity(@Param("city") String city);
    List<Map<String, Object>> findHappinessByCity(@Param("city") String city);

    @Insert("INSERT INTO happiness(city, num) VALUES(#{city}, #{num})")
    int insertHappiness(@Param("city") String city, @Param("num") Integer num);
}
