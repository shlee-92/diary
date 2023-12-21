package lsh.prj.diary.service.impl;

import lombok.extern.slf4j.Slf4j;
import lsh.prj.diary.domain.in.HomeInput;
import lsh.prj.diary.domain.out.HomeOutput;
import lsh.prj.diary.mapper.HomeMapper;
import lsh.prj.diary.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class HomeServiceImpl implements HomeService {
    @Autowired
    private HomeMapper homeMapper;

    @Override
    public List<HomeOutput> home(HomeInput str) {
        List<HomeOutput> output = new ArrayList<HomeOutput>();
        output = homeMapper.selectHome(str);

        return output;
    }
}
