package com.pro100kryto.server.modules.auth.connection;

import com.pro100kryto.server.utils.datagram.packets.IEndPoint;

public final class Connection {
    private final long userId;
    private final int connId;
    private final byte[] keyCrypt;
    private final int connPass;
    private final String nickname;
    private final ConnectionRoles roles;
    private IEndPoint endPoint;

    public Connection(long userId, int connId, String nickname, byte[] keyCrypt, int connPass, ConnectionRoles roles, IEndPoint endPoint) {
        this.userId = userId;
        this.connId = connId;
        this.nickname = nickname;
        this.keyCrypt = keyCrypt;
        this.connPass = connPass;
        this.roles = roles;
        this.endPoint = endPoint;
    }

    public long getUserId() {
        return userId;
    }

    public int getConnId() {
        return connId;
    }

    public byte[] getKeyCrypt() {
        return keyCrypt;
    }

    public int getConnPass() {
        return connPass;
    }

    public String getNickname() {
        return nickname;
    }

    public ConnectionRoles getRoles() {
        return roles;
    }

    public IEndPoint getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(IEndPoint endPoint) {
        this.endPoint = endPoint;
    }
}
