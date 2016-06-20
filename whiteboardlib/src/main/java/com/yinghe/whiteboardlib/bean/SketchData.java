package com.yinghe.whiteboardlib.bean;

import android.graphics.Bitmap;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChiEr on 16/6/16.
 */
public class SketchData {
    public List<PhotoRecord> photoRecordList;
    public List<StrokeRecord> strokeRecordList;
    public List<StrokeRecord> strokeRedoList;
    public File thumbnailFile;//缩略图文件
    public Bitmap backgroundBM;

    public SketchData() {
        strokeRecordList = new ArrayList<>();
        photoRecordList = new ArrayList<>();
        strokeRedoList = new ArrayList<>();
        backgroundBM = null;
        thumbnailFile = null;
    }

}
