package com.example.demo_7.service;

import com.example.demo_7.domain.ImageObject;
import com.example.demo_7.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;


@Transactional(readOnly = true)// 얘 뭐하는 애지? : 무조건 읽기전용으로 쓰겠다는 것 / 기본이 false임 / 상품에 대한 특정 정보가 바뀌어야 될 때 쓰는거라든데 뭔지 못들음
//@RequiredArgsConstructor // 얘는 뭐하는 애냐면 final이 붙어 있거나 @NotNull이 붙어있는 필드값에 생성자를 자동으로 생성한다
@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;
    @Transactional
    public void save(MultipartFile file) throws Exception{
        //System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\images"; ; // 현재 이 프로젝트 위치에 해당하는 위치가 저장됨 +

        UUID uuid = UUID.randomUUID(); // UUID : 파일명을 랜덤값으로 잡아주는 기능
        String fileName = uuid + "_" + file.getOriginalFilename();
        //System.out.println(fileName);

        File saved = new File(filePath, fileName);// File은 임폴트 클래스로 임폴트 해줘야함
        file.transferTo(saved); //


        ImageObject product = new ImageObject(filePath, fileName);
        productRepository.save(product);

    }

    
}
