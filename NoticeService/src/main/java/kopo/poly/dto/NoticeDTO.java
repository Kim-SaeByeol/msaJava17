package kopo.poly.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public record NoticeDTO(
        Long noticeSeq,
        String title,
        String noticeYn,
        String contents,
        String userId,
        String readCnt,
        String regId,
        String regDt,
        String chgId,
        String chgDt,
        String userName
) {
}

