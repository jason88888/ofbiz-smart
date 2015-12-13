package org.huihoo.ofbiz.smart.base;

public final class C {
  public static final String APPLICATION_CONFIG_NAME = "/application.properties";
  //============================================
  //            Datasource Config Flag
  //============================================
  public static final String CONFIG_DATASOURCE_CACHE_PROVIDER = "database.cache.provider";
  public static final String CONFIG_DATASOURCE = "datasource";
  public static final String CONFIG_DATASOURCE_DEFAULT = "datasource.default";
  public static final String CONFIG_DATASOURCE_USERNAME = "username";
  //============================================
  //            Pagination Flag
  //============================================
  public static final String PAGE_TOTAL_ENTRY = "totalEntry";
  public static final String PAGE_TOTAL_PAGE = "totalPage";
  public static final String PAGE_LIST = "list";
  public static final String PAGE_PAGE_NO = "pageNo";
  public static final String PAGE_PAGE_SIZE = "pageSize";

  //============================================
  //            Query Where Expression Flag
  //============================================
  /** Equal To */
  public static final String EXPR_EQ = "eq";
  /** Not Equal To */
  public static final String EXPR_NE = "ne";
  /** In */
  public static final String EXPR_IN = "in";
  /** Not In */
  public static final String EXPR_NIN = "notIn";
  /** Greater Than */
  public static final String EXPR_GT = "gt";
  /** Greater Than or Equal to */
  public static final String EXPR_GE = "ge";
  /** Less Than */
  public static final String EXPR_LT = "lt";
  /** Less Than or Equal to */
  public static final String EXPR_LE = "le";
  /** Is Null */
  public static final String EXPR_IS_NULL = "isNull";
  /** Is Not Null */
  public static final String EXPR_IS_NOT_NULL = "isNotNull";
  /** Like */
  public static final String EXPR_LIKE = "like";
  /** Left Like */
  public static final String EXPR_LLIKE = "llike";
  /** Right Like */
  public static final String EXPR_RLIKE = "rlike";
  /** Between */
  public static final String EXPR_BETWEEN = "between";
  /** Or */
  public static final String EXPR_OR = "or";
}
