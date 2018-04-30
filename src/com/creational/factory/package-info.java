/**
 * Factory Pattern is one of the Creational Design pattern and it’s widely used
 * in JDK as well as frameworks like Spring and Struts. Factory design pattern
 * is used when we have a super class with multiple subclasses and based on
 * input, we need to return one of the sub-class. This pattern take out the
 * responsibility of instantiation of a class from client program to the factory
 * class. Let’s first learn how to implement factory pattern in java and then we
 * will learn its benefits and we will see its usage in JDK.
 * 
 *  B. Benefits of Abstract Factory Pattern 
 *         		􀁸 Abstract Factory pattern provides approach to code for interface rather than implementation.
 *         		􀁸 Abstract Factory pattern is “factory of factories” and can be
 *         			easily extended to accommodate more products, for example we can add
 *        			another sub-class Laptop and a factory LaptopFactory. 
 *        		􀁸 Abstract Factory pattern is robust and avoid conditional logic of Factory pattern. 
 *         C. Abstract Factory Pattern Examples in JDK 
 *         		􀁸 javax.xml.parsers.DocumentBuilderFactory#newInstance()
 *          	􀁸 javax.xml.transform.TransformerFactory#newInstance() 
 *          	􀁸 javax.xml.xpath.XPathFactory#newInstance()
 * @author peddaram
 *
 *        
 */
package com.creational.factory;
