package wang.alish.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;


/**
 * Created by Allen on 2017/3/7.
 */
@Entity
@Table(name = "bottom_devinfo", schema = "libinfo", catalog = "")
public class BottomDevinfoEntity {
    private int id;
    private String devname;
    private String roominfo;
    private String user;
    private String coordinate;
    private String installPerson;
    private Date installTime;
    private Timestamp firstrunTime;
    private String wetherNormal;
    private String wHeartlostTooffline;
    private String wetherOnline;
    private String repower;
    private String detailedInfoLinks;
    private String orderAttime;
    private Collection<DoorDevdataEntity> doorDevdatasById;
    private Collection<DoorDevstateEntity> doorDevstatesById;
    private Collection<InfraredDevdataEntity> infraredDevdatasById;
    private Collection<InfraredDevstateEntity> infraredDevstatesById;
    private Collection<WindiowDevstateEntity> windiowDevstatesById;
    private Collection<WindowDevdataEntity> windowDevdatasById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "devname", nullable = false, length = 45)
    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname;
    }

    @Basic
    @Column(name = "roominfo", nullable = true, length = 45)
    public String getRoominfo() {
        return roominfo;
    }

    public void setRoominfo(String roominfo) {
        this.roominfo = roominfo;
    }

    @Basic
    @Column(name = "user", nullable = true, length = 45)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "coordinate", nullable = true, length = 45)
    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    @Basic
    @Column(name = "install_person", nullable = true, length = 45)
    public String getInstallPerson() {
        return installPerson;
    }

    public void setInstallPerson(String installPerson) {
        this.installPerson = installPerson;
    }

    @Basic
    @Column(name = "install_time", nullable = true)
    public Date getInstallTime() {
        return installTime;
    }

    public void setInstallTime(Date installTime) {
        this.installTime = installTime;
    }

    @Basic
    @Column(name = "firstrun_time", nullable = true)
    public Timestamp getFirstrunTime() {
        return firstrunTime;
    }

    public void setFirstrunTime(Timestamp firstrunTime) {
        this.firstrunTime = firstrunTime;
    }

    @Basic
    @Column(name = "wether_normal", nullable = true, length = 45)
    public String getWetherNormal() {
        return wetherNormal;
    }

    public void setWetherNormal(String wetherNormal) {
        this.wetherNormal = wetherNormal;
    }

    @Basic
    @Column(name = "w_heartlost_tooffline", nullable = true, length = 45)
    public String getwHeartlostTooffline() {
        return wHeartlostTooffline;
    }

    public void setwHeartlostTooffline(String wHeartlostTooffline) {
        this.wHeartlostTooffline = wHeartlostTooffline;
    }

    @Basic
    @Column(name = "wether_online", nullable = true, length = 45)
    public String getWetherOnline() {
        return wetherOnline;
    }

    public void setWetherOnline(String wetherOnline) {
        this.wetherOnline = wetherOnline;
    }

    @Basic
    @Column(name = "repower", nullable = true, length = 45)
    public String getRepower() {
        return repower;
    }

    public void setRepower(String repower) {
        this.repower = repower;
    }

    @Basic
    @Column(name = "detailed_info_links", nullable = true, length = 45)
    public String getDetailedInfoLinks() {
        return detailedInfoLinks;
    }

    public void setDetailedInfoLinks(String detailedInfoLinks) {
        this.detailedInfoLinks = detailedInfoLinks;
    }

    @Basic
    @Column(name = "order_attime", nullable = true, length = 45)
    public String getOrderAttime() {
        return orderAttime;
    }

    public void setOrderAttime(String orderAttime) {
        this.orderAttime = orderAttime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BottomDevinfoEntity that = (BottomDevinfoEntity) o;

        if (id != that.id) return false;
        if (devname != null ? !devname.equals(that.devname) : that.devname != null) return false;
        if (roominfo != null ? !roominfo.equals(that.roominfo) : that.roominfo != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (coordinate != null ? !coordinate.equals(that.coordinate) : that.coordinate != null) return false;
        if (installPerson != null ? !installPerson.equals(that.installPerson) : that.installPerson != null)
            return false;
        if (installTime != null ? !installTime.equals(that.installTime) : that.installTime != null) return false;
        if (firstrunTime != null ? !firstrunTime.equals(that.firstrunTime) : that.firstrunTime != null) return false;
        if (wetherNormal != null ? !wetherNormal.equals(that.wetherNormal) : that.wetherNormal != null) return false;
        if (wHeartlostTooffline != null ? !wHeartlostTooffline.equals(that.wHeartlostTooffline) : that.wHeartlostTooffline != null)
            return false;
        if (wetherOnline != null ? !wetherOnline.equals(that.wetherOnline) : that.wetherOnline != null) return false;
        if (repower != null ? !repower.equals(that.repower) : that.repower != null) return false;
        if (detailedInfoLinks != null ? !detailedInfoLinks.equals(that.detailedInfoLinks) : that.detailedInfoLinks != null)
            return false;
        if (orderAttime != null ? !orderAttime.equals(that.orderAttime) : that.orderAttime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (devname != null ? devname.hashCode() : 0);
        result = 31 * result + (roominfo != null ? roominfo.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (coordinate != null ? coordinate.hashCode() : 0);
        result = 31 * result + (installPerson != null ? installPerson.hashCode() : 0);
        result = 31 * result + (installTime != null ? installTime.hashCode() : 0);
        result = 31 * result + (firstrunTime != null ? firstrunTime.hashCode() : 0);
        result = 31 * result + (wetherNormal != null ? wetherNormal.hashCode() : 0);
        result = 31 * result + (wHeartlostTooffline != null ? wHeartlostTooffline.hashCode() : 0);
        result = 31 * result + (wetherOnline != null ? wetherOnline.hashCode() : 0);
        result = 31 * result + (repower != null ? repower.hashCode() : 0);
        result = 31 * result + (detailedInfoLinks != null ? detailedInfoLinks.hashCode() : 0);
        result = 31 * result + (orderAttime != null ? orderAttime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "bottomDevinfoByBottomdevId")
    public Collection<DoorDevdataEntity> getDoorDevdatasById() {
        return doorDevdatasById;
    }

    public void setDoorDevdatasById(Collection<DoorDevdataEntity> doorDevdatasById) {
        this.doorDevdatasById = doorDevdatasById;
    }

    @OneToMany(mappedBy = "bottomDevinfoByBottomdevId")
    public Collection<DoorDevstateEntity> getDoorDevstatesById() {
        return doorDevstatesById;
    }

    public void setDoorDevstatesById(Collection<DoorDevstateEntity> doorDevstatesById) {
        this.doorDevstatesById = doorDevstatesById;
    }

    @OneToMany(mappedBy = "bottomDevinfoByBottomdevId")
    public Collection<InfraredDevdataEntity> getInfraredDevdatasById() {
        return infraredDevdatasById;
    }

    public void setInfraredDevdatasById(Collection<InfraredDevdataEntity> infraredDevdatasById) {
        this.infraredDevdatasById = infraredDevdatasById;
    }

    @OneToMany(mappedBy = "bottomDevinfoByBottomdevId")
    public Collection<InfraredDevstateEntity> getInfraredDevstatesById() {
        return infraredDevstatesById;
    }

    public void setInfraredDevstatesById(Collection<InfraredDevstateEntity> infraredDevstatesById) {
        this.infraredDevstatesById = infraredDevstatesById;
    }

    @OneToMany(mappedBy = "bottomDevinfoByBottomdevId")
    public Collection<WindiowDevstateEntity> getWindiowDevstatesById() {
        return windiowDevstatesById;
    }

    public void setWindiowDevstatesById(Collection<WindiowDevstateEntity> windiowDevstatesById) {
        this.windiowDevstatesById = windiowDevstatesById;
    }

    @OneToMany(mappedBy = "bottomDevinfoByBottomdevId")
    public Collection<WindowDevdataEntity> getWindowDevdatasById() {
        return windowDevdatasById;
    }

    public void setWindowDevdatasById(Collection<WindowDevdataEntity> windowDevdatasById) {
        this.windowDevdatasById = windowDevdatasById;
    }
}
