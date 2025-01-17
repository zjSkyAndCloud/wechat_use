package com.github.skyandcloud.wechatclient.domain.wechatapi.result;

import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

import java.io.Serializable;

/**
 * @Description 发送多个不同@消息返回值
 * @Author zheng.jiang
 * @Date 2024/9/13 14:40
 */
@Data
public class SendMultiAtTextResult extends BaseResult<SendMultiAtTextResult> implements Serializable, ResultInterface {

    @Override
    public Boolean isSuccess() {
        if (ObjectUtils.isEmpty(getCode())) {
            return false;
        }

        return getCode() > 0;
    }

}
