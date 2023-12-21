package lsh.prj.diary.contoller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lsh.prj.diary.domain.in.HomeInput;
import lsh.prj.diary.domain.out.HomeOutput;
import lsh.prj.diary.service.HomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/home")
public class MainController {
    private final HomeService homeService;

    @GetMapping("/select")
    public List<HomeOutput> selectEditorContent(@RequestBody HomeInput input)
    {
        log.info("################## selectEditorContent START ##################");
        log.info("input param:: " + input);
        List<HomeOutput> result = homeService.home(input);

        log.info("################## selectEditorContent END ##################");
        return result;
    }

    @PostMapping("/editor")
    public List<HomeOutput> updateEditorContent(@RequestBody HomeInput input)
    {
        return homeService.home(input);
    }
}
