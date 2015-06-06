package site.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="site")
public class Site {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	     private String SiteID;
	@Column
	     private String Classification;
	@Column     
	     private String Lat;
	@Column     
	     private String Lon;
	@Column
	     private String Bts;
	@Column
	     private String Type;
	@Column
	     private String Filtre;
	@Column
	     private String Az1;
	@Column
	     private String Ht1;
	@Column
	     private String Hs1;
	@Column
	     private String A1;
	@Column
	     private String Et1;
	@Column
	     private String Mt1;
	@Column
	     private String M1;
	@Column	     
	     private String Az2;
	@Column
	     private String Ht2;
	@Column
	     private String Hs2;
	@Column
	     private String A2;
	@Column
	     private String Et2;
	@Column
	     private String Mt2;
	@Column
	     private String M2;
	@Column	     
	     private String Az3;
	@Column
	     private String Ht3;
	@Column
	     private String Hs3;
	@Column
	     private String A3;
	@Column
	     private String Et3;
	@Column
	     private String Mt3;
	@Column
	     private String M3;
	@Column     
	     private String Pylone;
	@Column
	     private String Mast;
	@Column
	     private String Et1800;
	@Column
	     private String Feeder900;
	@Column
	     private String Feeder1800;
	
	  	
		
		public Site(String siteID, String classification, String lat,
				String lon, String bts, String type, String filtre, String az1,
				String ht1, String hs1, String a1, String et1, String mt1,
				String m1, String az2, String ht2, String hs2, String a2,
				String et2, String mt2, String m2, String az3, String ht3,
				String hs3, String a3, String et3, String mt3, String m3,
				String pylone, String mast, String et1800, String feeder900,
				String feeder1800) {
			super();
			SiteID = siteID;
			Classification = classification;
			Lat = lat;
			Lon = lon;
			Bts = bts;
			Type = type;
			Filtre = filtre;
			Az1 = az1;
			Ht1 = ht1;
			Hs1 = hs1;
			A1 = a1;
			Et1 = et1;
			Mt1 = mt1;
			M1 = m1;
			Az2 = az2;
			Ht2 = ht2;
			Hs2 = hs2;
			A2 = a2;
			Et2 = et2;
			Mt2 = mt2;
			M2 = m2;
			Az3 = az3;
			Ht3 = ht3;
			Hs3 = hs3;
			A3 = a3;
			Et3 = et3;
			Mt3 = mt3;
			M3 = m3;
			Pylone = pylone;
			Mast = mast;
			Et1800 = et1800;
			Feeder900 = feeder900;
			Feeder1800 = feeder1800;
		}
		public Site() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getSiteID() {
			return SiteID;
		}
		public void setSiteID(String siteID) {
			SiteID = siteID;
		}
		public String getClassification() {
			return Classification;
		}
		public void setClassification(String classification) {
			Classification = classification;
		}
		public String getLat() {
			return Lat;
		}
		public void setLat(String lat) {
			Lat = lat;
		}
		public String getLon() {
			return Lon;
		}
		public void setLon(String lon) {
			Lon = lon;
		}
		public String getBts() {
			return Bts;
		}
		public void setBts(String bts) {
			Bts = bts;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public String getFiltre() {
			return Filtre;
		}
		public void setFiltre(String filtre) {
			Filtre = filtre;
		}
		public String getAz1() {
			return Az1;
		}
		public void setAz1(String az1) {
			Az1 = az1;
		}
		public String getHt1() {
			return Ht1;
		}
		public void setHt1(String ht1) {
			Ht1 = ht1;
		}
		public String getHs1() {
			return Hs1;
		}
		public void setHs1(String hs1) {
			Hs1 = hs1;
		}
		public String getA1() {
			return A1;
		}
		public void setA1(String a1) {
			A1 = a1;
		}
		public String getEt1() {
			return Et1;
		}
		public void setEt1(String et1) {
			Et1 = et1;
		}
		public String getMt1() {
			return Mt1;
		}
		public void setMt1(String mt1) {
			Mt1 = mt1;
		}
		public String getM1() {
			return M1;
		}
		public void setM1(String m1) {
			M1 = m1;
		}
		public String getAz2() {
			return Az2;
		}
		public void setAz2(String az2) {
			Az2 = az2;
		}
		public String getHt2() {
			return Ht2;
		}
		public void setHt2(String ht2) {
			Ht2 = ht2;
		}
		public String getHs2() {
			return Hs2;
		}
		public void setHs2(String hs2) {
			Hs2 = hs2;
		}
		public String getA2() {
			return A2;
		}
		public void setA2(String a2) {
			A2 = a2;
		}
		public String getEt2() {
			return Et2;
		}
		public void setEt2(String et2) {
			Et2 = et2;
		}
		public String getMt2() {
			return Mt2;
		}
		public void setMt2(String mt2) {
			Mt2 = mt2;
		}
		public String getM2() {
			return M2;
		}
		public void setM2(String m2) {
			M2 = m2;
		}
		public String getAz3() {
			return Az3;
		}
		public void setAz3(String az3) {
			Az3 = az3;
		}
		public String getHt3() {
			return Ht3;
		}
		public void setHt3(String ht3) {
			Ht3 = ht3;
		}
		public String getHs3() {
			return Hs3;
		}
		public void setHs3(String hs3) {
			Hs3 = hs3;
		}
		public String getA3() {
			return A3;
		}
		public void setA3(String a3) {
			A3 = a3;
		}
		public String getEt3() {
			return Et3;
		}
		public void setEt3(String et3) {
			Et3 = et3;
		}
		public String getMt3() {
			return Mt3;
		}
		public void setMt3(String mt3) {
			Mt3 = mt3;
		}
		public String getM3() {
			return M3;
		}
		public void setM3(String m3) {
			M3 = m3;
		}
		public String getPylone() {
			return Pylone;
		}
		public void setPylone(String pylone) {
			Pylone = pylone;
		}
		public String getMast() {
			return Mast;
		}
		public void setMast(String mast) {
			Mast = mast;
		}
		public String getEt1800() {
			return Et1800;
		}
		public void setEt1800(String et1800) {
			Et1800 = et1800;
		}
		public String getFeeder900() {
			return Feeder900;
		}
		public void setFeeder900(String feeder900) {
			Feeder900 = feeder900;
		}
		public String getFeeder1800() {
			return Feeder1800;
		}
		public void setFeeder1800(String feeder1800) {
			Feeder1800 = feeder1800;
		}	     	     				     

}
