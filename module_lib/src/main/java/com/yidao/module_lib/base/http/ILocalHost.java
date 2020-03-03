package com.yidao.module_lib.base.http;

/**
 * Created by dream on 2017/7/20.
 * 请求地址的配置
 */

public interface ILocalHost {

    String getVersion = "/getVersion";//获取版本

    String register = "/user/registered";//注册

    String sendCode = "/user/verificationCode";//发送验证码

    String loginPass = "/user/newLogin";//用户账号密码登录

    String forgetPwd = "/user/forgetpwd";//忘记密码

    String squarePath = "/discover/newStarSquare";//广场

    String getVideoListByUser = "/mine/video/myProduction";//获取用户已发布的视频

    String getVideoDetails = "/video/videoDetails";//获取视频的详细信息

    String addNewSupport = "/support/addNewSupport";//点赞

    String getCommentList = "/comment/getCommentList";//获取评论列表

    String getReplyCommentList = "/comment/getReplyCommentList";//获取评论回复列表

    String addComment = "/comment/addComment";//发表评论

    String praiseComment = "/support/addNewSupport";//给评论点赞

    String addAttention = "/mine/attention/addAttention";//添加关注

    String getMessageList = "/mine/getMessageList";//获取消息列表

    String getNewAttentionList = "/mine/attention/newAttentionList";//个人中心新的关注/粉丝列表接口
    String getFansList = "/mine/getFansList";//消息—粉丝相关消息接口

    String publishVideo = "/video/publishVideo";//发布视频

    String getUploadToken = "/video/getUploadToken";//获取发布视频的token

    String getDynamicList = "/dynamic/getDynamicList";//获取动态列表

    String getHottestAndNewestScript = "/script/getHottestAndNewestScript";//获取搜索列表

    String getScriptList = "/script/list";//获取剧目列表

    String getUserInfo = "/starVideo/getUserInfo";//获取指定人员信息

    String completeUserInfo = "/user/newCompleteUserInfo";//修改指定人员信息

    String starRoad = "/user/myStardroad";//明星路

    String addBlacklist = "/blacklist/newAddBlacklist";//添加或移除黑名单
    String checkBlacklist = "/user/checkBlackList";//检查是否互相拉黑
    String getBlacklist = "/mine/getBlacklist";//获取黑名单列表

    String setAlbumCover = "/album/setAlbumCover";//修改个人中心封面

    String collectionScript = "/collectionRecord/addCollectionScript";//收藏剧目

    String collectionVideo = "/video/videoCollection";//收藏视频

    String getScriptDetail = "/script/scriptDetail";//获取剧目信息

    String getRoleDetail = "/script/roleDetails";//获取剧目角色招募

    String getRankListByRole = "/rank/getRankListByRole";//获取剧目排行榜

    String collectionRole = "/collectionRecord/addCollectionRecord";//收藏角色或剧目

    String collectionGood = "/goods/goodsCollection";//收藏商品

    String getScriptListByKeyword = "/script/getScriptByLike";//获取剧目根据关键字

    String getVideoListByKeyword = "/video/getVideoByKeyword";//获取视频根据关键字

    String getUserListByKeyword = "/user/getUserByKeyword";//获取用户根据关键字

    String getVideoCollectionList = "/video/getVideoCollectionList";//获取收藏的视频列表

    String getGoodsCollectionList = "/goods/getGoodsCollectionList";//获取收藏的商品列表

    String getOperaCollectionList = "/mine/collection/scriptList";//获取收藏的剧目列表

    String getRoleCollectionList = "/role/getCollectionRoleList";//获取收藏的角色列表

    String getSupportList = "/support/getSupportList";//获取点赞的视频列表

    String addInform = "/inform/addInform";//举报

    String getBannerList = "/script/bannerList";//获取剧目banner列表

    String getActorRank = "/user/getActorRank";//获取草心列表
    String getActorsByType = "/actor/getActorsByType";// 草星--获取对应艺人列表

    String getGoodsList = "/goods/getGoodsList";//分页获取商品

    String getGoodsDetail = "/goods/getGoods";//获取商品详情

    String getStoreList = "/goods/getStoreList";//商城列表接口

