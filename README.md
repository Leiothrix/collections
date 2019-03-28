# Java 集合框架测试

三大类数据类型，四个测试类

`list` 类型有 InsertTest 和 QueryTest 两个类，分别比较 LinkedList 和 ArrayList 的插入查询性能。  

`map`类型有 MapTest 类，比较 TreeMap 和 LinkedHashMap 的数据插入后，排列顺序是什么样的。

`set`类型有 SetTest 类，关注 ArrayList 和 HashSet 对插入数据的筛选，涉及到实体类中的 equals 和 hashCode 方法