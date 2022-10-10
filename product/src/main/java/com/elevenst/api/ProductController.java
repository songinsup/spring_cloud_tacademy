package com.elevenst.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping(path = "{productId}")
    public String getProductInfo(@PathVariable String productId) {

//        int milliseconds = 4000;
//        try {
//            Thread.sleep(milliseconds);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("after sleep "+(milliseconds/1000)+" seconds.");

        String resultStr ="[product id = " + productId + " at " + System.currentTimeMillis() + "]";
        System.out.println(resultStr);
        return resultStr;
//        throw new RuntimeException("I/O Exception");
    }
}
