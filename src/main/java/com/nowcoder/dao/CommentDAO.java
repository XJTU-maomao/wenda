/*
 * Created by maomao at Xi'an Jiaotong University
 * Copyright (c) 19-4-17 下午7:39;
 */

package com.nowcoder.dao;

import com.nowcoder.model.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface CommentDAO {
    String TABLE_NAME = "comment";
    String INSERT_FILEDS = "user_id, content, created_date, entity_id, entity_type, status";
    String SELECT_FIELDS = "id, "+INSERT_FILEDS;

    @Insert({"insert into",TABLE_NAME,"(",INSERT_FILEDS,") values (#{userId},#{content},#{createdDate},#{entityId},#{entityType},#{status})"})
    int addComment(Comment comment);

    @Update({"update ", TABLE_NAME," set status=#{status} where entity_id=#{entityId} and entity_type=#{entityType}"})
    void updateStatus(@Param("entityId") int entityId, @Param("entityType") int entityType, @Param("status") int status);

    @Select({"select ", SELECT_FIELDS, " from ",TABLE_NAME, "where entity_id=#{entityId} and entity_type=#{entityType} order by id desc"})
    List<Comment> selectByEntity(@Param("entityId") int entityId, @Param("entityType") int entityType);

    @Select({"select ", SELECT_FIELDS, " from ",TABLE_NAME, "where id=#{id}"})
    Comment getCommentById(@Param("id") int id);

    @Select({"select count(id) from ",TABLE_NAME," where entity_id=#{entityId} and entity_type=#{entityType} "})
    int getCommentCount(@Param("entityId") int entityId, @Param("entityType") int entityType);

    @Select({"select count(id) from " , TABLE_NAME, "where user_id=#{userId}"})
    int getUserCommentCount(int userId);
}
