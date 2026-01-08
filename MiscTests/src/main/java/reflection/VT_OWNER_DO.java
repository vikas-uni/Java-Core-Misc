/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reflection;

/**
 *
 * @author Vikas- 15.7.15
 * Dobj for table echalharyana.vt_owner
 */
public class VT_OWNER_DO {
    
  private String regn_no; //character varying(10) NOT NULL,
  private String regn_dt ;//timestamp without time zone,
  private String purchase_dt;// timestamp without time zone,
  private int owner_sr;// numeric(2,0),
  private String owner_name ;//character varying(35),
  private String pan_no;// character varying(10),
  private String f_name;// character varying(35),
  private String c_add1;// character varying(35),
  private String c_add2;// character varying(35),
  private String c_city;// character varying(30),
  private String c_district;// character varying(30),
  private String c_pincode;// character varying(6),
  private String p_add1;// character varying(35),
  private String p_add2;// character varying(35),
  private String p_city;// character varying(30),
  private String p_district;// character varying(30),
  private String p_pincode;// character varying(6),
  private int owner_cd;// numeric(2,0),
  private String regn_type;// character varying(1),
  private int vh_class;// numeric(3,0),
  private String chasi_no;// character varying(30) NOT NULL,
  private String eng_no;// character varying(30),
  private int maker;// numeric(3,0),
  private String maker_model;// character varying(30),
  private String body_type;// character varying(3),
  private int no_cyl;// numeric(2,0),
  private int hp;// numeric(8,2),
  private int seat_cap;// numeric(3,0),
  private int stand_cap;// numeric(3,0),
  private int sleeper_cap;// numeric(2,0),
  private int unld_wt; //numeric(6,0),
  private int ld_wt;// numeric(6,0),
  private int fuel;// numeric(2,0),
  private String color;// character varying(20),
  private int manu_mon;// numeric(2,0),
  private int manu_yr;// numeric(4,0),
  private String fit_dt;// timestamp without time zone,
  private int norms;// numeric(2,0),
  private int wheelbase;// numeric(6,0),
  private int cubic_cap;// numeric(8,2),
  private int floor_area;// numeric(7,3),
  private String ac_fitted;// character(1),
  private String audio_fitted;// character(1),
  private String video_fitted;// character(1),
  private String vch_purchase_as;// character(1),
  private String vch_catg;// character(3),
  private int dealer_cd;// numeric(5,0),
  private String tax_opt;// character;// varying(1),
  private String atax_opt;// character varying(1),
  private String pvt_com;// character varying(2),
  private int sale_amt;// numeric(9,0),
  private String laser_code;// character varying(10),
  private String op_dt ;//timestamp without time zone,
  private String rcpt_no;// character varying(11),
  private String garage_add;// character varying(50),
  private int height;// numeric(5,0),
  private int length;// numeric(5,0),
  private int width;// numeric(5,0),
  private String state_cd;//   character varying(2) NOT NULL,
  private String rto_cd;// character varying(3) NOT NULL,

    public String getRegn_no() {
        return regn_no;
    }

    public void setRegn_no(String regn_no) {
        this.regn_no = regn_no;
    }

    public String getRegn_dt() {
        return regn_dt;
    }

    public void setRegn_dt(String regn_dt) {
        this.regn_dt = regn_dt;
    }

    public String getPurchase_dt() {
        return purchase_dt;
    }

    public void setPurchase_dt(String purchase_dt) {
        this.purchase_dt = purchase_dt;
    }

    public int getOwner_sr() {
        return owner_sr;
    }

