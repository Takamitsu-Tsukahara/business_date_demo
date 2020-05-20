package demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import demo.domainModel.ModelUser;
import demo.domainModel.ModelUserExample;

@Mapper
@Repository
public interface RepositoryUser {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    long countByExample(ModelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    int deleteByExample(ModelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    int insert(ModelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    int insertSelective(ModelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    List<ModelUser> selectByExample(ModelUserExample example);
    List<ModelUser> selectByExample();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    ModelUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    int updateByExampleSelective(@Param("record") ModelUser record, @Param("example") ModelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    int updateByExample(@Param("record") ModelUser record, @Param("example") ModelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    int updateByPrimaryKeySelective(ModelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    int updateByPrimaryKey(ModelUser record);
}