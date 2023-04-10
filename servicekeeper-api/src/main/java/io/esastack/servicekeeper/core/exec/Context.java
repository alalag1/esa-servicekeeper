package io.esastack.servicekeeper.core.exec;

public interface Context {

    String getResourceId();

    Object[] getArgs();

    Object getResult();

    Throwable getBizException();

    Throwable getNotPermittedCause();

    long getSpendTimeMs();

}
