package com.f2f.entity.hr;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "WORK_SHEET_ITEM")
public class WorkSheetItem extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "WORK_SHEET_ITEM_ID")
//    private Integer id;

    @Column(name = "ENTRY_TIEM")
    private String entryTime;

    @Column(name = "LEAVE_TIME")
    private String leaveTime;

    private WorkSheet workSheet;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public WorkSheetItem() {
    }

    public WorkSheet getWorkSheet() {
        return workSheet;
    }

    public void setWorkSheet(WorkSheet workSheet) {
        this.workSheet = workSheet;
    }
}
