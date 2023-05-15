package kr.co.Lemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @since 2023/04/11
 * @author 서정현
 * @apiNote product_visitors_log 방문자 로그 entity
 */
@Document(collection = "product_visitors_log")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VisitorsLogEntity {
    @Id
    private String id;
    private String acc_id;
    private String username;
    private String ip;
    private Date date;
    private String sessionid;
    private String device;
}
