package com.std.common;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by sence on 2015/7/12.
 */
public class MybatisDaoContext {

    /**
     *写
     */
    private SqlSessionTemplate writeSqlSession;
    /**
     * 读
     */
    private SqlSessionTemplate readSqlSession;

    /**
     * {@inheritDoc}
     */
    public <T> T selectOne(String statement) {
        return readSqlSession.selectOne(statement);
    }

    /**
     * {@inheritDoc}
     */
    public <T> T selectOne(String statement, Object parameter) {
        return readSqlSession.selectOne(statement, parameter);
    }

    /**
     * {@inheritDoc}
     */
    public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
        return readSqlSession.selectMap(statement, mapKey);
    }

    /**
     * {@inheritDoc}
     */
    public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey) {
        return readSqlSession.selectMap(statement, parameter, mapKey);
    }

    /**
     * {@inheritDoc}
     */
    public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey, RowBounds rowBounds) {
        return readSqlSession.selectMap(statement, parameter, mapKey, rowBounds);
    }

    /**
     * {@inheritDoc}
     */
    public <E> List<E> selectList(String statement) {
        return readSqlSession.selectList(statement);
    }

    /**
     * {@inheritDoc}
     */
    public <E> List<E> selectList(String statement, Object parameter) {
        return readSqlSession.selectList(statement, parameter);
    }

    /**
     * {@inheritDoc}
     */
    public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
        return readSqlSession.selectList(statement, parameter, rowBounds);
    }

    /**
     * {@inheritDoc}
     */
    public void select(String statement, ResultHandler handler) {
        readSqlSession.select(statement, handler);
    }

    /**
     * {@inheritDoc}
     */
    public void select(String statement, Object parameter, ResultHandler handler) {
        readSqlSession.select(statement, parameter, handler);
    }

    /**
     * {@inheritDoc}
     */
    public void select(String statement, Object parameter, RowBounds rowBounds, ResultHandler handler) {
        readSqlSession.select(statement, parameter, rowBounds, handler);
    }

    /**
     * {@inheritDoc}
     */
    public int insert(String statement) {
        return writeSqlSession.insert(statement);
    }

    /**
     * {@inheritDoc}
     */
    public int insert(String statement, Object parameter) {
        return writeSqlSession.insert(statement, parameter);
    }

    /**
     * {@inheritDoc}
     */

    public int update(String statement) {
        return writeSqlSession.update(statement);
    }

    /**
     * {@inheritDoc}
     */

    public int update(String statement, Object parameter) {
        return writeSqlSession.update(statement, parameter);
    }

    /**
     * {@inheritDoc}
     */

    public int delete(String statement) {
        return writeSqlSession.delete(statement);
    }

    /**
     * {@inheritDoc}
     */

    public int delete(String statement, Object parameter) {
        return writeSqlSession.delete(statement, parameter);
    }
    


    public SqlSessionTemplate getWriteSqlSession() {
        return writeSqlSession;
    }

    public void setWriteSqlSession(SqlSessionTemplate writeSqlSession) {
        this.writeSqlSession = writeSqlSession;
    }

    public SqlSessionTemplate getReadSqlSession() {
        return readSqlSession;
    }

    public void setReadSqlSession(SqlSessionTemplate readSqlSession) {
        this.readSqlSession = readSqlSession;
    }
}
