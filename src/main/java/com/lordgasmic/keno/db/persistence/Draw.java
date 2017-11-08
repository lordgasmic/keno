package com.lordgasmic.keno.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Persistence class for keno_user.keno database table
 * 
 * @author nwellman
 */

@Entity
@Table(name = "keno", schema = "keno_user")
public class Draw implements Serializable {

    private static final long serialVersionUID = 2166786307246823147L;

    @Id
    @Column(name = "draw_num")
    private String drawNum;

    @Column(name = "draw_date")
    private String drawDate;

    @Column(name = "draw_1")
    private String draw1;

    @Column(name = "draw_2")
    private String draw2;

    @Column(name = "draw_3")
    private String draw3;

    @Column(name = "draw_4")
    private String draw4;

    @Column(name = "draw_5")
    private String draw5;

    @Column(name = "draw_6")
    private String draw6;

    @Column(name = "draw_7")
    private String draw7;

    @Column(name = "draw_8")
    private String draw8;

    @Column(name = "draw_9")
    private String draw9;

    @Column(name = "draw_10")
    private String draw10;

    @Column(name = "draw_11")
    private String draw11;

    @Column(name = "draw_12")
    private String draw12;

    @Column(name = "draw_13")
    private String draw13;

    @Column(name = "draw_14")
    private String draw14;

    @Column(name = "draw_15")
    private String draw15;

    @Column(name = "draw_16")
    private String draw16;

    @Column(name = "draw_17")
    private String draw17;

    @Column(name = "draw_18")
    private String draw18;

    @Column(name = "draw_19")
    private String draw19;

    @Column(name = "draw_20")
    private String draw20;

    /**
     * @return the drawNum
     */
    public String getDrawNum() {
        return drawNum;
    }

    /**
     * @param drawNum
     * the drawNum to set
     */
    public void setDrawNum(final String drawNum) {
        this.drawNum = drawNum;
    }

    /**
     * @return the drawDate
     */
    public String getDrawDate() {
        return drawDate;
    }

    /**
     * @param drawDate
     * the drawDate to set
     */
    public void setDrawDate(final String drawDate) {
        this.drawDate = drawDate;
    }

    /**
     * @return the draw1
     */
    public String getDraw1() {
        return draw1;
    }

    /**
     * @param draw1
     * the draw1 to set
     */
    public void setDraw1(final String draw1) {
        this.draw1 = draw1;
    }

    /**
     * @return the draw2
     */
    public String getDraw2() {
        return draw2;
    }

    /**
     * @param draw2
     * the draw2 to set
     */
    public void setDraw2(final String draw2) {
        this.draw2 = draw2;
    }

    /**
     * @return the draw3
     */
    public String getDraw3() {
        return draw3;
    }

    /**
     * @param draw3
     * the draw3 to set
     */
    public void setDraw3(final String draw3) {
        this.draw3 = draw3;
    }

    /**
     * @return the draw4
     */
    public String getDraw4() {
        return draw4;
    }

    /**
     * @param draw4
     * the draw4 to set
     */
    public void setDraw4(final String draw4) {
        this.draw4 = draw4;
    }

    /**
     * @return the draw5
     */
    public String getDraw5() {
        return draw5;
    }

    /**
     * @param draw5
     * the draw5 to set
     */
    public void setDraw5(final String draw5) {
        this.draw5 = draw5;
    }

    /**
     * @return the draw6
     */
    public String getDraw6() {
        return draw6;
    }

    /**
     * @param draw6
     * the draw6 to set
     */
    public void setDraw6(final String draw6) {
        this.draw6 = draw6;
    }

    /**
     * @return the draw7
     */
    public String getDraw7() {
        return draw7;
    }

    /**
     * @param draw7
     * the draw7 to set
     */
    public void setDraw7(final String draw7) {
        this.draw7 = draw7;
    }

    /**
     * @return the draw8
     */
    public String getDraw8() {
        return draw8;
    }

    /**
     * @param draw8
     * the draw8 to set
     */
    public void setDraw8(final String draw8) {
        this.draw8 = draw8;
    }

    /**
     * @return the draw9
     */
    public String getDraw9() {
        return draw9;
    }

    /**
     * @param draw9
     * the draw9 to set
     */
    public void setDraw9(final String draw9) {
        this.draw9 = draw9;
    }

    /**
     * @return the draw10
     */
    public String getDraw10() {
        return draw10;
    }

    /**
     * @param draw10
     * the draw10 to set
     */
    public void setDraw10(final String draw10) {
        this.draw10 = draw10;
    }

    /**
     * @return the draw11
     */
    public String getDraw11() {
        return draw11;
    }

    /**
     * @param draw11
     * the draw11 to set
     */
    public void setDraw11(final String draw11) {
        this.draw11 = draw11;
    }

    /**
     * @return the draw12
     */
    public String getDraw12() {
        return draw12;
    }

    /**
     * @param draw12
     * the draw12 to set
     */
    public void setDraw12(final String draw12) {
        this.draw12 = draw12;
    }

    /**
     * @return the draw13
     */
    public String getDraw13() {
        return draw13;
    }

    /**
     * @param draw13
     * the draw13 to set
     */
    public void setDraw13(final String draw13) {
        this.draw13 = draw13;
    }

    /**
     * @return the draw14
     */
    public String getDraw14() {
        return draw14;
    }

    /**
     * @param draw14
     * the draw14 to set
     */
    public void setDraw14(final String draw14) {
        this.draw14 = draw14;
    }

    /**
     * @return the draw15
     */
    public String getDraw15() {
        return draw15;
    }

    /**
     * @param draw15
     * the draw15 to set
     */
    public void setDraw15(final String draw15) {
        this.draw15 = draw15;
    }

    /**
     * @return the draw16
     */
    public String getDraw16() {
        return draw16;
    }

    /**
     * @param draw16
     * the draw16 to set
     */
    public void setDraw16(final String draw16) {
        this.draw16 = draw16;
    }

    /**
     * @return the draw17
     */
    public String getDraw17() {
        return draw17;
    }

    /**
     * @param draw17
     * the draw17 to set
     */
    public void setDraw17(final String draw17) {
        this.draw17 = draw17;
    }

    /**
     * @return the draw18
     */
    public String getDraw18() {
        return draw18;
    }

    /**
     * @param draw18
     * the draw18 to set
     */
    public void setDraw18(final String draw18) {
        this.draw18 = draw18;
    }

    /**
     * @return the draw19
     */
    public String getDraw19() {
        return draw19;
    }

    /**
     * @param draw19
     * the draw19 to set
     */
    public void setDraw19(final String draw19) {
        this.draw19 = draw19;
    }

    /**
     * @return the draw20
     */
    public String getDraw20() {
        return draw20;
    }

    /**
     * @param draw20
     * the draw20 to set
     */
    public void setDraw20(final String draw20) {
        this.draw20 = draw20;
    }

}
