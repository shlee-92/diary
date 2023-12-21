package lsh.prj.diary.domain.in;

import lombok.Getter;
import lombok.Setter;
import lsh.prj.diary.domain.ComCol;
@Getter
@Setter
public class HomeInput extends ComCol {
    private String accId;

    private String clnNo;

    private String empNo;

    private String accPw;

    private String accPwChk;

    private String pwChkQ;

    private String pwChkA;

    private String accTp;
}
