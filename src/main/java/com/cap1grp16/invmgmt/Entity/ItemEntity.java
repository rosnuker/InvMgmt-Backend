package com.cap1grp16.invmgmt.Entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblitem")
public class ItemEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "propertyTag")
    private long iid;

    @Column(name = "issueOrderNumber")
    private int issueOrder;

    private String department;

    @Column(name = "accountablePerson")
    private String accPerson;

    private String designation;
    private int invoiceNumber;

    @DateTimeFormat(pattern = "MM.dd.yyyy")
    private Date invoiceDate;
    
    private String supplier;
    private int quantity;

    @Column(name = "UOM")
    private String uom;

    //to be implemented (another table)
    private String description;
    
    private float unitCost;
    private float totalCost;

    //to be implemented (another table)
    private String inventoryLocation;

    private String status;
    private String lifespan;

    private String remarks;

    public ItemEntity() {
    }

    public ItemEntity(int issueOrder, String department, String accPerson, String designation, int invoiceNumber,
            Date invoiceDate, String supplier, int quantity, String uom, String description, float unitCost,
            float totalCost, String inventoryLocation, String status, String lifespan, String remarks) {
        this.issueOrder = issueOrder;
        this.department = department;
        this.accPerson = accPerson;
        this.designation = designation;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.supplier = supplier;
        this.quantity = quantity;
        this.uom = uom;
        this.description = description;
        this.unitCost = unitCost;
        this.totalCost = totalCost;
        this.inventoryLocation = inventoryLocation;
        this.status = status;
        this.lifespan = lifespan;
        this.remarks = remarks;
    }

    public long getIid() {
        return iid;
    }

    public void setIid(long iid) {
        this.iid = iid;
    }

    public int getIssueOrder() {
        return issueOrder;
    }

    public void setIssueOrder(int issueOrder) {
        this.issueOrder = issueOrder;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAccPerson() {
        return accPerson;
    }

    public void setAccPerson(String accPerson) {
        this.accPerson = accPerson;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public String getInventoryLocation() {
        return inventoryLocation;
    }

    public void setInventoryLocation(String inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
