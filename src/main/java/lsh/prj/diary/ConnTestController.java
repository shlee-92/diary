package lsh.prj.diary;

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
@RequestMapping(value = "/api/conn")
public class ConnTestController {
    private final HomeService homeService;

    @GetMapping("/test")
    public ResponseEntity<Object> connectTest(String str)
    {
        log.info("################## ConnTestController.testConnect START ##################");

        String result = "";

        try {
            result = "연결되었습니다.";
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

        log.info("################## ConnTestController.testConnect END ##################");

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/database")
    public ResponseEntity<Object> connectDatabase(HomeInput input)
    {
        log.info("################## ConnTestController.connectDatabase START ##################");

        List<HomeOutput> result = new ArrayList<HomeOutput>();
        String resultMsg = "";

        try {
            input.setAccId("admin");
            result = homeService.selectHome(input);
            resultMsg = "DB 연결되었습니다. >> " + result.get(0).getAccId();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

        log.info("################## ConnTestController.connectDatabase END ##################");

        return ResponseEntity.status(HttpStatus.OK).body(resultMsg);
    }
}
