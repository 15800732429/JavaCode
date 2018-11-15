--day02
--1 主键自动增长（每次插入新的数据的时候，主键
--的值由系统自动的生成，不用我们去填写）
--  1）原因：当数据量极大的时候，主键的值维护会
--非常麻烦，而且很多人如果同时插入新的数据，则
--主键的值很可能会重复
--  2）SQLServer中主键自增：identity(1,1)
use student
create table teacher(
	tid int identity(1,1) primary key,
	tname varchar(10) not null,
	tage int,
)
--插入数据，不要指定主键的值，由系统来生成当前
--插入数据主键的值
insert into teacher values('刘谦',41)
select * from teacher;
--如果是主键自增的话，不让我们来插入主键的值
--insert into teacher values(10,'赵敏',18)

--2 缺省值字段的插入（默认值）
--default：指点当前字段的默认值
--如果插入数据的时候，该列属性值如果没有写的，则
--直接使用default后面所跟默认值，写了，就不用
--default默认值
use student
create table teacher2(
	tid int identity(1,1) primary key,
	tname varchar(10) not null,
	tage int not null default 20,
) 
insert into teacher2 values('卢俊义',default)
insert into teacher2 values('刘诗诗',35)
select * from teacher2

--3 删除
-- 1） 根据需要（条件）来删除特定的数据
-- 删除语句格式
-- delete from 表名 where 条件

delete from teacher2 where tid = 1
select * from teacher2

-- 2） 删除表中的所有的数据
-- 删除语句格式
-- delete from 表名

select * from teacher
delete from teacher

-- 3） 删除表中所有的数据，使用极少，日志记录无法
-- 准确记录操作 truncate 操作
-- 语法格式
-- truncate table 表名

select * from teacher2;
truncate table teacher2;

--4 使用工具来删除表和数据库


--5 修改表中的数据
--1）根据条件修改表中数据
--格式：update 表名 set 
--        列名1=新值1，列名2=新值2...
--      where 条件
use student
select * from studentinfo;
update studentinfo set 年龄 = 100,地址 ='台湾' 
where 学号 = 005
update studentinfo set 姓名 ='岳不群',年龄 = 20
where 学号 = 006

--2) 表中所有的数据，都进行修改操作
--语法： update 表名 set 
--          列名1=新值1，列名2=新值2...
--过了一年，把studentinfo这张表中的所有人的年龄
--都加1
update studentinfo set 年龄 = 年龄+1
select * from studentinfo;

-- 6 简单查询操作（查询表中的数据）
-- 1） 查询表中所有的数据
-- 格式：select * from 表名
-- *:所有的列
use student
select * from studentinfo;
-- 2） 查询表中对应的列的所有的数据
--格式：select 列名1，列名2，列名3... from 表名
--只查询姓名，年龄
select 姓名,年龄 from studentinfo
--只查询姓名
select 姓名 from studentinfo

-- 3） 别名（查询来的数据，可以给列改个名字）
-- 格式1 ：使用as 
-- select 列名1 as 别名1 ,列名2 as 别名2... 
-- from 表名
use Library 
select bname as 书名,author1 as 作者 from book
-- 格式2 ：直接使用空格
-- select 列名1  别名1，列名2  别名2...
-- from 表名
select pub 出版社 ,bname 书名 ,numinput 进货
from book
-- 格式3 ：使用 = 
--select 别名1 = 列名1，别名2 = 列名2 ...
--from book
select 作者 = author1,书名 = bname from book

--4) 连接多个列（一个查询中连接多个列），使用
--“+”连接多个不同的列
--格式：select 列名1 + 列名2 + 列名3+...
--      from 表名 

select bname+' , '+pub+' , '+author1+' , '+type 
from book
select * from book

