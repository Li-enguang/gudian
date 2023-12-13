package com.lieng.reiji.common;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import java.util.HashMap;
import java.util.Map;

/* loaded from: reiji-1.0-SNAPSHOT.jar:BOOT-INF/classes/com/lieng/reiji/common/R.class */
public class R<T> {
    private Integer code;
    private String msg;
    private T data;
    private Map<String, Object> map = new HashMap();

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public void setMap(final Map<String, Object> map) {
        this.map = map;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof R) {
            R<?> other = (R) o;
            if (other.canEqual(this)) {
                Object this$code = getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }
                Object this$msg = getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    if (other$msg != null) {
                        return false;
                    }
                } else if (!this$msg.equals(other$msg)) {
                    return false;
                }
                Object this$data = getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }
                Object this$map = getMap();
                Object other$map = other.getMap();
                return this$map == null ? other$map == null : this$map.equals(other$map);
            }
            return false;
        }
        return false;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof R;
    }

    public int hashCode() {
        Object $code = getCode();
        int result = (1 * 59) + ($code == null ? 43 : $code.hashCode());
        Object $msg = getMsg();
        int result2 = (result * 59) + ($msg == null ? 43 : $msg.hashCode());
        Object $data = getData();
        int result3 = (result2 * 59) + ($data == null ? 43 : $data.hashCode());
        Object $map = getMap();
        return (result3 * 59) + ($map == null ? 43 : $map.hashCode());
    }

    public String toString() {
        return "R(code=" + getCode() + ", msg=" + getMsg() + ", data=" + getData() + ", map=" + getMap() + StringPool.RIGHT_BRACKET;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public Map<String, Object> getMap() {
        return this.map;
    }

    public static <T> R<T> success(T object) {
        R<T> r = new R<>();
        ((R) r).data = object;
        ((R) r).code = 1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R<T> r = new R<>();
        ((R) r).msg = msg;
        ((R) r).code = 0;
        return r;
    }

    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }
}