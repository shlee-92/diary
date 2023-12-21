package lsh.prj.diary.service;

import lsh.prj.diary.domain.in.HomeInput;
import lsh.prj.diary.domain.out.HomeOutput;

import java.util.List;

public interface HomeService {
    List<HomeOutput> home(HomeInput str);
}
