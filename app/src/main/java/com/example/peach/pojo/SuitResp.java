package com.example.peach.pojo;

import com.example.peach.pojo.bean.SuitBean;

import java.util.List;


/**
 * -description:
 * -author: created by tang on 2020/5/11 17:15
 */
public class SuitResp {

    /**
     * code : 200
     * msg : 请求成功
     * data : {"total":60,"list":[{"suit_name":"美丽的草原风光宽屏壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/01/0E/ChMkJ1bKwXWIaekbAAoNguMjjogAALGYgJvW2AACg2a545.jpg","target_url":"/bizhi/195_745_2.html","level":1,"type":1,"id":195},{"suit_name":"简约黑色背景图标宽屏壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/08/04/ChMkJleF7WeIdaxTABNpaaUXOW8AATeTwERcIwAE2mB274.jpg","target_url":"/bizhi/6549_80699_2.html","level":1,"type":1,"id":6549},{"suit_name":"域外风光高清桌面壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/06/02/ChMkJ1gWweGIQOfgAC4UISfTA-UAAXViQFFZhkALhQ5936.jpg","target_url":"/bizhi/6824_85248_2.html","level":1,"type":1,"id":6824},{"suit_name":"辛巴狗神经语录第15弹","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0C/06/ChMkJlgpWByIXzZAAAwLNmXG1M8AAXuiwIjv3EADAtO870.jpg","target_url":"/bizhi/6833_85342_2.html","level":1,"type":1,"id":6833},{"suit_name":"鸭嘴兽男孩 公仔壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0F/0E/ChMkJlgytKuINfzkAARcZbv0QPUAAX8TwL3PCYABFx9765.jpg","target_url":"/bizhi/6842_85426_2.html","level":1,"type":1,"id":6842},{"suit_name":"纯美雪景桌面壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/00/0C/ChMkJ1g1BlOIOLfdAAkcOIZ6ph0AAX_3wKHuxoACRxQ570.jpg","target_url":"/bizhi/6846_85460_2.html","level":1,"type":1,"id":6846},{"suit_name":"绝美风景下的白色跑车图片壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0D/0C/ChMkJ14iYUKIK53kAAwMs1wQhO4AAwcIgFWqTIADAzL699.jpg","target_url":"/bizhi/8543_105613_2.html","level":1,"type":1,"id":8543},{"suit_name":"黑色的轿车图片绝色风景壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0E/00/ChMkJ14jsWmIGmleABJUy5Dl6qsAAwdFwMEpFkAElTj031.jpg","target_url":"/bizhi/8549_105680_2.html","level":1,"type":1,"id":8549},{"suit_name":"黑色的轿车图片绝色风景壁纸2","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0E/04/ChMkJl4lD9iIZxukAAgDL5Dc2_QAAweCwBrDucACANH455.jpg","target_url":"/bizhi/8555_105730_2.html","level":1,"type":1,"id":8555},{"suit_name":"超级跑车法拉利图片壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g1/M03/03/06/ChMljV401HyID4kiAAlPTKlcxxwAAQJNwIKmV8ACU9k193.jpg","target_url":"/bizhi/8565_105814_2.html","level":1,"type":1,"id":8565}],"pageNum":1,"pageSize":10,"size":10,"startRow":1,"endRow":10,"pages":6,"prePage":0,"nextPage":2,"isFirstPage":true,"isLastPage":false,"hasPreviousPage":false,"hasNextPage":true,"navigatePages":8,"navigatepageNums":[1,2,3,4,5,6],"navigateFirstPage":1,"navigateLastPage":6,"firstPage":1,"lastPage":6}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * total : 60
         * list : [{"suit_name":"美丽的草原风光宽屏壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/01/0E/ChMkJ1bKwXWIaekbAAoNguMjjogAALGYgJvW2AACg2a545.jpg","target_url":"/bizhi/195_745_2.html","level":1,"type":1,"id":195},{"suit_name":"简约黑色背景图标宽屏壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/08/04/ChMkJleF7WeIdaxTABNpaaUXOW8AATeTwERcIwAE2mB274.jpg","target_url":"/bizhi/6549_80699_2.html","level":1,"type":1,"id":6549},{"suit_name":"域外风光高清桌面壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/06/02/ChMkJ1gWweGIQOfgAC4UISfTA-UAAXViQFFZhkALhQ5936.jpg","target_url":"/bizhi/6824_85248_2.html","level":1,"type":1,"id":6824},{"suit_name":"辛巴狗神经语录第15弹","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0C/06/ChMkJlgpWByIXzZAAAwLNmXG1M8AAXuiwIjv3EADAtO870.jpg","target_url":"/bizhi/6833_85342_2.html","level":1,"type":1,"id":6833},{"suit_name":"鸭嘴兽男孩 公仔壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0F/0E/ChMkJlgytKuINfzkAARcZbv0QPUAAX8TwL3PCYABFx9765.jpg","target_url":"/bizhi/6842_85426_2.html","level":1,"type":1,"id":6842},{"suit_name":"纯美雪景桌面壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/00/0C/ChMkJ1g1BlOIOLfdAAkcOIZ6ph0AAX_3wKHuxoACRxQ570.jpg","target_url":"/bizhi/6846_85460_2.html","level":1,"type":1,"id":6846},{"suit_name":"绝美风景下的白色跑车图片壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0D/0C/ChMkJ14iYUKIK53kAAwMs1wQhO4AAwcIgFWqTIADAzL699.jpg","target_url":"/bizhi/8543_105613_2.html","level":1,"type":1,"id":8543},{"suit_name":"黑色的轿车图片绝色风景壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0E/00/ChMkJ14jsWmIGmleABJUy5Dl6qsAAwdFwMEpFkAElTj031.jpg","target_url":"/bizhi/8549_105680_2.html","level":1,"type":1,"id":8549},{"suit_name":"黑色的轿车图片绝色风景壁纸2","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0E/04/ChMkJl4lD9iIZxukAAgDL5Dc2_QAAweCwBrDucACANH455.jpg","target_url":"/bizhi/8555_105730_2.html","level":1,"type":1,"id":8555},{"suit_name":"超级跑车法拉利图片壁纸","thumb_url":"https://desk-fd.zol-img.com.cn/t_s208x130c5/g1/M03/03/06/ChMljV401HyID4kiAAlPTKlcxxwAAQJNwIKmV8ACU9k193.jpg","target_url":"/bizhi/8565_105814_2.html","level":1,"type":1,"id":8565}]
         * pageNum : 1
         * pageSize : 10
         * size : 10
         * startRow : 1
         * endRow : 10
         * pages : 6
         * prePage : 0
         * nextPage : 2
         * isFirstPage : true
         * isLastPage : false
         * hasPreviousPage : false
         * hasNextPage : true
         * navigatePages : 8
         * navigatepageNums : [1,2,3,4,5,6]
         * navigateFirstPage : 1
         * navigateLastPage : 6
         * firstPage : 1
         * lastPage : 6
         */

