--day02
--1 �����Զ�������ÿ�β����µ����ݵ�ʱ������
--��ֵ��ϵͳ�Զ������ɣ���������ȥ��д��
--  1��ԭ�򣺵������������ʱ��������ֵά����
--�ǳ��鷳�����Һܶ������ͬʱ�����µ����ݣ���
--������ֵ�ܿ��ܻ��ظ�
--  2��SQLServer������������identity(1,1)
use student
create table teacher(
	tid int identity(1,1) primary key,
	tname varchar(10) not null,
	tage int,
)
--�������ݣ���Ҫָ��������ֵ����ϵͳ�����ɵ�ǰ
--��������������ֵ
insert into teacher values('��ǫ',41)
select * from teacher;
--��������������Ļ�����������������������ֵ
--insert into teacher values(10,'����',18)

--2 ȱʡֵ�ֶεĲ��루Ĭ��ֵ��
--default��ָ�㵱ǰ�ֶε�Ĭ��ֵ
--����������ݵ�ʱ�򣬸�������ֵ���û��д�ģ���
--ֱ��ʹ��default��������Ĭ��ֵ��д�ˣ��Ͳ���
--defaultĬ��ֵ
use student
create table teacher2(
	tid int identity(1,1) primary key,
	tname varchar(10) not null,
	tage int not null default 20,
) 
insert into teacher2 values('¬����',default)
insert into teacher2 values('��ʫʫ',35)
select * from teacher2

--3 ɾ��
-- 1�� ������Ҫ����������ɾ���ض�������
-- ɾ������ʽ
-- delete from ���� where ����

delete from teacher2 where tid = 1
select * from teacher2

-- 2�� ɾ�����е����е�����
-- ɾ������ʽ
-- delete from ����

select * from teacher
delete from teacher

-- 3�� ɾ���������е����ݣ�ʹ�ü��٣���־��¼�޷�
-- ׼ȷ��¼���� truncate ����
-- �﷨��ʽ
-- truncate table ����

select * from teacher2;
truncate table teacher2;

--4 ʹ�ù�����ɾ��������ݿ�


--5 �޸ı��е�����
--1�����������޸ı�������
--��ʽ��update ���� set 
--        ����1=��ֵ1������2=��ֵ2...
--      where ����
use student
select * from studentinfo;
update studentinfo set ���� = 100,��ַ ='̨��' 
where ѧ�� = 005
update studentinfo set ���� ='����Ⱥ',���� = 20
where ѧ�� = 006

--2) �������е����ݣ��������޸Ĳ���
--�﷨�� update ���� set 
--          ����1=��ֵ1������2=��ֵ2...
--����һ�꣬��studentinfo���ű��е������˵�����
--����1
update studentinfo set ���� = ����+1
select * from studentinfo;

-- 6 �򵥲�ѯ��������ѯ���е����ݣ�
-- 1�� ��ѯ�������е�����
-- ��ʽ��select * from ����
-- *:���е���
use student
select * from studentinfo;
-- 2�� ��ѯ���ж�Ӧ���е����е�����
--��ʽ��select ����1������2������3... from ����
--ֻ��ѯ����������
select ����,���� from studentinfo
--ֻ��ѯ����
select ���� from studentinfo

-- 3�� ��������ѯ�������ݣ����Ը��иĸ����֣�
-- ��ʽ1 ��ʹ��as 
-- select ����1 as ����1 ,����2 as ����2... 
-- from ����
use Library 
select bname as ����,author1 as ���� from book
-- ��ʽ2 ��ֱ��ʹ�ÿո�
-- select ����1  ����1������2  ����2...
-- from ����
select pub ������ ,bname ���� ,numinput ����
from book
-- ��ʽ3 ��ʹ�� = 
--select ����1 = ����1������2 = ����2 ...
--from book
select ���� = author1,���� = bname from book

--4) ���Ӷ���У�һ����ѯ�����Ӷ���У���ʹ��
--��+�����Ӷ����ͬ����
--��ʽ��select ����1 + ����2 + ����3+...
--      from ���� 