    String scriptBannerList = "/script/bannerList";//组讯banner

    String scriptList = "/script/list";//组讯banner

    String videoRanking ="/video/getVideoRanking";//人气排行榜

    String getRecommendUserList ="/user/getRecommendUserList";//获取系统推荐的用户

    String getTopVideos ="/video/getTopVideos";//获取今日最热视频列表

    String getBeSupportList ="/support/getBeSupportList";//获取点赞列表

    String getKeyWordList ="/find/getKeyWordList";//获取搜索栏关键词列表

    String getRankingRuleList ="/rank/getRankingRuleList";//获取榜单规则列表

    String scriptRanking ="/video/getScriptRanking";//飙戏榜

    //送礼
    String sendGiftPath = "/giftRecords/addGiftRecords";
    String giftInfoPath = "/gift/getGiftListAndAccount";

    String getFriendList = "/mine/attention/friendListPage"; //获取好友列表

    String viewFullVideo = "/video/viewFullVideo"; //用户观看完整视频后调用该接口
    String getAddressBook = "/mine/user/getAddressBook2"; //通过手机号获取通讯录用户详情
    String inviteAddressBookUser = "/mine/user/inviteAddressBookUser"; //通讯录邀请用户
    String rechargeXingzuan = "/money/rechargeXingzuan"; //充值星钻

    String getAttentionVideoList = "/video/getAttentionVideoList"; //首页--关注--获取我的关注用户视频列表

    String getMyCommentList = "/comment/myCommentList"; //获取评论我的/@我的评论列表

    String getScriptRoleList = "/role/getPlayersByRole"; //获取对应剧目下角色的排行列表

    String signUp = "/dailySign/signUp"; //签到

    String fillSignUp = "/dailySign/supplementarySignature"; //补签

    String checkSignUp = "/dailySign/getSignRecord"; //查询签到

    String getRecommendVideoList = "/video/getRecommendVideoList"; //首页--获取推荐视频

    String updateViewLikeType = "/mine/user/updateViewLikeType";//修改谁可以看我的喜欢列表

    String updateMessageTo = "/mine/user/updateMessageTo";//修改谁可以发消息给我

    String getSpecialGoodsList = "/goods/getSpecialGoodsList";//获取某商店的所有特殊商品

    String addOrder = "/order/addOrder";//生成订单

    String payOrder = "/money/payOrder";//生成订单

    String queryAccount = "/money/queryAccount";//查询账户
    String rechargeAndWithdrawList = "/money/queryRechargeAndWithdrawList";//查询账户
    String queryBill = "/money/queryBill";//查询收支记录
    String orderList = "/order/getOrderList";//订单状态
    String getLogistics = "/order/getLogistics";//物流
    String deleteOrder = "/order/deleteOrder";//物流
    String finishOrder = "/order/finishOrder";//物流
    String videoRecords = "/video/getViewVideoRecords";//视频记录
    String checkPassword = "/money/checkPassword";//验证密码
    String updateAliAccount = "/money/updateAliAccount";//绑定支付宝
    String payToAli = "/money/payToAli";//提现到支付宝账户
    String tripartiteLogin = "/user/platform/tripartiteLogin";//新-三方登陆接口
    String tripartiteBindTel = "/user/platform/tripartiteBindTel";//新-三方绑定手机
    String telBindtripartite = "/user/platform/telBindtripartite";//新-手机绑定三方
    String sharePage = "/share/sharePage";//分享
    String getUserList = "/comment/getUserList";//分享
    String getSystemMessage = "/mine/getSystemMessage";//分页获取系统消息
    String getUseAndHelp = "/rule/getUseAndHelp";//分页获取系统消息


    String getAdvertising = "/script/advertising"; //获取对应剧目的推荐轮播图

    String getInvitationCode = "/user/getInvitationCode"; //获取邀请码

    String certificationUser = "/user/certification/getCertificationStatus";//查询认证状态

    String commitcertificationUser = "/user/certification/userCertification";//提交个人认证信息

    String commitcertificationCompany = "/user/certification/enterpriseCertification";//提交企业认证信息

    String commitcertificationOpera = "/user/certification/filmCrewCertification";//提交剧目认证信息

