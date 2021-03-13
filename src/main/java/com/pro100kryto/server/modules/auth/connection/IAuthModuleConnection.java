package com.pro100kryto.server.modules.auth.connection;

import com.pro100kryto.server.module.IModuleConnection;
import com.pro100kryto.server.utils.datagram.packets.IEndPoint;
import org.jetbrains.annotations.Nullable;

public interface IAuthModuleConnection extends IModuleConnection {
    Connection authorize(long userId, String nickname, int roles, IEndPoint endPoint);
    void rejectByConnId(int connId);
    void rejectAllByUserId(long userId);
    void rejectAll();
    @Nullable Connection getConnection(int connId);
}
