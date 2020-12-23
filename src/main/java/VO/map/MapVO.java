package VO.map;

public class MapVO {
    // 시설명
    private String FACI_NM;
    // 시설구분코드(P:공공, N:신고: R:등록)
    private String FACI_GB_CD;
    // 시설구명
    private String FACI_GB_NM;
    // 업종코드
    private String FCOB_CD;
    // 업종명
    private String FCPB_NM;
    // 시설유형코드
    private String FTYPE_CD;
    // 시설유형명
    private String FTYPE_NM;
    // 소유주체코드
    private String FMNG_TYPE_GB_CD;
    // 소유주체명
    private String FMNG_TYPE_GB_NM;
    // 소유주체 시도코드
    private String FMNG_CP_CD;
    // 소유주체 시도명
    private String FMNG_CP_NM;
    // 소유주체 시도군코드
    private String FMNG_CPB_CD;
    // 소유주체 시군구명
    private String FMNG_CPB_NM;
    // 담당자 부서
    private String FMNG_DEPT_NM;
    // 담당자 연락처
    private String FMNG_USER_TEL;
    // 도로명 시도코드
    private String ADDR_CP_CD;
    // 도로명 시도명
    private String ADDR_CP_NM;
    // 도로명 시군구코드
    private String ADDR_CPB_CD;
    // 도로명 시군구명
    private String ADDR_CPB_NM;
    // 도로명 동읍면코드
    private String ADDR_EMD_CD;
    // 도로명 동읍면명
    private String ADDR_EMD_NM;
    // 도로명 리코드
    private String ADDR_AMD_CD;
    // 도로명 리명
    private String ADDR_AMD_NM;
    // 도로명 주소
    private String FACI_ROAD_ADDR1;
    // 경도
    private String FACI_POINT_X;
    // 위도
    private String FACI_POINT_Y;
    // 시설면적
    private Long TOT_FACI_AREA;
    // 수용인원
    private Long STAND_CPT_PSN_CNT;
    // 관람석
    private Long STAND_SEAT_CNT;
    // 홈페이지
    private String FACI_HOMEPAGE;
    // (국가체육시설:Y, 미국가체육시설:N)
    private String NATION_YN;
    // 시설상태(00:정상운영, 99:운영폐쇄)
    private String FACI_STAT;
    // 시설삭제여부(삭제:Y, 미삭제:N)
    private String DEL_YN;
    // 좋아요
    private int like;
    // 싫어요
    private int dislike;
    // 조회수
    private int viewCnt;

    public String getFACI_NM() {
        return FACI_NM;
    }

    public void setFACI_NM(String FACI_NM) {
        this.FACI_NM = FACI_NM;
    }

    public String getFACI_GB_CD() {
        return FACI_GB_CD;
    }

    public void setFACI_GB_CD(String FACI_GB_CD) {
        this.FACI_GB_CD = FACI_GB_CD;
    }

    public String getFACI_GB_NM() {
        return FACI_GB_NM;
    }

    public void setFACI_GB_NM(String FACI_GB_NM) {
        this.FACI_GB_NM = FACI_GB_NM;
    }

    public String getFCOB_CD() {
        return FCOB_CD;
    }

    public void setFCOB_CD(String FCOB_CD) {
        this.FCOB_CD = FCOB_CD;
    }

    public String getFCPB_NM() {
        return FCPB_NM;
    }

    public void setFCPB_NM(String FCPB_NM) {
        this.FCPB_NM = FCPB_NM;
    }

    public String getFTYPE_CD() {
        return FTYPE_CD;
    }

    public void setFTYPE_CD(String FTYPE_CD) {
        this.FTYPE_CD = FTYPE_CD;
    }

    public String getFTYPE_NM() {
        return FTYPE_NM;
    }

    public void setFTYPE_NM(String FTYPE_NM) {
        this.FTYPE_NM = FTYPE_NM;
    }

    public String getFMNG_TYPE_GB_CD() {
        return FMNG_TYPE_GB_CD;
    }

    public void setFMNG_TYPE_GB_CD(String FMNG_TYPE_GB_CD) {
        this.FMNG_TYPE_GB_CD = FMNG_TYPE_GB_CD;
    }

    public String getFMNG_TYPE_GB_NM() {
        return FMNG_TYPE_GB_NM;
    }

    public void setFMNG_TYPE_GB_NM(String FMNG_TYPE_GB_NM) {
        this.FMNG_TYPE_GB_NM = FMNG_TYPE_GB_NM;
    }

    public String getFMNG_CP_CD() {
        return FMNG_CP_CD;
    }

    public void setFMNG_CP_CD(String FMNG_CP_CD) {
        this.FMNG_CP_CD = FMNG_CP_CD;
    }

    public String getFMNG_CP_NM() {
        return FMNG_CP_NM;
    }

    public void setFMNG_CP_NM(String FMNG_CP_NM) {
        this.FMNG_CP_NM = FMNG_CP_NM;
    }

    public String getFMNG_CPB_CD() {
        return FMNG_CPB_CD;
    }

