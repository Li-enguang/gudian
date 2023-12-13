package com.lieng.reiji.common;

import com.baomidou.mybatisplus.core.toolkit.StringPool;

/* loaded from: reiji-1.0-SNAPSHOT.jar:BOOT-INF/classes/com/lieng/reiji/common/Utils.class */
public class Utils {
    public static int change(String str, int score) {
        if (str == null || str.length() == 0) {
            return score;
        }
        String[] split = str.split(StringPool.SPACE);
        int i = 0;
        for (String s : split) {
            int num = Integer.parseInt(s);
            if (i == 0) {
                score += num;
            }
            if (i == 1) {
                score += num * 10;
            }
            if (i == 2) {
                score += num * 100;
            }
            i++;
        }
        return score;
    }

    public static int parseInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    public static int getValue(Integer score) {
        if (score == null) {
            return 0;
        }
        return score.intValue();
    }
}