package com.pro100kryto.server.modules.auth.connection;

public interface IAuthorizable {
    void authorize(Connection connection);
    boolean isAuthorized(int connId);
    void reject(int connId);
}
