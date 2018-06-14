package com.wy.cabinet.model;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 用户表
 */
public class User implements Serializable {
    private int userId; // UserId
    private String userName; // 登陆名这里是登录手机号
    private int userType; // 0 员工 1管理员 2其他 3其他
    private String trueName; // 真实姓名
    private String nickName; // 昵称
    private String email; // 自有邮箱
    private String mobile; // 手机号
    private String sex; // 性别0女1男
    private String birthday; // 生日日期yyyy-MM-dd
    private String paperType; // 证件类型
    private String paper; // 身份证号码
    private int userCredits; // 用户信用
    private String workStartDate; // 入职日期
    private String workEndDate; // 离职时间
    private int isOutWork; // 0在职 1离职
    private String province; // 当前所在省
    private String city; // 当前所在市区
    private int isMarried; // 是否已婚0未婚1已婚
    private String workNo; // 工号
    private int mobileIsValid; // 手机是否验证
    private String mobileValidTime; // 手机验证时间
    private int emailIsValid; // 邮箱是否验证
    private String emailValidTime; // 邮箱验证时间
    private String tags; // 标签
    private String headPic; // 头像
    private int corpId; // 公司ID
    private String corpName; // 公司名称
    private String deptName; // 部门名称
    private BigDecimal userMoney; // 用户余额
    private BigDecimal userScore; // 用户积分
    private int isFirstLogin; //  1是优福网未激活 2是 账户式医疗基金未激活 0是已激活 直接进首页
    private String firstPassword; // 初始密码
    private String corpPic; //公司图标
    private String corpMobilePic ;//公司图标手机端
    private boolean isExistCard;//是否存在直付通卡
    private String easeMobPwd; //环信聊天密码

    public String getEaseMobPwd() {
        return easeMobPwd;
    }

    public void setEaseMobPwd(String easeMobPwd) {
        this.easeMobPwd = easeMobPwd;
    }

    public boolean isExistCard() {
        return isExistCard;
    }

    public void setExistCard(boolean existCard) {
        isExistCard = existCard;
    }

    public String getCorpMobilePic() {
        return corpMobilePic;
    }

    public void setCorpMobilePic(String corpMobilePic) {
        this.corpMobilePic = corpMobilePic;
    }

    public String getCorpPic() {
        return corpPic;
    }

    public void setCorpPic(String corpPic) {
        this.corpPic = corpPic;
    }

    public int getIsSetPayPassword() {
        return isSetPayPassword;
    }

    public void setIsSetPayPassword(int isSetPayPassword) {
        this.isSetPayPassword = isSetPayPassword;
    }

    private int isSetPayPassword;//是否设置过支付密码

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public int getUserCredits() {
        return userCredits;
    }

    public void setUserCredits(int userCredits) {
        this.userCredits = userCredits;
    }

    public String getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(String workStartDate) {
        this.workStartDate = workStartDate;
    }

    public String getWorkEndDate() {
        return workEndDate;
    }

    public void setWorkEndDate(String workEndDate) {
        this.workEndDate = workEndDate;
    }

    public int getIsOutWork() {
        return isOutWork;
    }

    public void setIsOutWork(int isOutWork) {
        this.isOutWork = isOutWork;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(int isMarried) {
        this.isMarried = isMarried;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public int getMobileIsValid() {
        return mobileIsValid;
    }

    public void setMobileIsValid(int mobileIsValid) {
        this.mobileIsValid = mobileIsValid;
    }

    public String getMobileValidTime() {
        return mobileValidTime;
    }

    public void setMobileValidTime(String mobileValidTime) {
        this.mobileValidTime = mobileValidTime;
    }

    public int getEmailIsValid() {
        return emailIsValid;
    }

    public void setEmailIsValid(int emailIsValid) {
        this.emailIsValid = emailIsValid;
    }

    public String getEmailValidTime() {
        return emailValidTime;
    }

    public void setEmailValidTime(String emailValidTime) {
        this.emailValidTime = emailValidTime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public int getCorpId() {
        return corpId;
    }

    public void setCorpId(int corpId) {
        this.corpId = corpId;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getUserScore() {
        return userScore;
    }

    public void setUserScore(BigDecimal userScore) {
        this.userScore = userScore;
    }

    public int getIsFirstLogin() {
        return isFirstLogin;
    }

    public void setIsFirstLogin(int isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    public String getFirstPassword() {
        return firstPassword;
    }

    public void setFirstPassword(String firstPassword) {
        this.firstPassword = firstPassword;
    }
}
