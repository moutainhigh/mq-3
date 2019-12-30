package com.github.ichings.mq.common.kernel;

/**
 * 常用错误码
 *
 * @author 宋欢
 */
public enum Error {
    /**
     * OK
     */
    SUCCESS_NUM(0, "ok"),

    /**
     * -- 禁用，易误解成Http.SC_OK --
     */
    IGNORE_NUM(200, "ignore"),

    /**
     * 无访问权限
     */
    FORBIDDEN(403, "forbidden"),

    /**
     * 页面不存在
     */
    PAGE_NOT_FOUND(404, "page not found"),

    /**
     * 系统运行异常
     */
    SYSTEM_RUN_ERR(500, "system run error"),

    /**
     * 脚本运行失败
     */
    SCRIPT_RUN_ERR(501, "script run error"),

    /**
     * 幂等
     */
    IDEMPOTENT(1000, "idempotent"),

    /**
     * 请求方式错误
     */
    METHOD_ERR(1101, "method error"),

    /**
     * 参数错误
     */
    ARGS_ERR(1102, "args error"),

    /**
     * 结果错误
     */
    RESULT_ERR(1201, "result error"),

    /**
     * Json解析异常
     */
    JSON_SYNTAX_ERR(1301, "json syntax error"),

    /**
     * Xml解析异常
     */
    XML_SYNTAX_ERR(1302, "xml syntax error"),

    /**
     * 未知错误
     */
    UNKNOWN_ERR(2008, "unknown error");

    /**
     * 错误码
     */
    private int code;

    /**
     * 错误信息
     */
    private String message;

    Error(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
