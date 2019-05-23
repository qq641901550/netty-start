package com.netty.qqw.tcp.chinnal.message.encoder;

import com.netty.qqw.entity.WhResult;


import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.CharsetUtil;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by jiangwenping on 17/2/8.
 */
public class NetProtoBufMessageTCPEncoder extends MessageToMessageEncoder<WhResult<String>> {

    private final Charset charset;

    public NetProtoBufMessageTCPEncoder() {
        this(CharsetUtil.UTF_8);
    }

    public NetProtoBufMessageTCPEncoder(Charset charset) {
        if(charset == null) {
            throw new NullPointerException("charset");
        } else {
            this.charset = charset;
        }
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, WhResult<String> msg, List<Object> out) throws Exception {
        out.add(msg);
    }
}
