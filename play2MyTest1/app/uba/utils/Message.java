package uba.utils;

/**
 * Created by azmake on 16/5/20.
 */
public class Message {
    public int code;
    public String msg;
    public Object data;

    public static Message wrap(Object data) {
        return wrap(200, data);
    }

    public static Message wrap(String msg) {
        return wrap(200, msg);
    }

    public static Message wrap(String msg, Object data) {
        return wrap(200, msg, data);
    }

    public static Message wrap(int code, Object data) {
        return wrap(code, "", data);
    }

    public static Message wrap(int code, String msg) {
        return wrap(code, msg, null);
    }

    public static Message errorWrap(int code, String errorMsg) {
        return wrap(code, errorMsg, null);
    }

    public static Message errorWrap(String errorMsg) {
        return wrap(201, errorMsg, null);
    }

    /**
     * 添加异常
     * @param exceptionMsg
     * @return
     */
    public static Message exceptionWrap(String exceptionMsg) {
        return wrap(202, exceptionMsg);
    }

    public static Message wrap(int code, String msg, Object data) {
        Message message = new Message();
        message.code = code;
        message.msg = msg;
        message.data = data;
        return message;
    }
}