select bname+' , '+pub+' , '+author1+' , '+type 
from book
select * from book

-- 7 �������Ĳ�ѯ���ص㣩
-- ��ʽ��select ����/* from ���� where ����
-- 1��ʹ�ù�ϵ������޶�����
-- = ����   ��> ���ڣ�  < С�ڣ�  >= ���ڵ���
-- <= С�ڵ��ڣ� <> ������  ������ ��= ������

use Library
select * from book
insert into book 
values('004','��������Щ��','��е������',
'���������','','��ʷ��',5000,600)
insert into book 
values('005','��Ĺ����','��е������',
'��������','','�ֲ���',2000,300)
insert into book 
values('006','����','��е������',
'�������°Գ�','','�ֲ���',5000,100)
select * from book

--��ѯ����bid=005��book�����֣����ߣ�������
select bname,author1,pub from book
where bid = 005;
--��ѯ�������Ǻ��ϳ�����ĳ���������֣����ߣ����
select bname,author1,author2,numstore
from book where pub='���ϳ�����'
--�������100��ͼ�����е���Ϣ
select * from book
where numstore =100
--���������10������ͼ���������Ϣ
--<> ���Ⱥ�
select * from book where numstore <> 10
--!= ������
select * from book where numstore !=10
--����������5000���е�ͼ������֣����ߣ�2������
--�����磬��Ϣ
select bname ,author1,author2,pub from book
where numinput > 5000
--�ҳ������ǻ����ɵ�������������ʾ������磬����
--�����
select pub,bname,numstore from book
where author1 ='������'

--2����ѯ���߼���������������Ӷ������
--   and �߼���     ����������Ϊtrue������true
--   or  �߼���     ��Ҫ��һ������Ϊtrue������true
--   not �߼���     ȡ��

--��ѯ���������廪��ѧ������ͻ�е����������
--���е�ͼ�����Ϣ
select * from book
where pub = '�廪��ѧ������' or pub ='��е������'
--��ѯ�������ǻ�е�����磬������ҪС��1000��
--�鼮���ͱ�������ʷ�࣬�����������������е�
--ͼ�����Ϣ
select * from book
where pub = '��е������' 
and numstore<1000 and type='��ʷ��'
--��ѯ�����������е�ͼ�飨�߼��ǣ�
select * from book
where not type='������'
--��ѯ������������5000��10000֮������е�ͼ����Ϣ
select * from book
where numinput>=5000 and numinput<=10000

--3) ��ָ��һ����Χ�У����в�ѯ
--  a��between num1 and num2,��num1��num2֮���
--  ���е�ֵ
--��ѯ������������5000��10000֮������е�ͼ����Ϣ
select * from book
where numinput between 5000 and 10000
--��ѯ�������100��3000֮������е�ͼ����Ϣ
select * from book
where numstore between 100 and 3000

--��book���У��Ȳ���3������
insert into book(bid,bname,numinput,numstore,pub)
values('007','����δ֪���Լ�',1000,100,'��е������')

insert into book(bid,bname,numinput,numstore,pub)
values('008','Ų����ɭ��',2000,100,'�廪��ѧ������')

insert into book(bid,bname,numinput,numstore,pub)
values('009','��������ô�����ɵ�',3000,100,'��е������')

--b�� in(ֵ1��ֵ2��ֵ3...)
--   ��ѯ���ֵ������
--��ѯbid��ֵ��001,003,007,008,009
select * from book
where bid='001' or bid = '003' or bid ='007'
or bid = '008' or bid = '009'

select * from book
where bid in('001','003','007','008','009')


--4) Ϊnull������
-- is null ����ǰ������ĳ��Ϊnull��û���κε�ֵ��
--��ѯtype��ֵΪnull�����е�book��Ϣ
select * from book
where type is null

--5��ģ����ѯ��like(����ַ��Ĳ�ѯ)
--   ͨ�����
--   %������0�����߶���ַ�
--   _:ƥ�������һ���ַ�
--��ѯ���������ջƵ�����д�������Ϣ
-- �ջƵ����ߣ� ��%
select * from book
where author1 like '��%'
--��ѯ���ջ����ߣ������������ֵ��ˣ���д����
select * from book
where author1 like '��_'
--[]��ָ��һ����Χ���ݵĵ����ַ����������%��_
--ʹ��
--��ѯbid��ֵĩβ��������1��5���������Ϣ
select * from book 
where bid like '%[1-5]'
--[^]:���ٷ�Χ�ڵĵ����ַ�
select * from book
where bid like '[^0]%'


--8 �޶����ؼ�¼������
--  1�����Ʒ�������
--  ��ʽ��
--  select top �������ݵ����� ����/* from ����
--  where ����
    select top 2 * from book
--  2���޶����ذٷֱ�
--  ��ʽ��
--  select top ��ֵ�����������֣� percent��%��
--  ����/*  from ����
--  where ���� 
    select top 50 percent  * from book 
    where author1 like '��%'

--  9 ���ò�ѯ��������Ʊ�
--  1) ����һ���µı���ԭ�б������ȫ��������
--  �±���
--  ��ʽ�� select * into �±���  from  Դ����
--�ѵ�ǰbook�������е���Ϣ��ȫ��������book1����
use Library
select * into book1 from book
select * from book1
--  2) ����һ���µı�ָ��ԭ�б���м��������
--  �����ݸ��Ƶ��±���
--  ��ʽ��
--  select ����1������2... into �±��� 
--  from Դ����
--  where ����
--���԰�book���У�bid��bname��author1��type
--���Ƶ��±�book2�У�����ֻ���������鼮���ƹ�ȥ
use Library
select bid,bname,author1,type into book2
from book 
where type='������'
select * from book2

--3�� ����ֻ�Ǹ��Ʊ�Ľṹ��ֻҪ������Ϊfalse��
�Ϳ���ֻ���ƽṹ��
--��ʽ ��select ����/* into �±��� from Դ���� 
--       where ����Ϊfalse
use Library
select * into book3 from book
where 1<>1
select * from book3

-- 10 �߼���ѯ
--1��ȥ���ظ��ķ���ֵ
--   distinct
select distinct type ,pub from book

select distinct type from book
--2������
-- order by ��������������
-- asc ����(Ĭ��ֵ)          desc ����
--����������˳��������
select * from book order by bid desc
--���ս�������������
select * from book order by numinput 
--���մ�����������У���������һ�µĻ����ٰ�
--������������
select * from book
order by numstore asc , numinput desc
-- 3) ���麯����SQL������һЩ����������ֱ�ӵ��ã�
-- ִ���书��
-- count(*/����)��ͳ�����ݵĸ���
select COUNT(*) from book
-- max(����):ͳ�Ƴ��������µ����ֵ
select MAX(numstore) from book
-- min(����)��ͳ�Ƹ����µ���Сֵ
select MIN(numinput) from book
-- sum(����)��ͳ�Ƹ����µ����е�ֵ���ܺ�
select SUM(numstore) from book
-- avg(����)��ͳ�Ƹ�����ֵ��ƽ��ֵ
select AVG(numinput) from book
--�����ʽ
-- select ��/���麯�����Ӹ������� from ����
-- group by ����
-- ���ó�����(pub)��book�ֳ�3�飬�ֱ���ʾ��
-- ÿ��������book����

select pub as ������, COUNT(pub) as ����  
from book
group by pub

--������������磬����������ͼ��Ľ�����
select pub as ������,MAX(numinput) 
from book
group by pub

--������������磬�������͵�ͼ��Ŀ������MIN����
--�Լ���������ƽ��ֵ��AVG��
select  MIN(numstore) as ������ֵ,
AVG(numinput) as ����ƽ��ֵ
from book
group by pub

--������������磬�ܵĽ���������ƽ���Ŀ����
select SUM(numinput) as �ܵĽ�����,
AVG(numstore) as �������ƽ��ֵ
from book
group by pub




























