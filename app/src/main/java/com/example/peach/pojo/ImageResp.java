package com.example.peach.pojo;

import com.example.peach.pojo.bean.ImageBean;

import java.util.List;

/**
 * -description:
 * -author: created by tang on 2020/5/14 16:19
 */
public class ImageResp {


    /**
     * code : 200
     * msg : 请求成功
     * data : [{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJ1bKwXWIaekbAAoNguMjjogAALGYgJvW2AACg2a545.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWIPutEAAWCqA53_FMAALGYgMWLaAABYLA275.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJ1bKwXWIKNF9AA8Mea0Sfh4AALGYgL58qsADwyR861.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWIVxYVAAePJ2CQt4UAALGYgLoJh0AB48_042.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJ1bKwXWIJ9hAAAnxextGhTQAALGYgLeNIoACfGT149.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWICy9NAAsvOgNtGHMAALGYgLTBTgACy9S302.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJ1bKwXWIILS4AAsarGf28VMAALGYgLBZPsACxrE615.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWIPyyDAAgl9lmKeNgAALGYgKmy90ACCYO063.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJ1bKwXWIfEZKAAdij1tUPvEAALGYgKYxj0AB2Kn644.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJ1bKwXWIeURyAAf1h_W3OqEAALGYgKQ0J4AB_Wf383.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWIRQsPAAlkJ37Qq8YAALGYgJ5aPoACWQ_856.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWIc4WHAA3KhmrwyAoAALGYgMdPtkADcqe188.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWIKGOhAAo9N2xb4v4AALGYgLvtVwACj1P098.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJ1bKwXWIBC7JAA0uTGZIAUUAALGYgMI_zwADS5k457.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJ1bKwXWIRtoCAAaFYRBFQvwAALGYgLMf78ABoV5569.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWIN7LaAAb5K_C4BCIAALGYgK6a7gABvlD215.jpg","level":1,"type":1,"suit_id":195},{"suit_name":"美丽的草原风光宽屏壁纸","img_url":"https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/01/0E/ChMkJlbKwXWId9jXAASljfA7zUsAALGYgKgTZMABKWl335.jpg","level":1,"type":1,"suit_id":195}]
     */

    private int code;
    private String msg;
    private List<ImageBean> data;

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

    public List<ImageBean> getData() {
        return data;
    }

    public void setData(List<ImageBean> data) {
        this.data = data;
    }

}
