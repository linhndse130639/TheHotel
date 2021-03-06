/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linhnd.dtos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "RoomInHotel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomInHotel.findAll", query = "SELECT r FROM RoomInHotel r")
    , @NamedQuery(name = "RoomInHotel.findByCodeRoom", query = "SELECT r FROM RoomInHotel r WHERE r.roomInHotelPK.codeRoom = :codeRoom")
    , @NamedQuery(name = "RoomInHotel.findByStatusRoom", query = "SELECT r FROM RoomInHotel r WHERE r.statusRoom = :statusRoom")
    , @NamedQuery(name = "RoomInHotel.findByHotelID", query = "SELECT r FROM RoomInHotel r WHERE r.roomInHotelPK.hotelID = :hotelID")
    , @NamedQuery(name = "RoomInHotel.findByIdKindRoom", query = "SELECT r FROM RoomInHotel r WHERE r.roomInHotelPK.idKindRoom = :idKindRoom")})
public class RoomInHotel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RoomInHotelPK roomInHotelPK;
    @Basic(optional = false)
    @Column(name = "statusRoom")
    private String statusRoom;
    @JoinColumn(name = "hotelID", referencedColumnName = "hotelID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hotel hotel;
    @JoinColumn(name = "IdKindRoom", referencedColumnName = "IdKindRoom", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private KindOfRoom kindOfRoom;

    public RoomInHotel() {
    }

    public RoomInHotel(RoomInHotelPK roomInHotelPK) {
        this.roomInHotelPK = roomInHotelPK;
    }

    public RoomInHotel(RoomInHotelPK roomInHotelPK, String statusRoom) {
        this.roomInHotelPK = roomInHotelPK;
        this.statusRoom = statusRoom;
    }

    public RoomInHotel(String codeRoom, String hotelID, String idKindRoom) {
        this.roomInHotelPK = new RoomInHotelPK(codeRoom, hotelID, idKindRoom);
    }

    public RoomInHotelPK getRoomInHotelPK() {
        return roomInHotelPK;
    }

    public void setRoomInHotelPK(RoomInHotelPK roomInHotelPK) {
        this.roomInHotelPK = roomInHotelPK;
    }

    public String getStatusRoom() {
        return statusRoom;
    }

    public void setStatusRoom(String statusRoom) {
        this.statusRoom = statusRoom;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public KindOfRoom getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(KindOfRoom kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomInHotelPK != null ? roomInHotelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomInHotel)) {
            return false;
        }
        RoomInHotel other = (RoomInHotel) object;
        if ((this.roomInHotelPK == null && other.roomInHotelPK != null) || (this.roomInHotelPK != null && !this.roomInHotelPK.equals(other.roomInHotelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "linhnd.dtos.RoomInHotel[ roomInHotelPK=" + roomInHotelPK + " ]";
    }
    
}