-- 7 带条件的查询（重点）
-- 格式：select 列名/* from 表名 where 条件
-- 1）使用关系运算符限定条件
-- = 等于   ，> 大于，  < 小于，  >= 大于等于
-- <= 小于等于， <> 不等于  ，！非 ！= 不等于

use Library
select * from book
insert into book 
values('004','明朝的哪些事','机械出版社',
'当年的明月','','历史类',5000,600)
insert into book 
values('005','盗墓笔试','机械出版社',
'南派三叔','','恐怖类',2000,300)
insert into book 
values('006','鬼吹灯','机械出版社',
'此物天下霸唱','','恐怖类',5000,100)
select * from book

--查询出来bid=005的book的名字，作者，出版社
select bname,author1,pub from book
where bid = 005;
--查询出版社是海南出版社的出版书的名字，作者，库存
select bname,author1,author2,numstore
from book where pub='海南出版社'
--库存量是100的图书所有的信息
select * from book
where numstore =100
--库存量不是10的所有图书的所有信息
--<> 不等号
select * from book where numstore <> 10
--!= 不等于
select * from book where numstore !=10
--进货量超过5000所有的图书的名字，作者（2个），
--出版社，信息
select bname ,author1,author2,pub from book
where numinput > 5000
--找出作者是黄玉郎的所有漫画，显示其出版社，书名
--库存量
select pub,bname,numstore from book
where author1 ='黄玉郎'

--2）查询中逻辑运算符，用来连接多个条件
--   and 逻辑与     所有条件都为true，才是true
--   or  逻辑或     主要有一个条件为true，才是true
--   not 逻辑非     取反

--查询出版社是清华大学出版社和机械出版社出版的
--所有的图书的信息
select * from book
where pub = '清华大学出版社' or pub ='机械出版社'
--查询出版社是机械出版社，库存必须要小于1000，
--书籍类型必须是历史类，符合这三个条件所有的
--图书的信息
select * from book
where pub = '机械出版社' 
and numstore<1000 and type='历史类'
--查询非武侠类所有的图书（逻辑非）
select * from book
where not type='武侠类'
--查询出来进货量在5000到10000之间的所有的图书信息
select * from book
where numinput>=5000 and numinput<=10000

--3) 在指定一个范围中，进行查询
--  a）between num1 and num2,在num1到num2之间的
--  所有的值
--查询出来进货量在5000到10000之间的所有的图书信息
select * from book
where numinput between 5000 and 10000
--查询库存量在100到3000之间的所有的图书信息
select * from book
where numstore between 100 and 3000

--往book表中，先插入3条数据
insert into book(bid,bname,numinput,numstore,pub)
values('007','遇见未知的自己',1000,100,'机械出版社')

insert into book(bid,bname,numinput,numstore,pub)
values('008','挪威的森林',2000,100,'清华大学出版社')

insert into book(bid,bname,numinput,numstore,pub)
values('009','钢铁是怎么样炼成的',3000,100,'机械出版社')

--b） in(值1，值2，值3...)
--   查询多个值的数据
--查询bid的值是001,003,007,008,009
select * from book
where bid='001' or bid = '003' or bid ='007'
or bid = '008' or bid = '009'

select * from book
where bid in('001','003','007','008','009')


--4) 为null的数据
-- is null ：当前数据中某列为null（没有任何的值）
--查询type的值为null的所有的book信息
select * from book
where type is null

--5）模糊查询：like(针对字符的查询)
--   通配符：
--   %：代表0个或者多个字符
--   _:匹配任意的一个字符
--查询出来所有姓黄的作者写的书的信息
-- 姓黄的作者： 黄%
select * from book
where author1 like '黄%'
--查询来姓黄作者，名字是两个字的人，所写的书
select * from book
where author1 like '黄_'
--[]：指定一个范围内容的单个字符，经常结合%和_
--使用
--查询bid的值末尾的数字是1到5所有书的信息
select * from book 
where bid like '%[1-5]'
--[^]:不再范围内的单个字符
select * from book
where bid like '[^0]%'


--8 限定返回记录的数量
--  1）限制返回条数
--  格式：
--  select top 返回数据的条数 列名/* from 表名
--  where 条件
    select top 2 * from book
--  2）限定返回百分比
--  格式：
--  select top 数值（必须是数字） percent（%）
--  列名/*  from 表名
--  where 条件 
    select top 50 percent  * from book 
    where author1 like '黄%'

--  9 利用查询语句来复制表
--  1) 创建一个新的表，把原有表的数据全部拷贝到
--  新表中
--  格式： select * into 新表名  from  源表名
--把当前book表中所有的信息，全部拷贝到book1表中
use Library
select * into book1 from book
select * from book1
--  2) 创建一个新的表，指定原有表的列及其该列上
--  的数据复制到新表中
--  格式：
--  select 列名1，列名2... into 新表名 
--  from 源表名
--  where 条件
--可以把book表中，bid，bname，author1，type
--复制到新表book2中，数据只把武侠类书籍复制过去
use Library
select bid,bname,author1,type into book2
from book 
where type='武侠类'
select * from book2

--3） 仅仅只是复制表的结构（只要让条件为false，
就可以只复制结构）
--格式 ：select 列名/* into 新表名 from 源表名 
--       where 条件为false
use Library
select * into book3 from book
where 1<>1
select * from book3

-- 10 高级查询
--1）去掉重复的返回值
--   distinct
select distinct type ,pub from book

select distinct type from book
--2）排序
-- order by 属性名（列名）
-- asc 升序(默认值)          desc 降序
--按照主键的顺序降序排列
select * from book order by bid desc
--按照进货量升序排序
select * from book order by numinput 
--按照存货量升序排列，如果存货量一致的话，再按
--进货降序排列
select * from book
order by numstore asc , numinput desc
-- 3) 分组函数：SQL中内置一些函数，可以直接调用，
-- 执行其功能
-- count(*/列名)：统计数据的个数
select COUNT(*) from book
-- max(列名):统计出来该列下的最大值
select MAX(numstore) from book
-- min(列名)：统计该列下的最小值
select MIN(numinput) from book
-- sum(列名)：统计该列下的所有的值的总和
select SUM(numstore) from book
-- avg(列名)：统计该列下值的平均值
select AVG(numinput) from book
--分组格式
-- select 列/分组函数（加个别名） from 表名
-- group by 列名
-- 利用出版社(pub)把book分成3组，分别显示出
-- 每个出版社book数量

select pub as 出版社, COUNT(pub) as 数量  
from book
group by pub

--求出各个出版社，进货量最大的图书的进货量
select pub as 出版社,MAX(numinput) 
from book
group by pub

--求出各个出版社，库存量最低的图书的库存量（MIN），
--以及进货量的平均值（AVG）
select  MIN(numstore) as 库存最低值,
AVG(numinput) as 进货平均值
from book
group by pub

--求出各个出版社，总的进货量，及平均的库存量
select SUM(numinput) as 总的进货量,
AVG(numstore) as 库存量的平均值
from book
group by pub




























