/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.rigel.biplatform.ma.resource.view.dimdetail;

import java.io.Serializable;


/**
 * 
 * 时间维度明细定义
 * @author zhongyi
 * @version 1.0.0.1
 */
public class DateDimDetail implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5286295673038884992L;
    
    /**
     * 当前维度id
     */
    private String currDim;
    
    /**
     * 关联表定义
     */
    private String relationTable;
    
    /**
     * 维度字段
     */
    private String field;
    
    /**
     * 格式
     */
    private String format;
    
    /**
     * 日期粒度
     */
    private DateLevel dateLevel;
    
    /**
     * get the currDim
     * 
     * @return the currDim
     */
    public String getCurrDim() {
        return currDim;
    }
    
    /**
     * set the currDim
     * 
     * @param currDim
     *            the currDim to set
     */
    public void setCurrDim(String currDim) {
        this.currDim = currDim;
    }
    
    /**
     * get the relationTable
     * 
     * @return the relationTable
     */
    public String getRelationTable() {
        return relationTable;
    }
    
    /**
     * set the relationTable
     * 
     * @param relationTable
     *            the relationTable to set
     */
    public void setRelationTable(String relationTable) {
        this.relationTable = relationTable;
    }
    
    /**
     * get the field
     * 
     * @return the field
     */
    public String getField() {
        return field;
    }
    
    /**
     * set the field
     * 
     * @param field
     *            the field to set
     */
    public void setField(String field) {
        this.field = field;
    }
    
    /**
     * get the format
     * 
     * @return the format
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * set the format
     * 
     * @param format
     *            the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * get the dateLevel
     * 
     * @return the dateLevel
     */
    public DateLevel getDateLevel() {
        return dateLevel;
    }
    
    /**
     * set the dateLevel
     * 
     * @param dateLevel
     *            the dateLevel to set
     */
    public void setDateLevel(DateLevel dateLevel) {
        this.dateLevel = dateLevel;
    }
    
}