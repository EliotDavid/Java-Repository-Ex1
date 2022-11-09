package com.example.demo_7.service;

import com.example.demo_7.domain.ImageObject;
import com.example.demo_7.dto.ProductDto;
import com.example.demo_7.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;


@Transactional(readOnly = true)// 얘 뭐하는 애지? : 무조건 읽기전용으로 쓰겠다는 것 / 기본이 false임 / 상품에 대한 특정 정보가 바뀌어야 될 때 쓰는거라든데 뭔지 못들음
//readOnly = true가 되었을 때는 이 클래스를 읽기전용으로 쓰겠다는 뜻인데
// 이 Transactioanl이 적용된 클래스안에 어떤 함수에 이 Transactioanl 어노테이션이 적용되어 있으면 쓰기전용까지 같이 하겠다는 뜻

//@RequiredArgsConstructor // 얘는 뭐하는 애냐면 final이 붙어 있거나 @NotNull이 붙어있는 필드값에 생성자를 자동으로 생성한다


@Service // @Service 어노테이션을 달앚우는 이유는 추상적인계층을 만들어주기 위해 달아주는거임
            // 그렇게 해서 @Autowired 어노테이션을 통해서 밑에처럼 ProductRepository productRepository를 코드해주면
            // productRepository가 가지고 있는 메서드들이 이미 암묵적으로 이 클래스에 상속관계처럼 있다는 말임
public class ProductService {


    @Autowired
    private ProductRepository productRepository;
    @Transactional
    public void save(MultipartFile file, ProductDto dto) throws Exception{
        //System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\images"; ; // 현재 이 프로젝트 위치에 해당하는 위치가 저장됨 +

        UUID uuid = UUID.randomUUID(); // UUID : 파일명을 랜덤값으로 잡아주는 기능
        String fileName = uuid + "_" + file.getOriginalFilename();
        //System.out.println(fileName);

        File saved = new File(filePath, fileName);// File은 임폴트 클래스로 임폴트 해줘야함
        file.transferTo(saved); // images 파일로 저장하라는 코드


        ImageObject product = new ImageObject(dto.getTitle(), dto.getContent(), dto.getCount(), dto.getPrice(), fileName, filePath);
        productRepository.save(product);



    }

    
}
