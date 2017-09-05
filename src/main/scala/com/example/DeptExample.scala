package com.example

class DeptExample {
  def main(args: Array[String]): Unit = {
    var dept = new Dept
    dept.deptno = 10
    dept.dname = "총무부"
    dept.loc = "서울"
    
    println("deptno = " + dept.deptno);
    println("dname = " + dept.dname);
    println("dloc = " + dept.loc);
    
  }
}