package com.zcy.openapi;

import com.alibaba.fastjson.JSON;
import com.zcy.openapi.constant.ZcyConstant;
import com.zcy.openapi.http.HttpMethod;
import model.Item;
import model.ItemDetail;
import model.RequestData;
import model.Sku;
import model.SkuAttribute;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiang.wei on 2017/11/5
 */
public class AddItemService {
    public static void main(String[] args) {
        new ZcyGoodService().add();
    }

    //{"success":true,"result":2111723}
    public void add(){
        Item item = new Item();
        item.setMainImage("http://zcy-item.img-cn-hangzhou.aliyuncs.com/1_04991693774046245.jpg");
        item.setBrandName("haier");
        item.setItemCode("20171025160722301-003");
        item.setName("苹果 iPhone6S Plus 手机 玫瑰金 三网通 16G");
        item.setCategoryId("992");
        item.setSelfPlatformLink("https://detail.tmall.hk/hk/item.htm?spm=a220m.1000858.1000725.7");
        item.setNeedInstall("1");
        item.setSpecification("海尔122212");
        item.setLimit("1");
        item.setCountryId("2");
        item.setProvinceId("3");
        item.setCityId("4");
        item.setRegionId("5");
        item.setFirm("生产厂商");

        Sku sku = new Sku();
        sku.setQuantity("10");
        sku.setPrice("200");
        sku.setOriginPrice("200");
        sku.setPlatformPrice("4000");
        sku.setSkuCode("20171025161720361-0003");



        SkuAttribute skuAttribute1 = new SkuAttribute("xl", "28256", "型号");
        SkuAttribute skuAttribute2 = new SkuAttribute("华为", "28255", "品牌");
        SkuAttribute skuAttribute3 = new SkuAttribute("需要", "28261", "是否需要安装");
        SkuAttribute skuAttribute4 = new SkuAttribute("华为", "28260", "生产厂商");


        ItemDetail itemDetail = new ItemDetail();
        itemDetail.getImages().add("http://zcy-item.img-cn-hangzhou.aliyuncs.com/2/2-1发商品-默认.jpg");
        itemDetail.getImages().add("http://zcy-item.img-cn-hangzhou.aliyuncs.com/2/2-2发商品-默认.jpg");
        itemDetail.setDetail("<img src=\"http://www.okwuyou.com/images/upload/Image/7%2010/9250_01.jpg\" alt=\"img\" />");

        RequestData requestData = new RequestData();
        requestData.setItem(item);
        requestData.getSkus().add(sku);
        requestData.setItemDetail(itemDetail);
        requestData.getOtherAttributes().add(skuAttribute1);
        requestData.getOtherAttributes().add(skuAttribute2);
        requestData.getOtherAttributes().add(skuAttribute3);
        requestData.getOtherAttributes().add(skuAttribute4);

        /*组装Body参数*/
        Map<String, Object> bodyMap = new HashMap<String, Object>();
        JSONObject jsonObject = new JSONObject();

        /*发送http request*/
        String result = null;
        try {
//			jsonObject.put("data",requestData);
            jsonObject.put("data", JSON.toJSONString(requestData).replace("\\\"", "'"));
            System.out.println(jsonObject.toString());


            ZcyOpenRequest zcyOpenRequest = new ZcyOpenRequest(
                    ZcyConstant.getAppKey(),ZcyConstant.getSecret(),ZcyConstant.getApiGateway());
//            zcyOpenRequest.setUri(ZcyConstant.getUpdateGoodsUrl());
            zcyOpenRequest.setUri(ZcyConstant.getAddGoodsUrl());
            zcyOpenRequest.setMethod(HttpMethod.POST);
            bodyMap.put("_data_", jsonObject.toString());
            zcyOpenRequest.setParamMap(bodyMap);
            result = ZcyOpenClient.excute(zcyOpenRequest);
			 /*打印返回结果*/
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
