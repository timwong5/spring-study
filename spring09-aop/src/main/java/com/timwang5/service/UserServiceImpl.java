package com.timwang5.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("����һ���û�");
    }

    @Override
    public void delete() {
        System.out.println("ɾ��һ���û�");
    }

    @Override
    public void update() {
        System.out.println("�޸�һ���û�");

    }

    @Override
    public void select() {
        System.out.println("��ѯһ���û�");

    }
}
