package lsh.prj.diary.domain.in;

import lombok.Getter;
import lombok.Setter;
import lsh.prj.diary.domain.ComDomain;
@Getter
@Setter
public class HomeInput extends ComDomain {
    private String accId;

    private String clnNo;

    private String empNo;

    private String accPw;

    private String accPwChk;

    private String pwChkQ;

    private String pwChkA;

    private String accTp;
}