        private int total;
        private int pageNum;
        private int pageSize;
        private int size;
        private int startRow;
        private int endRow;
        private int pages;
        private int prePage;
        private int nextPage;
        private boolean isFirstPage;
        private boolean isLastPage;
        private boolean hasPreviousPage;
        private boolean hasNextPage;
        private int navigatePages;
        private int navigateFirstPage;
        private int navigateLastPage;
        private int firstPage;
        private int lastPage;
        private List<SuitBean> list;
        private List<Integer> navigatepageNums;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getStartRow() {
            return startRow;
        }

        public void setStartRow(int startRow) {
            this.startRow = startRow;
        }

        public int getEndRow() {
            return endRow;
        }

        public void setEndRow(int endRow) {
            this.endRow = endRow;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getPrePage() {
            return prePage;
        }

        public void setPrePage(int prePage) {
            this.prePage = prePage;
        }

        public int getNextPage() {
            return nextPage;
        }

        public void setNextPage(int nextPage) {
            this.nextPage = nextPage;
        }

        public boolean isIsFirstPage() {
            return isFirstPage;
        }

        public void setIsFirstPage(boolean isFirstPage) {
            this.isFirstPage = isFirstPage;
        }

        public boolean isIsLastPage() {
            return isLastPage;
        }

        public void setIsLastPage(boolean isLastPage) {
            this.isLastPage = isLastPage;
        }

        public boolean isHasPreviousPage() {
            return hasPreviousPage;
        }

        public void setHasPreviousPage(boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
        }

        public boolean isHasNextPage() {
            return hasNextPage;
        }

        public void setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
        }

        public int getNavigatePages() {
            return navigatePages;
        }

        public void setNavigatePages(int navigatePages) {
            this.navigatePages = navigatePages;
        }

        public int getNavigateFirstPage() {
            return navigateFirstPage;
        }

        public void setNavigateFirstPage(int navigateFirstPage) {
            this.navigateFirstPage = navigateFirstPage;
        }

        public int getNavigateLastPage() {
            return navigateLastPage;
        }

        public void setNavigateLastPage(int navigateLastPage) {
            this.navigateLastPage = navigateLastPage;
        }

        public int getFirstPage() {
            return firstPage;
        }

        public void setFirstPage(int firstPage) {
            this.firstPage = firstPage;
        }

        public int getLastPage() {
            return lastPage;
        }

        public void setLastPage(int lastPage) {
            this.lastPage = lastPage;
        }

        public List<SuitBean> getList() {
            return list;
        }

        public void setList(List<SuitBean> list) {
            this.list = list;
        }

        public List<Integer> getNavigatepageNums() {
            return navigatepageNums;
        }

        public void setNavigatepageNums(List<Integer> navigatepageNums) {
            this.navigatepageNums = navigatepageNums;
        }


    }
}
