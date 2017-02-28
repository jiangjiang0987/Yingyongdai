package com.qingtai.qingtai.yingyongdai;

import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Item {


    private String type;
    private String type_1;
    private String type_2;
    private  int typeId;
    private BmobFile typeIcon_file;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_1() {
        return type_1;
    }

    public void setType_1(String type_1) {
        this.type_1 = type_1;
    }

    public String getType_2() {
        return type_2;
    }

    public void setType_2(String type_2) {
        this.type_2 = type_2;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public BmobFile getTypeIcon_file() {
        return typeIcon_file;
    }

    public void setTypeIcon_file(BmobFile typeIcon_file) {
        this.typeIcon_file = typeIcon_file;
    }
}
