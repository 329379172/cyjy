package com.linfeiyang.shop.mybatis.mapper;

import com.linfeiyang.shop.mybatis.model.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated
     */
    @Insert({
        "insert into t_admin (id, username, ",
        "`password`, phone, ",
        "lastTime, lastIp, ",
        "createTime, updateTime)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{lastTime,jdbcType=INTEGER}, #{lastIp,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=INTEGER}, #{updateTime,jdbcType=INTEGER})"
    })
    int insert(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated
     */
    int insertSelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, username, `password`, phone, lastTime, lastIp, createTime, updateTime",
        "from t_admin",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Admin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated
     */
    @Update({
        "update t_admin",
        "set username = #{username,jdbcType=VARCHAR},",
          "`password` = #{password,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "lastTime = #{lastTime,jdbcType=INTEGER},",
          "lastIp = #{lastIp,jdbcType=VARCHAR},",
          "createTime = #{createTime,jdbcType=INTEGER},",
          "updateTime = #{updateTime,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Admin record);

    @Select("select * from t_admin where username=#{username,jdbcType=VARCHAR}")
    Admin selectByUserName(String username);

    @Select("select * from t_admin order by id desc limit #{start,jdbcType=INTEGER},#{size,jdbcType=INTEGER}")
    List<Admin> selectUsers(@Param("start") Integer start, @Param("size") Integer size);

    @Select("delete from t_admin where id=#{id,jdbcType=INTEGER}")
    int deleteByPrimaryKey(Integer id);
}