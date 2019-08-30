package UDPConnectDB;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SinhVien implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
        private int tuoi;
        private Date birthDay;
	private List<SinhVien> listSV;
	public List<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(List<SinhVien> listSV) {
		this.listSV = listSV;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	
	public SinhVien(int id, String name, int tuoi) {
		this.id = id;
		this.name = name;
		this.tuoi = tuoi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", tuoi=" + tuoi + "]";
	}
	
	

}
