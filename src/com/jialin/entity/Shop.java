package com.jialin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "p_shop")
public class Shop {
	private int id;
	private String  name;  //��Ʒ����
	private String  code; //��Ʒ���ͺ�
	private String  type; //��Ʒ������
	private String  unit; //��Ʒ�ĵ�λ
	private String upperlimit; //����
	private String lowerlimit; //����
	private String  unitprice;//����
	private String  totality;//�������
	private String  totalprice;//�ܼ�
	private String  producer;//������
	private String  storage;//�洢λ��
	

	public String getName() {
		return name;
	}

	@Column(name="name", length=30, nullable=false, unique=true)
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCode() {
		return code;
	}
	@Column(name="code", length=20, nullable=false, unique=true)
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}

	@Column(name="type", length=20, nullable=false, unique=true)
	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return unit;
	}
	@Column(name="unit", length=20)
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUpperlimit() {
		return upperlimit;
	}
	@Column(name="upperlimit", length=20)
	public void setUpperlimit(String upperlimit) {
		this.upperlimit = upperlimit;
	}

	public String getLowerlimit() {
		return lowerlimit;
	}
	@Column(name="lowerlimit", length=20)
	public void setLowerlimit(String lowerlimit) {
		this.lowerlimit = lowerlimit;
	}

	public String getUnitprice() {
		return unitprice;
	}
	@Column(name="unitprice", length=20)
	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}

	public String getTotality() {
		return totality;
	}
	@Column(name="totality", length=20)
	public void setTotality(String totality) {
		this.totality = totality;
	}

	public String getTotalprice() {
		return totalprice;
	}
	@Column(name="totalprice", length=20)
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}

	public String getProducer() {
		return producer;
	}
	@Column(name="producer", length=20, nullable=false, unique=true)
	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getStorage() {
		return storage;
	}
	@Column(name="storage", length=20, nullable=false, unique=true)
	public void setStorage(String storage) {
		this.storage = storage;
	}


	@Id
	//�������ݿ�������ʽ��������
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
