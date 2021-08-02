create database proj15;

create table Register(
name text,pass text,email text,mobile text,address text,user text);

create table Owner(
owner text,fname text,sk text,keyword text,dt text);

create table DataServer(
owner text,fname text,sk text,keyword text,content text,ranking text,dt text);

create table Transaction(owner text,fname text,task text,time text,dt text);

create table Attacker(
user text,fname text,sk text,dt text);
