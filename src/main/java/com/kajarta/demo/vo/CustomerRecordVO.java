package com.kajarta.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRecordVO {

    @Schema(description = "客戶ID")
    private Integer customerId;

    @Schema(description = "客戶IP")
    private String customerIP;

    @Schema(description = "修改時間")
    private Date customerUpdateTime;

    @Schema(description = "HONDA 01")
    private Integer brandId01; // HONDA(品牌)
    @Schema(description = "TOYOTA 02")
    private Integer brandId02; // TOYOTA(品牌)
    @Schema(description = "MAZDA 03")
    private Integer brandId03; // MAZDA(品牌)
    @Schema(description = "BENZ 04")
    private Integer brandId04; // BENZ(品牌)
    @Schema(description = "PORSCHE 05")
    private Integer brandId05; // PORSCHE(品牌)
    @Schema(description = "BMW 06")
    private Integer brandId06; // BMW(品牌)
    @Schema(description = "VOLKSWAGEN 07")
    private Integer brandId07; // VOLKSWAGEN(品牌)
    @Schema(description = "NISSAN 08")
    private Integer brandId08; // NISSAN(品牌)
    @Schema(description = "SUBARU 09")
    private Integer brandId09; // SUBARU(品牌)

    @Schema(description = "1200以下(排氣量) 11")
    private Integer displacementId01; // 1200以下(排氣量)
    @Schema(description = "1201-1800(排氣量) 12")
    private Integer displacementId02; // 1201-1800(排氣量)
    @Schema(description = "1801-2400(排氣量) 13")
    private Integer displacementId03; // 1801-2400(排氣量)
    @Schema(description = "2401-3000(排氣量) 14")
    private Integer displacementId04; // 2401-3000(排氣量)
    @Schema(description = "3001-4200(排氣量) 15")
    private Integer displacementId05; // 3001-4200(排氣量)
    @Schema(description = "4201-5400(排氣量) 16")
    private Integer displacementId06; // 4201-5400(排氣量)
    @Schema(description = "5401以上(排氣量) 17")
    private Integer displacementId07; // 5401以上(排氣量)

    @Schema(description = "二門 21")
    private Integer doorId01; // 二門(門數)
    @Schema(description = "三門 22")
    private Integer doorId02; // 三門(門數)
    @Schema(description = "四門 23")
    private Integer doorId03; // 四門(門數)
    @Schema(description = "五門 24")
    private Integer doorId04; // 五門(門數)
    @Schema(description = "六門 25")
    private Integer doorId05; // 六門(門數)

    @Schema(description = "二人座 31")
    private Integer passengerId01; // 二人座(乘客數)
    @Schema(description = "四人座 32")
    private Integer passengerId02; // 四人座(乘客數)
    @Schema(description = "五人座 33")
    private Integer passengerId03; // 五人座(乘客數)
    @Schema(description = "七人座以上 34")
    private Integer passengerId04; // 七人座以上(乘客數)

    @Schema(description = "汽油 41")
    private Integer gasolineId01; // 汽油(燃料)
    @Schema(description = "柴油 42")
    private Integer gasolineId02; // 柴油(燃料)
    @Schema(description = "油電複合 43")
    private Integer gasolineId03; // 油電複合(燃料)
    @Schema(description = "純電 44")
    private Integer gasolineId04; // 純電(燃料)

    @Schema(description = "前驅 51")
    private Integer rearWheelId01; // 前驅(驅動)
    @Schema(description = "後驅 52")
    private Integer rearWheelId02; // 後驅(驅動)
    @Schema(description = "四驅 53")
    private Integer rearWheelId03; // 四驅(驅動)

    @Schema(description = "轎車 61")
    private Integer suspensionId01; // 轎車(車型)
    @Schema(description = "休旅車 62")
    private Integer suspensionId02; // 休旅車(車型)
    @Schema(description = "敞篷車 63")
    private Integer suspensionId03; // 敞篷車(車型)
    @Schema(description = "跑車 64")
    private Integer suspensionId04; // 跑車(車型)
    @Schema(description = "吉普車 65")
    private Integer suspensionId05; // 吉普車(車型)
    @Schema(description = "掀背車 66")
    private Integer suspensionId06; // 掀背車(車型)

    @Schema(description = "自排 71")
    private Integer transmissionId01; // 自排(打檔)
    @Schema(description = "手排 72")
    private Integer transmissionId02; // 手排(打檔)
    @Schema(description = "手自排 73")
    private Integer transmissionId03; // 手自排(打檔)
    @Schema(description = "自手排 74")
    private Integer transmissionId04; // 自手排(打檔)

    @Schema(description = "點及商品次數")
    private Integer count;// (點及商品次數)

    @Schema(description = "出廠年份")
    private BigDecimal productionYearAVG; // (出廠年份)
    private Integer productionYearCount;

    @Schema(description = "里程")
    private BigDecimal milageAVG; // (里程)
    private Integer milageCount;

    @Schema(description = "車評分")
    private BigDecimal scoreAVG; // (車評分)
    private Integer scoreCount;

    @Schema(description = "馬力")
    private BigDecimal hpAVG; // (馬力)
    private Integer hpCount;

    @Schema(description = "扭力")
    private BigDecimal torqueAVG; // (扭力)
    private Integer torqueCount;

    @Schema(description = "No.1在意")
    private Integer no01Care;

    @Schema(description = "No.2在意")
    private Integer no02Care;

    @Schema(description = "No.3在意")
    private Integer no03Care;
}
