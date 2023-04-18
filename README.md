1.  编写字符串工具类实现下如下四个方法，方法接收字符串参数并实现如下目标：
	1.1反转字符串参数，并作为方法结果返回
		实现路径：
		com/ksyun/whgc/wangshiqiang/firstQuestion/StringUtils.java
		测试方法路径：
		Test/StringTest.java
		commit id：
		de1ac726093037b732e6488768e22f0f9c6b48c7
	1.2统计字符串中每个字母出现的次数，以Map结构返回
		实现路径：
		com/ksyun/whgc/wangshiqiang/firstQuestion/StringUtils.java
		测试方法路径：
		Test/StringTest.java
		commit id：
		d4ad63261b850850c836fb7a77ca1fd22a9587cc
	1.3打印出现次数最多的字母及其次数
		实现路径：
		com/ksyun/whgc/wangshiqiang/firstQuestion/StringUtils.java
		测试方法路径：
		Test/StringTest.java
		commit id：
		e613d4c676ec9e7819ee6aef3a224dbad8ea8abf
	1.4 返回不含有重复字符的最长子串
		实现路径：
		com/ksyun/whgc/wangshiqiang/firstQuestion/StringUtils.java
		测试方法路径：
		Test/StringTest.java
		commit id：
		0de2409cc292c28dcaa68b1a813ca4df26e3e5be

2.	创建学生对象，包括姓名、年龄、住址、出生年月等属性；模拟生成学生集合，基于字段注解、打印输出该集合，要求输出的第一行数据为字段名称、后续行数据为集合数据；不限输出格式，可以是excel、htm、txt等；
	2.1.定义注解类：用于标注集合对象属性；
	  	实现路径：
		com/ksyun/whgc/wangshiqiang/secondQuestion/FieldName.java
	  	测试方法路径：无
	  	commit id：e6d9fbdf400eb87f115b948ebc7bf61638651391
	2.2.定义工具类输出集合对象:集合输出时根据属性的标注输出属性字段名;
		实现路径：
	  	com/ksyun/whgc/wangshiqiang/secondQuestion/Student.java
		com/ksyun/whgc/wangshiqiang/secondQuestion/CollectionPrinter.java
	  	测试方法路径：
	  	Test/CollectionPrinterTest.java
	  	commit id：
	  	03c994d1f241d2f30716d86d732ba49c1cb4b305

3.	编写一个程序，启动三个线程，三个线程的ID分别是A，B，C；，每个线程将自己的ID值在屏幕上打印5遍，打印顺序是ABCABC… 
		实现路径：
	  	com/ksyun/whgc/wangshiqiang/thirdQuestion/PrintABC.java
	  	测试方法路径：
	  	Test/PrintABCTest.java
	  	commit id：
	  	d9efe2f705dda457f371c4c31f7af7446cedfd5b