package lsh.prj.diary.contoller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lsh.prj.diary.domain.in.HomeInput;
import lsh.prj.diary.domain.out.HomeOutput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserController {
    @GetMapping("/login")
    public ResponseEntity<Object> selectContent(@RequestBody HomeInput input)
    {
        log.info("################## HomeController.selectContent START ##################");

        List<HomeOutput> result = new ArrayList<HomeOutput>();

        try {
            result = null;
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

        log.info("################## HomeController.selectContent END ##################");
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }


}
