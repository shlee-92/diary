package lsh.prj.diary.contoller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lsh.prj.diary.domain.in.HomeInput;
import lsh.prj.diary.domain.out.HomeOutput;
import lsh.prj.diary.service.HomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/home")
public class MainController {
    private final HomeService homeService;

    @GetMapping("/select")
    public ResponseEntity<Object> selectContent(@RequestBody HomeInput input)
    {
        log.info("################## HomeController.selectContent START ##################");

        List<HomeOutput> result = new ArrayList<HomeOutput>();

        try {
            result = homeService.selectHome(input);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

        log.info("################## HomeController.selectContent END ##################");
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PutMapping("/insert")
    public ResponseEntity<Object> insertContent(@RequestBody HomeInput input)
    {
        return ResponseEntity.status(HttpStatus.OK).body("insert!!");
    }

    @PostMapping("/update")
    public ResponseEntity<Object> updateContent(@RequestBody HomeInput input)
    {
        return ResponseEntity.status(HttpStatus.OK).body("update!!");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteContent(@RequestBody HomeInput input)
    {
        return ResponseEntity.status(HttpStatus.OK).body("delete!!");
    }
}
