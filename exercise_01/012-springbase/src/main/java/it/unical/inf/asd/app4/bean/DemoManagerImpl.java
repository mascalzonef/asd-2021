package it.unical.inf.asd.app4.bean;

public class DemoManagerImpl implements DemoManager
{
    @Override
    public String getServiceName()
    {
        return "My first service with Spring 3";
    }
}