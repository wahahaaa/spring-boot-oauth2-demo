package com.sdcuike.practice.mapper;

import com.sdcuike.practice.config.DatasourceConfig.UseDataSourceTest;
import com.sdcuike.practice.domain.AtlBank;

@UseDataSourceTest
public interface AtlBankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table atl_bank
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table atl_bank
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    int insert(AtlBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table atl_bank
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    int insertSelective(AtlBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table atl_bank
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    AtlBank selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table atl_bank
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    int updateByPrimaryKeySelective(AtlBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table atl_bank
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    int updateByPrimaryKey(AtlBank record);
}