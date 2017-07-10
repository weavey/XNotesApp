package com.weavey.xnotes.base

/**
 * create by Weavey
 * on date 2016-03-21
 */
object BaseConstant {

    var DB_CREATE = "db_create" //创建数据库的key

    var SP_DATA = "sp_data"

    var CITY = "city"   //城市的key

    var UNKNOWN_CITY = "未知城市" //城市的默认value

    var WEATHER = "weather" //天气的key

    var UNKNOWN_WEATHER = "" //天气的默认value

    var NOTES_FRG = "notes_frg" //创建每个fragment的key

    var IS_SET_PWD = "is_set_pwd" //是否设置过密码的key

    var To_SETTING = "to_setting_pwd"  //

    var TO_NOTES_DETAIL = "to_notes_detail"

    var MAIN_ACTIVITY = "main_activity"

    //添加记事界面的key  value：1主界面进入   2普通记事详情进入修改  3秘密记事详情修改
    var Edit_From_Tag = "edit_from_tag"

    var NOTES_BEAN_KEY = "notes_tag" //传递记事记录的bean的key

    //    public static String NOTES_DETAIL = "notes_detail"; //记事详情页面标志

    //    public static String NOTES_DETAIL_BEAN="notes_detail_bean";

    val EditNotesIntent = 0
    val LockedIntent = 1
    val SettingIntent = 4
    val HelpIntent = 5
    val AboutIntent = 6

}