    String getSetting = "/user/getSetting";//获取设置

    String updateSetting = "/user/updateSetting";//更改设置

    String getInvitationList = "/user/getInvitationList";//获取邀请码记录

    String getRecommendVideo = "/video/getRecommendVideo";//获取明星真人秀数据

    String bindingAuroral = "/user/bindingAuroral";//更新用户的极光noticeRegid

    String getRules = "/rule/getRules";//获取邀请规则

    String getPoster = "/user/getPoster";//分享海报

    String queryFreeVote = "/giftRecords/queryFreeVote";//查询是否投过免费票

    //充值列表
    String listcharge = "/user/listRecharge";

    /**
     * 线上地址
     */
    /*String myHostUrl = "http://script.mxingm.com:7003";
    String myDiscoverUrl = "http://video.mxingm.com:7007";
    String dynamicPath = "http://video.mxingm.com:7008";
    String VideoUrl = "http://video.mxingm.com:7009";
    String liveHost = "http://video.mxingm.com:7010";*/

    String myHostUrl = "http://script.mxingm.com";
    String findUrl = "http://find.mxingm.com";
    String mineUrl = "http://mine.mxingm.com";
    String VideoUrl = "http://video.mxingm.com";
    String shareUrl = "http://sh.mxingm.com";
    String dyUrl = "http://dy.mxingm.com";


    /**
     * 线下地址
     */
//    String myHostUrl = "http://47.111.23.202:6008";
//    String findUrl = "http://47.111.23.202:6004";
//    String mineUrl = "http://47.111.23.202:6006";
//    String VideoUrl = "http://47.111.23.202:6012";
//    String shareUrl = "http://47.111.23.202:6010";
//    String dyUrl = "http://47.111.23.202:6003";

//    String myHostUrl = "http://10.10.20.12:6008";
//    String findUrl = "http://10.10.20.12:6004";
//    String mineUrl = "http://10.10.20.12:6006";
//    String backUrl = "http://10.10.20.12:6001";
//    String VideoUrl = "http://10.10.20.12:6012";
//    String shareUrl = "http://10.10.20.12:6010";
//    String dyUrl = "http://10.10.20.12:6003";

    //祥居
    /*String myHostUrl = "http://10.10.20.3:6008";
    String findUrl = "http://10.10.20.3:6004";
    String mineUrl = "http://10.10.20.3:6006";
    String backUrl = "http://10.10.20.3:6001";
    String VideoUrl = "http://10.10.20.3:6012";
    String shareUrl = "http://10.10.20.3:6010";
    String dyUrl = "http://10.10.20.3:6003";*/

        //志坤
   /* String myHostUrl = "http://10.10.20.23:6008";
    String findUrl = "http://10.10.20.23:6004";
    String mineUrl = "http://10.10.20.23:6006";
    String backUrl = "http://10.10.20.23:6001";
    String VideoUrl = "http://10.10.20.23:6012";
    String shareUrl = "http://10.10.20.23:6010";
    String dyUrl = "http://10.10.20.23:6003";*/


//    String myHostUrl = "http://10.10.40.5:6008";
//    String findUrl = "http://10.10.40.5:6004";
//    String mineUrl = "http://10.10.40.5:6006";
//    String backUrl = "http://10.10.40.5:6001";
//    String VideoUrl = "http://10.10.40.5:6012";
//    String shareUrl = "http://10.10.40.5:6010";
//    String dyUrl = "http://10.10.40.5:6003";


    /**
     * 测试服务器
     */
//    String myHostUrl = "http://114.55.118.115:7003";
//    String myDiscoverUrl = "http://114.55.118.115:7007";
//    String dynamicPath = "http://114.55.118.115:7008";
//    String VideoUrl = "http://114.55.118.115:7009";
//    String liveHost = "http://114.55.118.115:7010";

    /**
     * 集群地址
     */
//    String clusterUrl = "http://teststardream.mxingm.com:89";
//    String myHostUrl = clusterUrl;
//    String myDiscoverUrl = clusterUrl;
//    String dynamicPath = clusterUrl;
//    String VideoUrl = clusterUrl;
//    String liveHost = clusterUrl;

}
