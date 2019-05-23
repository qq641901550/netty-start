package com.netty.qqw.tcp.chinnal.message.decoder;


import com.netty.qqw.entity.WhResult;
import com.netty.qqw.utils.ProtostuffSerialize;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.CharsetUtil;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by jiangwenping on 17/2/3.
 */

public class NetProtoBufMessageTCPDecoder extends MessageToMessageDecoder<ByteBuf> {

    private final Charset charset;



    public NetProtoBufMessageTCPDecoder() {
        this(CharsetUtil.UTF_8);
    }

    public NetProtoBufMessageTCPDecoder(Charset charset) {
        if(charset == null) {
            throw new NullPointerException("charset");
        } else {
            this.charset = charset;
        }
    }



    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf byteBuf, List<Object> out) throws Exception {
        WhResult<String> whResult;

        int byteLength = byteBuf.readableBytes();
        byte[] bytes = new byte[byteLength];
        int i = byteBuf.readerIndex();
        byteBuf.getBytes(i, bytes);
        //分解
        whResult = new ProtostuffSerialize<String>().deserializeProtoStuffDataToWhResul(bytes);
        out.add(whResult);
    }
}

