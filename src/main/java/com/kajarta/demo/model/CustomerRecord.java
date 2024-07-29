package com.kajarta.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "customer_record")
public class CustomerRecord {

    @Id
    private Integer customerId;

    private String customerIP;

    private Date customerUpdateTime;

    private Integer brandId01; // HONDA(品牌)
    private Integer brandId02; // TOYOTA(品牌)
    private Integer brandId03; // MAZDA(品牌)
    private Integer brandId04; // BENZ(品牌)
    private Integer brandId05; // PORSCHE(品牌)
    private Integer brandId06; // BMW(品牌)
    private Integer brandId07; // VOLKSWAGEN(品牌)
    private Integer brandId08; // NISSAN(品牌)
    private Integer brandId09; // SUBARU(品牌)

    private Integer displacementId01; // 1200以下(排氣量)
    private Integer displacementId02; // 1201-1800(排氣量)
    private Integer displacementId03; // 1801-2400(排氣量)
    private Integer displacementId04; // 2401-3000(排氣量)
    private Integer displacementId05; // 3001-4200(排氣量)
    private Integer displacementId06; // 4201-5400(排氣量)
    private Integer displacementId07; // 5401以上(排氣量)

    private Integer doorId01; // 二門(門數)
    private Integer doorId02; // 三門(門數)
    private Integer doorId03; // 四門(門數)
    private Integer doorId04; // 五門(門數)
    private Integer doorId05; // 六門(門數)

    private Integer passengerId01; // 二人座(乘客數)
    private Integer passengerId02; // 四人座(乘客數)
    private Integer passengerId03; // 五人座(乘客數)
    private Integer passengerId04; // 七人座以上(乘客數)

    private Integer gasolineId01; // 汽油(燃料)
    private Integer gasolineId02; // 柴油(燃料)
    private Integer gasolineId03; // 油電複合(燃料)
    private Integer gasolineId04; // 純電(燃料)

    private Integer rearWheelId01; // 前驅(驅動)
    private Integer rearWheelId02; // 後驅(驅動)
    private Integer rearWheelId03; // 四驅(驅動)

    private Integer suspensionId01; // 轎車(車型)
    private Integer suspensionId02; // 休旅車(車型)
    private Integer suspensionId03; // 敞篷車(車型)
    private Integer suspensionId04; // 跑車(車型)
    private Integer suspensionId05; // 吉普車(車型)
    private Integer suspensionId06; // 掀背車(車型)

    private Integer transmissionId01; // 自排(打檔)
    private Integer transmissionId02; // 手排(打檔)
    private Integer transmissionId03; // 手自排(打檔)
    private Integer transmissionId04; // 自手排(打檔)

    private Integer count;// (點及商品次數)

    private BigDecimal productionYearAVG; // (出廠年份)

    private BigDecimal milageAVG; // (里程)

    private BigDecimal scoreAVG; // (車評分)

    private BigDecimal hpAVG; // (馬力)

    private BigDecimal torqueAVG; // (扭力)

}
