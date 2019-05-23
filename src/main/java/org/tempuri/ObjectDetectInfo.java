
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ObjectDetectInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡscore���Ե�ֵ��
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * ����score���Ե�ֵ��
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

    /**
     * ��ȡx���Ե�ֵ��
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * ����x���Ե�ֵ��
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * ��ȡy���Ե�ֵ��
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * ����y���Ե�ֵ��
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * ��ȡwidth���Ե�ֵ��
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * ��ȡheight���Ե�ֵ��
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * ����height���Ե�ֵ��
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * ��ȡtop���Ե�ֵ��
     * 
     */
    public int getTop() {
        return top;
    }

    /**
     * ����top���Ե�ֵ��
     * 
     */
    public void setTop(int value) {
        this.top = value;
    }

    /**
     * ��ȡleft���Ե�ֵ��
     * 
     */
    public int getLeft() {
        return left;
    }

    /**
     * ����left���Ե�ֵ��
     * 
     */
    public void setLeft(int value) {
        this.left = value;
    }

    /**
     * ��ȡright���Ե�ֵ��
     * 
     */
    public int getRight() {
        return right;
    }

    /**
     * ����right���Ե�ֵ��
     * 
     */
    public void setRight(int value) {
        this.right = value;
    }

    /**
     * ��ȡbuttom���Ե�ֵ��
     * 
     */
    public int getButtom() {
        return buttom;
    }

    /**
     * ����buttom���Ե�ֵ��
     * 
     */
    public void setButtom(int value) {
        this.buttom = value;
    }

}
