package com.github.skyandcloud.wechatclient.domain.wechatapi.result;

import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

import java.io.Serializable;

/**
 * @Description 发送文件消息返回值
 * @Author zheng.jiang
 * @Date 2024/9/13 14:03
 */
@Data
public class SendFileMsgResult extends BaseResult<SendFileMsgResult> implements Serializable, ResultInterface {

    @Override
    public Boolean isSuccess() {
        if (ObjectUtils.isEmpty(getCode())) {
            return false;
        }

        return !getCode().equals(0);
    }
}
