package com.bo.main.core.model;

import lombok.Data;

/**
 * Created by tjdudals20@gmail.com on 2020-02-14
 */
@Data
public class Page {
    private int start; // unit per page
    private int end; // total size

    public void setPage(int offset, int limit) {
        this.start = (offset -1) * limit;
        this.end = limit;
    }
}
