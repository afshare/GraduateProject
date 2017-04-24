package wang.alish.model;

import javax.persistence.*;

/**
 * Created by Allen on 2017/3/7.
 */
@Entity
@Table(name = "door_devdata", schema = "libinfo", catalog = "")
public class DoorDevdataEntity {
    private int id;
    private String doorName;
    private String data;
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
    @Column(name = "data", nullable = true, length = 45)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoorDevdataEntity that = (DoorDevdataEntity) o;

        if (id != that.id) return false;
        if (doorName != null ? !doorName.equals(that.doorName) : that.doorName != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (doorName != null ? doorName.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
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
