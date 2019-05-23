
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ObjectDetectInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ObjectDetectInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Top" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Left" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Right" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Buttom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectDetectInfo", propOrder = {
    "name",
    "score",
    "x",
    "y",
    "width",
    "height",
    "top",
    "left",
    "right",
    "buttom"
})
public class ObjectDetectInfo {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Score")
    protected int score;
    @XmlElement(name = "X")
    protected int x;
    @XmlElement(name = "Y")
    protected int y;
    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "Height")
    protected int height;
    @XmlElement(name = "Top")
    protected int top;
    @XmlElement(name = "Left")
    protected int left;
    @XmlElement(name = "Right")
    protected int right;
    @XmlElement(name = "Buttom")
    protected int buttom;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取score属性的值。
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置score属性的值。
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

    /**
     * 获取x属性的值。
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * 设置x属性的值。
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * 获取y属性的值。
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * 设置y属性的值。
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * 获取width属性的值。
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * 获取top属性的值。
     * 
     */
    public int getTop() {
        return top;
    }

    /**
     * 设置top属性的值。
     * 
     */
    public void setTop(int value) {
        this.top = value;
    }

    /**
     * 获取left属性的值。
     * 
     */
    public int getLeft() {
        return left;
    }

    /**
     * 设置left属性的值。
     * 
     */
    public void setLeft(int value) {
        this.left = value;
    }

    /**
     * 获取right属性的值。
     * 
     */
    public int getRight() {
        return right;
    }

    /**
     * 设置right属性的值。
     * 
     */
    public void setRight(int value) {
        this.right = value;
    }

    /**
     * 获取buttom属性的值。
     * 
     */
    public int getButtom() {
        return buttom;
    }

    /**
     * 设置buttom属性的值。
     * 
     */
    public void setButtom(int value) {
        this.buttom = value;
    }

}