    public void setFMNG_CPB_CD(String FMNG_CPB_CD) {
        this.FMNG_CPB_CD = FMNG_CPB_CD;
    }

    public String getFMNG_CPB_NM() {
        return FMNG_CPB_NM;
    }

    public void setFMNG_CPB_NM(String FMNG_CPB_NM) {
        this.FMNG_CPB_NM = FMNG_CPB_NM;
    }

    public String getFMNG_DEPT_NM() {
        return FMNG_DEPT_NM;
    }

    public void setFMNG_DEPT_NM(String FMNG_DEPT_NM) {
        this.FMNG_DEPT_NM = FMNG_DEPT_NM;
    }

    public String getFMNG_USER_TEL() {
        return FMNG_USER_TEL;
    }

    public void setFMNG_USER_TEL(String FMNG_USER_TEL) {
        this.FMNG_USER_TEL = FMNG_USER_TEL;
    }

    public String getADDR_CP_CD() {
        return ADDR_CP_CD;
    }

    public void setADDR_CP_CD(String ADDR_CP_CD) {
        this.ADDR_CP_CD = ADDR_CP_CD;
    }

    public String getADDR_CP_NM() {
        return ADDR_CP_NM;
    }

    public void setADDR_CP_NM(String ADDR_CP_NM) {
        this.ADDR_CP_NM = ADDR_CP_NM;
    }

    public String getADDR_CPB_CD() {
        return ADDR_CPB_CD;
    }

    public void setADDR_CPB_CD(String ADDR_CPB_CD) {
        this.ADDR_CPB_CD = ADDR_CPB_CD;
    }

    public String getADDR_CPB_NM() {
        return ADDR_CPB_NM;
    }

    public void setADDR_CPB_NM(String ADDR_CPB_NM) {
        this.ADDR_CPB_NM = ADDR_CPB_NM;
    }

    public String getADDR_EMD_CD() {
        return ADDR_EMD_CD;
    }

    public void setADDR_EMD_CD(String ADDR_EMD_CD) {
        this.ADDR_EMD_CD = ADDR_EMD_CD;
    }

    public String getADDR_EMD_NM() {
        return ADDR_EMD_NM;
    }

    public void setADDR_EMD_NM(String ADDR_EMD_NM) {
        this.ADDR_EMD_NM = ADDR_EMD_NM;
    }

    public String getADDR_AMD_CD() {
        return ADDR_AMD_CD;
    }

    public void setADDR_AMD_CD(String ADDR_AMD_CD) {
        this.ADDR_AMD_CD = ADDR_AMD_CD;
    }

    public String getADDR_AMD_NM() {
        return ADDR_AMD_NM;
    }

    public void setADDR_AMD_NM(String ADDR_AMD_NM) {
        this.ADDR_AMD_NM = ADDR_AMD_NM;
    }

    public String getFACI_ROAD_ADDR1() {
        return FACI_ROAD_ADDR1;
    }

    public void setFACI_ROAD_ADDR1(String FACI_ROAD_ADDR1) {
        this.FACI_ROAD_ADDR1 = FACI_ROAD_ADDR1;
    }

    public String getFACI_POINT_X() {
        return FACI_POINT_X;
    }

    public void setFACI_POINT_X(String FACI_POINT_X) {
        this.FACI_POINT_X = FACI_POINT_X;
    }

    public String getFACI_POINT_Y() {
        return FACI_POINT_Y;
    }

    public void setFACI_POINT_Y(String FACI_POINT_Y) {
        this.FACI_POINT_Y = FACI_POINT_Y;
    }

    public Long getTOT_FACI_AREA() {
        return TOT_FACI_AREA;
    }

    public void setTOT_FACI_AREA(Long TOT_FACI_AREA) {
        this.TOT_FACI_AREA = TOT_FACI_AREA;
    }

    public Long getSTAND_CPT_PSN_CNT() {
        return STAND_CPT_PSN_CNT;
    }

    public void setSTAND_CPT_PSN_CNT(Long STAND_CPT_PSN_CNT) {
        this.STAND_CPT_PSN_CNT = STAND_CPT_PSN_CNT;
    }

    public Long getSTAND_SEAT_CNT() {
        return STAND_SEAT_CNT;
    }

    public void setSTAND_SEAT_CNT(Long STAND_SEAT_CNT) {
        this.STAND_SEAT_CNT = STAND_SEAT_CNT;
    }

    public String getFACI_HOMEPAGE() {
        return FACI_HOMEPAGE;
    }

    public void setFACI_HOMEPAGE(String FACI_HOMEPAGE) {
        this.FACI_HOMEPAGE = FACI_HOMEPAGE;
    }

    public String getNATION_YN() {
        return NATION_YN;
    }

    public void setNATION_YN(String NATION_YN) {
        this.NATION_YN = NATION_YN;
    }

    public String getFACI_STAT() {
        return FACI_STAT;
    }

    public void setFACI_STAT(String FACI_STAT) {
        this.FACI_STAT = FACI_STAT;
    }

    public String getDEL_YN() {
        return DEL_YN;
    }

    public void setDEL_YN(String DEL_YN) {
        this.DEL_YN = DEL_YN;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }
}
