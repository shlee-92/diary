package lsh.prj.diary.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ComCol {
    // 최초등록ID
    private String fsEnId;

    // 최초등록일시
    private String fsEnDt;

    // 최종수정ID
    private String lsMdId;

    // 최종수정일시
    private String lsMdDt;
}
