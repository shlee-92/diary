package lsh.prj.diary.domain.out;

import lombok.Getter;
import lombok.Setter;
import lsh.prj.diary.domain.ComDomain;

@Getter
@Setter
public class HomeOutput extends ComDomain {
    private String accId;

    private String clnNo;

    private String empNo;

    private String accPw;

    private String accPwChk;

    private String pwChkQ;

    private String pwChkA;

    private String accTp;

    // CL_CLN_BSE
    private String clnCcd;

    private String clnIcd;

    private String clnRegDt;

    private String clnDelDt;

}
