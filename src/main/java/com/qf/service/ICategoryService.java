package com.qf.service;


import com.qf.common.ServerResponse;
import com.qf.pojo.Category;

import java.util.List;

/**
 * @author GuiYuan Zhang
 * @date 2019/8/19
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
