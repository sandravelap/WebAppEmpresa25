package entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "departamentos", schema = "pruebaIJ", catalog = "")
public class DepartamentosEntity {
    @Id
    @Column(name = "dept_no")
    private int deptNo;
    @Basic
    @Column(name = "dnombre")
    private String dnombre;
    @Basic
    @Column(name = "loc")
    private String loc;

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartamentosEntity that = (DepartamentosEntity) o;
        return deptNo == that.deptNo && Objects.equals(dnombre, that.dnombre) && Objects.equals(loc, that.loc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptNo, dnombre, loc);
    }
}
