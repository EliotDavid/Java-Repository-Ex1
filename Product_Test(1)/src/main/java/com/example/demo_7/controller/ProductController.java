package com.example.demo_7.controller;

import com.example.demo_7.domain.ImageObject;
import com.example.demo_7.dto.ProductDto;
import com.example.demo_7.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;

//@RequiredArgsConstructor
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("addProduct") // 얘가 이쪽 주소(request)를 받으면 해당 위치로 뿌려주는 역할
    public String addProduct(){
        return"addProduct";
    } // 뷰에서 얘가 요청 받으면 내가 가지고 있는 addProduct.html로 이동을 하는 메서드

    @PostMapping("addProduct") // 얘가 이쪽 주소(request)를 받으면 해당 위치로 뿌려주는 역할
    public String addImage(MultipartFile file, ProductDto dto) throws Exception
    {
        productService.save(file, dto);
        return"redirect:/";
    } // addProduct.html에서 상품이 맵핑이 되면 이 메서드가 호출됨







}
