package lsh.prj.diary.mapper;

import lsh.prj.diary.domain.in.HomeInput;
import lsh.prj.diary.domain.out.HomeOutput;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface HomeMapper {
    public List<HomeOutput> selectHome(HomeInput str);
}
