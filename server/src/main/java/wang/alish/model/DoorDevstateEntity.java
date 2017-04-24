package wang.alish.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Allen on 2017/3/7.
 */
@Entity
@Table(name = "door_devstate", schema = "libinfo", catalog = "")
public class DoorDevstateEntity {
    private int id;
    private String doorName;
    private String lineState;
    private Timestamp stateChangeTime;
    private String wetherArm;
    private String lastOpUser;
    private BottomDevinfoEntity bottomDevinfoByBottomdevId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "door_name", nullable = false, length = 45)
    public String getDoorName() {
        return doorName;
    }

    public void setDoorName(String doorName) {
        this.doorName = doorName;
    }

    @Basic
    @Column(name = "line_state", nullable = true, length = 45)
    public String getLineState() {
        return lineState;
    }

    public void setLineState(String lineState) {
        this.lineState = lineState;
    }

    @Basic
    @Column(name = "state_change_time", nullable = true)
    public Timestamp getStateChangeTime() {
        return stateChangeTime;
    }

    public void setStateChangeTime(Timestamp stateChangeTime) {
        this.stateChangeTime = stateChangeTime;
    }

    @Basic
    @Column(name = "wether_arm", nullable = true, length = 45)
    public String getWetherArm() {
        return wetherArm;
    }

    public void setWetherArm(String wetherArm) {
        this.wetherArm = wetherArm;
    }

    @Basic
    @Column(name = "last_op_user", nullable = true, length = 45)
    public String getLastOpUser() {
        return lastOpUser;
    }

    public void setLastOpUser(String lastOpUser) {
        this.lastOpUser = lastOpUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoorDevstateEntity that = (DoorDevstateEntity) o;

        if (id != that.id) return false;
        if (doorName != null ? !doorName.equals(that.doorName) : that.doorName != null) return false;
        if (lineState != null ? !lineState.equals(that.lineState) : that.lineState != null) return false;
        if (stateChangeTime != null ? !stateChangeTime.equals(that.stateChangeTime) : that.stateChangeTime != null)
            return false;
        if (wetherArm != null ? !wetherArm.equals(that.wetherArm) : that.wetherArm != null) return false;
        if (lastOpUser != null ? !lastOpUser.equals(that.lastOpUser) : that.lastOpUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (doorName != null ? doorName.hashCode() : 0);
        result = 31 * result + (lineState != null ? lineState.hashCode() : 0);
        result = 31 * result + (stateChangeTime != null ? stateChangeTime.hashCode() : 0);
        result = 31 * result + (wetherArm != null ? wetherArm.hashCode() : 0);
        result = 31 * result + (lastOpUser != null ? lastOpUser.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "bottomdev_id", referencedColumnName = "id", nullable = false)
    public BottomDevinfoEntity getBottomDevinfoByBottomdevId() {
        return bottomDevinfoByBottomdevId;
    }

    public void setBottomDevinfoByBottomdevId(BottomDevinfoEntity bottomDevinfoByBottomdevId) {
        this.bottomDevinfoByBottomdevId = bottomDevinfoByBottomdevId;
    }
}
