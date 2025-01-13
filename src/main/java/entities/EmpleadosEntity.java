package entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "empleados", schema = "pruebaIJ", catalog = "")
public class EmpleadosEntity {
    @Id
    @Column(name = "emp_no")
    private int empNo;
    @Basic
    @Column(name = "apellido")
    private String apellido;
    @Basic
    @Column(name = "oficio")
    private String oficio;
    @Basic
    @Column(name = "dir")
    private Integer dir;
    @Basic
    @Column(name = "fecha_alt")
    private Date fechaAlt;
    @Basic
    @Column(name = "salario")
    private Double salario;
    @Basic
    @Column(name = "comision")
    private Double comision;
    @Basic
    @Column(name = "dept_no", insertable = false, updatable = false)
    private int deptNo;
    @ManyToOne
    @JoinColumn(name = "dept_no", referencedColumnName = "dept_no", nullable = false)
    private DepartamentosEntity departamentosByDeptNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Integer getDir() {
        return dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public Date getFechaAlt() {
        return fechaAlt;
    }

    public void setFechaAlt(Date fechaAlt) {
        this.fechaAlt = fechaAlt;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadosEntity that = (EmpleadosEntity) o;
        return empNo == that.empNo && dir == that.dir && deptNo == that.deptNo && Objects.equals(apellido, that.apellido) && Objects.equals(oficio, that.oficio) && Objects.equals(fechaAlt, that.fechaAlt) && Objects.equals(salario, that.salario) && Objects.equals(comision, that.comision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, apellido, oficio, dir, fechaAlt, salario, comision, deptNo);
    }

    public DepartamentosEntity getDepartamentosByDeptNo() {
        return departamentosByDeptNo;
    }

    public void setDepartamentosByDeptNo(DepartamentosEntity departamentosByDeptNo) {
        this.departamentosByDeptNo = departamentosByDeptNo;
    }
}
