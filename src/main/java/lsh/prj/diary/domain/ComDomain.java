package lsh.prj.diary.domain;

import lombok.Getter;
import java.text.SimpleDateFormat;
import lombok.Setter;

import java.util.Date;
import java.util.Formatter;

@Getter
@Setter
public class ComDomain {
    // 최초등록ID
    private String fsEnId;

    // 최초등록일시
    private String fsEnDt;

    // 최종수정ID
    private String lsMdId;

    // 최종수정일시
    private String lsMdDt;

    public ComDomain() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(date);

        this.fsEnDt = now;
        this.lsMdDt = now;
    }
}
