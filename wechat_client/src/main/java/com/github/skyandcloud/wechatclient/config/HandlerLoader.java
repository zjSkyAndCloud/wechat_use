package com.github.skyandcloud.wechatclient.config;

import com.github.skyandcloud.wechatclient.server.strategic.impl.MessageContentFileHandlerServerImpl;
import com.github.skyandcloud.wechatclient.server.strategic.impl.MessageContentTextHandlerServerImpl;
import lombok.extern.slf4j.Slf4j;


/**
 * @Description 初始化加载
 * @Author zheng.jiang
 * @Date 2024/9/8 16:23
 */
@Slf4j
public class HandlerLoader {

    public static void init() {
        loadStrategicMessageHandler();
    }

    /**
     * 加载消息处理handler
     */
    private static void loadStrategicMessageHandler() {
        MessageContentFileHandlerServerImpl fileMessageHandlerServer = new MessageContentFileHandlerServerImpl();
        fileMessageHandlerServer.register();
        MessageContentTextHandlerServerImpl textMessageHandlerServer = new MessageContentTextHandlerServerImpl();
        textMessageHandlerServer.register();
        log.info("message handler module load finish");
    }
}