    public void setOwner_sr(int owner_sr) {
        this.owner_sr = owner_sr;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getC_add1() {
        return c_add1;
    }

    public void setC_add1(String c_add1) {
        this.c_add1 = c_add1;
    }

    public String getC_add2() {
        return c_add2;
    }

    public void setC_add2(String c_add2) {
        this.c_add2 = c_add2;
    }

    public String getC_city() {
        return c_city;
    }

    public void setC_city(String c_city) {
        this.c_city = c_city;
    }

    public String getC_district() {
        return c_district;
    }

    public void setC_district(String c_district) {
        this.c_district = c_district;
    }

    public String getC_pincode() {
        return c_pincode;
    }

    public void setC_pincode(String c_pincode) {
        this.c_pincode = c_pincode;
    }

    public String getP_add1() {
        return p_add1;
    }

    public void setP_add1(String p_add1) {
        this.p_add1 = p_add1;
    }

    public String getP_add2() {
        return p_add2;
    }

    public void setP_add2(String p_add2) {
        this.p_add2 = p_add2;
    }

    public String getP_city() {
        return p_city;
    }

    public void setP_city(String p_city) {
        this.p_city = p_city;
    }

    public String getP_district() {
        return p_district;
    }

    public void setP_district(String p_district) {
        this.p_district = p_district;
    }

    public String getP_pincode() {
        return p_pincode;
    }

    public void setP_pincode(String p_pincode) {
        this.p_pincode = p_pincode;
    }

    public int getOwner_cd() {
        return owner_cd;
    }

    public void setOwner_cd(int owner_cd) {
        this.owner_cd = owner_cd;
    }

    public String getRegn_type() {
        return regn_type;
    }

    public void setRegn_type(String regn_type) {
        this.regn_type = regn_type;
    }

    public int getVh_class() {
        return vh_class;
    }

    public void setVh_class(int vh_class) {
        this.vh_class = vh_class;
    }

    public String getChasi_no() {
        return chasi_no;
    }

    public void setChasi_no(String chasi_no) {
        this.chasi_no = chasi_no;
    }

    public String getEng_no() {
        return eng_no;
    }

    public void setEng_no(String eng_no) {
        this.eng_no = eng_no;
    }

    public int getMaker() {
        return maker;
    }

    public void setMaker(int maker) {
        this.maker = maker;
    }

    public String getMaker_model() {
        return maker_model;
    }

    public void setMaker_model(String maker_model) {
        this.maker_model = maker_model;
    }

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public int getNo_cyl() {
        return no_cyl;
    }

    public void setNo_cyl(int no_cyl) {
        this.no_cyl = no_cyl;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSeat_cap() {
        return seat_cap;
    }

    public void setSeat_cap(int seat_cap) {
        this.seat_cap = seat_cap;
    }

    public int getStand_cap() {
        return stand_cap;
    }

    public void setStand_cap(int stand_cap) {
        this.stand_cap = stand_cap;
    }

    public int getSleeper_cap() {
        return sleeper_cap;
    }

    public void setSleeper_cap(int sleeper_cap) {
        this.sleeper_cap = sleeper_cap;
    }

    public int getUnld_wt() {
        return unld_wt;
    }

    public void setUnld_wt(int unld_wt) {
        this.unld_wt = unld_wt;
    }

    public int getLd_wt() {
        return ld_wt;
    }

    public void setLd_wt(int ld_wt) {
        this.ld_wt = ld_wt;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManu_mon() {
        return manu_mon;
    }

    public void setManu_mon(int manu_mon) {
        this.manu_mon = manu_mon;
    }

    public int getManu_yr() {
        return manu_yr;
    }

    public void setManu_yr(int manu_yr) {
        this.manu_yr = manu_yr;
    }

    public String getFit_dt() {
        return fit_dt;
    }

    public void setFit_dt(String fit_dt) {
        this.fit_dt = fit_dt;
    }

    public int getNorms() {
        return norms;
    }

    public void setNorms(int norms) {
        this.norms = norms;
    }

    public int getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(int wheelbase) {
        this.wheelbase = wheelbase;
    }

    public int getCubic_cap() {
        return cubic_cap;
    }

    public void setCubic_cap(int cubic_cap) {
        this.cubic_cap = cubic_cap;
    }

    public int getFloor_area() {
        return floor_area;
    }

    public void setFloor_area(int floor_area) {
        this.floor_area = floor_area;
    }

    public String getAc_fitted() {
        return ac_fitted;
    }

    public void setAc_fitted(String ac_fitted) {
        this.ac_fitted = ac_fitted;
    }

    public String getAudio_fitted() {
        return audio_fitted;
    }

    public void setAudio_fitted(String audio_fitted) {
        this.audio_fitted = audio_fitted;
    }

    public String getVideo_fitted() {
        return video_fitted;
    }

    public void setVideo_fitted(String video_fitted) {
        this.video_fitted = video_fitted;
    }

    public String getVch_purchase_as() {
        return vch_purchase_as;
    }

    public void setVch_purchase_as(String vch_purchase_as) {
        this.vch_purchase_as = vch_purchase_as;
    }

    public String getVch_catg() {
        return vch_catg;
    }

    public void setVch_catg(String vch_catg) {
        this.vch_catg = vch_catg;
    }

    public int getDealer_cd() {
        return dealer_cd;
    }

    public void setDealer_cd(int dealer_cd) {
        this.dealer_cd = dealer_cd;
    }

    public String getTax_opt() {
        return tax_opt;
    }

    public void setTax_opt(String tax_opt) {
        this.tax_opt = tax_opt;
    }

    public String getAtax_opt() {
        return atax_opt;
    }

    public void setAtax_opt(String atax_opt) {
        this.atax_opt = atax_opt;
    }

    public String getPvt_com() {
        return pvt_com;
    }

    public void setPvt_com(String pvt_com) {
        this.pvt_com = pvt_com;
    }

    public int getSale_amt() {
        return sale_amt;
    }

    public void setSale_amt(int sale_amt) {
        this.sale_amt = sale_amt;
    }

    public String getLaser_code() {
        return laser_code;
    }

    public void setLaser_code(String laser_code) {
        this.laser_code = laser_code;
    }

    public String getOp_dt() {
        return op_dt;
    }

    public void setOp_dt(String op_dt) {
        this.op_dt = op_dt;
    }

    public String getRcpt_no() {
        return rcpt_no;
    }

    public void setRcpt_no(String rcpt_no) {
        this.rcpt_no = rcpt_no;
    }

    public String getGarage_add() {
        return garage_add;
    }

    public void setGarage_add(String garage_add) {
        this.garage_add = garage_add;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getState_cd() {
        return state_cd;
    }

    public void setState_cd(String state_cd) {
        this.state_cd = state_cd;
    }

    public String getRto_cd() {
        return rto_cd;
    }

    public void setRto_cd(String rto_cd) {
        this.rto_cd = rto_cd;
    }
    
  
}
